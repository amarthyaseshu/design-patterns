package builder;

public class BuilderMain {

    public static void main(String[] args) {
        Employee emp= new Employee.EmployeeBuilder().buildName("amar").buildEmpId("123").build();
    }
}
