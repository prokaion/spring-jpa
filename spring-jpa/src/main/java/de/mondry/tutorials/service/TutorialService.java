package de.mondry.tutorials.service;

import de.mondry.tutorials.beans.Tutorial;
import de.mondry.tutorials.repository.TutorialRepository;

public class TutorialService {

    private TutorialRepository tutorialRepository;

    public TutorialService(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    public Tutorial findById(Integer id) {
        return tutorialRepository.findOne(id);
    }

}
