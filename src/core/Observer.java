package core;

import java.util.ArrayList;

import vacancies.Vacancy;

public interface Observer {

    ArrayList<String> getPreference();

    String getName();

    boolean receiveOffer(String nameCompany, Vacancy vacancy);

}
