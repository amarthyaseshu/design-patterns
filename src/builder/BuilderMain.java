package builder;

public class BuilderMain {

    public static void main(String[] args) {
        // Each setter like method returns Employee.EmployeeBuilder
        //Employee.EmployeeBuilder emp1= new Employee.EmployeeBuilder().buildName("amar");
        Employee emp= new Employee.EmployeeBuilder().buildName("amar").buildEmpId("123").build();
    }
}
