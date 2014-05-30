/**
 * 
 */
package de.mondry.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import de.mondry.tutorials.beans.TutorialCounts;

/**
 * @author daniel
 *
 */
public interface TutorialCountsRepository extends CrudRepository<TutorialCounts, String> {

}
