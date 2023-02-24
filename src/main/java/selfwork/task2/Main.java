package selfwork.task2;

public class Main {
    public static void main(String[] args) {
       Person student = new Student( "IT", 2, 370.00);
       Person staff = new Staff("Programming", 8300.00);

        System.out.println(staff);
        System.out.println(student);
    }
}
