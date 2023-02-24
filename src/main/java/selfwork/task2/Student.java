package selfwork.task2;

class Student extends Person {

    private String typeOfStudies;
    private int yearOfStudies;
    private double studiesPrice;

    public Student(String typeOfStudies, int yearOfStudies, double studiesPrice) {
        super();
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudies = yearOfStudies;
        this.studiesPrice = studiesPrice;
    }

    public String getTypeOfStuies() {
        return typeOfStudies;
    }

    public void setTypeOfStuies(String typeOfStuies) {
        this.typeOfStudies = typeOfStuies;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public double getStudiesPrice() {
        return studiesPrice;
    }

    public void setStudiesPrice(double studiesPrice) {
        this.studiesPrice = studiesPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address= " + address + '\'' +
                ", typeOfStuies='" + typeOfStudies + '\'' +
                ", yearOfStudies=" + yearOfStudies + '\'' +
                ", priseOfStudies=" + studiesPrice +
                '}';
    }
}
