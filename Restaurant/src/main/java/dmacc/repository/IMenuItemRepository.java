package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.MenuItem;


/**
 * @author Jeff Johnson - jjohnson190
 * CIS175 - Spring 2024
 * Feb 29, 2024
 */

@Repository
public interface IMenuItemRepository extends JpaRepository<MenuItem, Integer>{

	
	
}
