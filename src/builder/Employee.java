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
