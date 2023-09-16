package core;

import java.util.ArrayList;
import java.util.List;

import vacancies.Vacancy;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, Vacancy vacancy) {
        ArrayList<Observer> accepted = new ArrayList<>();

        System.out.println(vacancy);

        for (Observer observer : observers) {
            if (observer.getPreference().contains(vacancy.getSpecialization())
                    || observer.getPreference().get(0) == "All") {
                boolean isAccepted = observer.receiveOffer(companyName, vacancy);

                if (isAccepted) {
                    accepted.add(observer);
                }
            }
        }
        removeObserver(accepted);
        System.out.println("----------------");
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ArrayList<Observer> accepted) {
        if (accepted.size() > 0) {
            for (Observer observer : accepted) {
                observers.remove(observer);
            }
        }
    }
}
