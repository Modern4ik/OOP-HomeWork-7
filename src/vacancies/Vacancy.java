package vacancies;

public abstract class Vacancy {
    protected String specialization;
    protected int salary;

    public Vacancy(String specialization, int salary){
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization(){
        return this.specialization;
    }

    public int getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return String.format("Специальность: %s | З/П: %d", this.specialization, this.salary);
    }
}
