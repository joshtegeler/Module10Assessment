package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Phone;
import dmacc.repository.PhoneRepository;

/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Mar 27, 2024
 */


@Controller
public class WebController {
    @Autowired
    PhoneRepository repo;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/viewAll")
    public String viewAllPhones(Model model) {
        if(repo.findAll().isEmpty()) {
            return addNewPhone(model);
        }
        
        model.addAttribute("phones", repo.findAll());
        return "results";
    }

    @GetMapping("/inputPhone")
    public String addNewPhone(Model model) {
        Phone p = new Phone();
        model.addAttribute("newPhone", p);
        return "input";
    }

    @GetMapping("/edit/{id}")
    public String showUpdatePhone(@PathVariable("id") long id, Model model) {
        Phone p = repo.findById(id).orElse(null);
        System.out.println("ITEM TO EDIT: " + p.toString());
        model.addAttribute("newPhone", p);
        return "input";
    }

    @PostMapping("/update/{id}")
    public String revisePhone(@PathVariable("id") long id, Phone p, Model model) {
        p.setId(id); // Make sure the ID is set to the correct value
        repo.save(p);
        return "redirect:/viewAll"; // Redirect to view all phones after update
    }
    
    @GetMapping("/delete/{id}")
    public String deletePhone(@PathVariable("id") long id, Model model) {
        repo.deleteById(id);
        return "redirect:/viewAll"; // Redirect to view all phones after deletion
    }
}

