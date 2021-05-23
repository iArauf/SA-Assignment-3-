public class MVCPatternDemo {
    public static void main(String[] args) {

        Employee employeeModel = retriveEmployeeFromDatabase();

        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);

        employeeModel.setFirstName("Hamza");
        employeeModel.setSalary((float) 5000.00);
        employeeController.updateView();


    }

        private static Employee retriveEmployeeFromDatabase(){
            Employee employee = new Employee();
            employee.setEmployeeID(001);
            employee.setFirstName("Abdul Rauf");
            employee.setLastName("Rauf");
            employee.setGender("Male");
            employee.setHiredDate("4/May/2020");
            employee.setSalary((float) 50000.00);
            return employee;
        }
}
