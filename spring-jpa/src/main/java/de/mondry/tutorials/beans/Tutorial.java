package de.mondry.tutorials.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tutorials_tbl")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tutorial_id;
	@Column(name = "tutorial_title")
	private String tutorialTitle;
	private String tutorial_author;
	private Date submission_date;

	public Integer getTutorial_id() {
		return tutorial_id;
	}

	public void setTutorial_id(Integer tutorial_id) {
		this.tutorial_id = tutorial_id;
	}

	public String getTutorial_author() {
		return tutorial_author;
	}

	public void setTutorial_author(String tutorial_author) {
		this.tutorial_author = tutorial_author;
	}

	public Date getSubmission_date() {
		return submission_date;
	}

	public void setSubmission_date(Date submission_date) {
		this.submission_date = submission_date;
	}

	public String getTutorialTitle() {
		return tutorialTitle;
	}

	public void setTutorialTitle(String tutorialTitle) {
		this.tutorialTitle = tutorialTitle;
	}

	@Override
	public String toString() {
		return "Tutorial [tutorial_id=" + tutorial_id + ", tutorialTitle="
				+ tutorialTitle + ", tutorial_author=" + tutorial_author
				+ ", submission_date=" + submission_date + "]";
	}

}
