package selfwork.task2;

class Staff extends Person {

    String specialisation;
    double salary;

    public Staff(String specialisation, double salary) {
        this.specialisation = specialisation;
        this.salary = salary;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

}
