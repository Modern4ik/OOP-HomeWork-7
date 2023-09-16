import java.util.ArrayList;
import java.util.List;

import applicants.Master;
import applicants.Specialist;
import applicants.Student;
import companies.Company;
import core.JobAgency;
import core.Publisher;

public class Program {
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company geekBrains = new Company("GeekBrains", jobAgency);

        Student student1 = new Student("Petrov", 15000, new ArrayList<>(List.of("All")));
        Specialist specialist1 = new Specialist("Ivanov", 50000, new ArrayList<>(List.of("HandyMan")));
        Master master1 = new Master("Zaycev", 80_000, new ArrayList<>(List.of("WebDeveloper")));

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(specialist1);
        jobAgency.registerObserver(master1);

        google.needEmployee();
        yandex.needEmployee();
        geekBrains.needEmployee();

    }
}