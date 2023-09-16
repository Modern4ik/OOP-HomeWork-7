package core;
import java.util.ArrayList;

import vacancies.Vacancy;

public interface Publisher {

    void sendOffer(String companyName, Vacancy vacancy);

    void registerObserver(Observer observer);
    void removeObserver(ArrayList<Observer> accepted);

}
