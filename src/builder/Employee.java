package builder;

public class Employee {

    private String name;
    private String empId;

    public Employee(EmployeeBuilder empBuilder){
        this.name=empBuilder.name;
        this.empId=empBuilder.empId;
    }

    public static class EmployeeBuilder {

        private String name;
        private String empId;


        public EmployeeBuilder buildName(String name){
            this.name=name;
            //  In Java, a static nested class can use this keyword within its instance methods to
            //  refer to its own instance. However, it does not have access to an enclosing instance of the
            //  outer class (since it is static), so OuterClass.this is invalid. Here's a breakdown:
            //  this is not allowed in static methods of the static nested class.
            return this;
        }

        public EmployeeBuilder buildEmpId(String empId){
            this.empId=empId;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
