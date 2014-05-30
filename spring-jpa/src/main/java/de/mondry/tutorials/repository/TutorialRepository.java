package de.mondry.tutorials.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.mondry.tutorials.beans.Tutorial;

public interface TutorialRepository extends CrudRepository<Tutorial, Integer> {

	List<Tutorial> findByTutorialTitle(String tutorialTitle);
}
