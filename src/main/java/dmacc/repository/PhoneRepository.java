package dmacc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Phone;

/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */


/**
 * @author joshtegeler - jmtegeler
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> { }
