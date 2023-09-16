package companies;
import core.Publisher;
import vacancies.VacanciesFactory;

public class Company {
    VacanciesFactory vacanciesFactory = new VacanciesFactory();
    
    private String name;
    private Publisher jobAgency;

    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        jobAgency.sendOffer(name, vacanciesFactory.generateVacancy());
    }


}
