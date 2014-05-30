package de.mondry.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.mondry.tutorials.beans.Tutorial;
import de.mondry.tutorials.service.TutorialService;
import de.mondry.tutorials.service.TutorialsCountService;

public class TestSpringJpa {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context/appContext.xml");
        TutorialService tutService = context.getBean("tutorialService", TutorialService.class);
        Tutorial tut = tutService.findById(1);
        System.out.println(tut);

        // Iterable<Tutorial> findAll = repository.findAll();
        // ==================================

        TutorialsCountService tutorialsCountService = context.getBean("tutorialsCountService", TutorialsCountService.class);
        System.out.println(tutorialsCountService);

        context.close();

    }

}
