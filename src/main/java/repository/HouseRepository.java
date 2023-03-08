/**
 * @author Chance - cbenna
 * CIS175 - Spring 2023
 * Mar 7, 2023
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beans.House;

/**
 * @author Chance
 *
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

}
