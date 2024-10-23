package people;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa","Finland",52);
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki", "Finland", 24);
        System.out.println(pekka);
        System.out.println(esko);
        System.out.println("\n");

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", "Finland", 21, 12403);
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
        System.out.println("\n");

        Teacher pekka2 = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", "Finland", 45, 1200);
        Teacher esko2 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", "Finland", 36, 5400);
        System.out.println( pekka2);
        System.out.println( esko2 );

        Student olli2 = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki", "Finland", 20,38502);
        for ( int i=0; i < 25; i++ ) {
            olli2.study();
        }
        System.out.println( olli2 );
        System.out.println("credits: " + olli2.credits());
        System.out.println("grades: " );
        System.out.println("\n");

        List<Person> people = new ArrayList<>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", "Finland", 45, 1200));
        people.add(new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki", "Finland", 20, 40234));
        printDepartment(people);

        System.out.println("\n");
        olli2.addGrade(6);
        olli2.addGrade(8);
        System.out.print(" Grades: ");
        olli2.getGrade();

    }

    public static void printDepartment(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}



