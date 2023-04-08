package presentation;

import metier.UC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresenSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
        UC uc=context.getBean(UC.class);
        uc.printData("Votre réponse est : ");
        System.out.println(uc.readData());
    }
}
