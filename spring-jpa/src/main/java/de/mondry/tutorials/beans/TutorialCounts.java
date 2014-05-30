package de.mondry.tutorials.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TutorialCounts {

    @Id
    @Column(name = "tutorial_author")
    private String tutorialAuthor;
    @Column(name = "tutorial_count")
    private Integer tutorialCount;

    public String getTutorialAuthor() {
        return tutorialAuthor;
    }

    public void setTutorialAuthor(String tutorialAuthor) {
        this.tutorialAuthor = tutorialAuthor;
    }

    public Integer getTutorialCount() {
        return tutorialCount;
    }

    public void setTutorialCount(Integer tutorialCount) {
        this.tutorialCount = tutorialCount;
    }

}
