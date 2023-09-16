package vacancies;

import java.util.Random;

public class VacanciesFactory {

    private Random random = new Random();

    public Vacancy generateVacancy() {
        int salary = 0;
        VacanciesType vacanciesType = getRandomVacancyType();

        switch (vacanciesType) {
            case WebDeveloper:
                salary = random.nextInt(80_000, 120_000);
                return new WebDeveloper(salary);
            case HandyMan:
                salary = random.nextInt(40_000, 80_000);
                return new HandyMan(salary);
            case Cleaner:
                salary = random.nextInt(25_000, 40_000);
                return new Cleaner(salary);
        }

        return null;
    }

    private VacanciesType getRandomVacancyType() {

        int randomType = random.nextInt(0, VacanciesType.values().length);

        return VacanciesType.values()[randomType];
    }
}
