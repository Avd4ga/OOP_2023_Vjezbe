package LabWeek4.People;

import java.util.ArrayList;
import java.util.List;



        

public class Main {

    public static void printDepartment(List<Person> people){

        for (Person p : people) {

            System.out.println(p);
            
        }

    }

    public static void main(String[] args) {
        
        
        
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());

        olli.showGrades();
        olli.addGrade(5);
        olli.addGrade(-31);
        olli.addGrade(8);
        olli.showGrades();

        Teacher pek = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esk = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pek );
        System.out.println( esk );

        List<Person> people = new ArrayList<>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );


        printDepartment(people);


        

    }

}
