package applicants;

import java.util.ArrayList;

import core.Observer;
import vacancies.Vacancy;

public class Applicant implements Observer {
    private String name;
    private int salary;
    private ArrayList<String> preference;

    public Applicant(String name, int salary, ArrayList<String> preference) {
        this.name = name;
        this.salary = salary;
        this.preference = preference;
    }

    public ArrayList<String> getPreference(){
        return this.preference;
    }

    public String getName(){
        return this.name;
    }

    public boolean receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            System.out.printf(
                    "%s (Квалификация: %s): Я согласен!Меня устраивает З/П! (Кампания: \"%s\" | Должность: %s | З/П: %d)\n",
                    this.name, this.getClass().getSimpleName(), nameCompany, vacancy.getSpecialization(),
                    vacancy.getSalary());

            return true;
        } else {
            System.out.printf(
                    "%s (Квалификация: %s): Я отказываюсь!Слишком низкая З/П! (Кампания: \"%s\" | Должность: %s | З/П: %d)\n",
                    this.name, this.getClass().getSimpleName(), nameCompany, vacancy.getSpecialization(),
                    vacancy.getSalary());

            return false;
        }
    }
}
