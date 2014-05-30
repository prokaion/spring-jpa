/**
 * 
 */
package de.mondry.tutorials.service;

import de.mondry.tutorials.beans.TutorialCounts;
import de.mondry.tutorials.repository.TutorialCountsRepository;

/**
 * @author daniel
 *
 */
public class TutorialsCountService {
    private TutorialCountsRepository tutorialCountsRepository;

    /**
     * @param tutorialCountsRepository
     */
    public TutorialsCountService(TutorialCountsRepository tutorialCountsRepository) {
        this.tutorialCountsRepository = tutorialCountsRepository;
    }

    public void insert(TutorialCounts tutorialCounts) {
        tutorialCountsRepository.save(tutorialCounts);
    }
}
