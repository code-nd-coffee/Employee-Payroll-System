public class Main {
    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Shivi", 1, 75000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Shivam", 2, 300, 500);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Birju", 3, 200, 250);

        payrollSystem.addEmployee(fullTimeEmployee);
        payrollSystem.addEmployee(partTimeEmployee);
        payrollSystem.addEmployee(partTimeEmployee2);

        System.out.println("Employees Details: ");
        payrollSystem.displayEmployee();
        System.out.println();
        System.out.println("Removing Employee");
        payrollSystem.removeEmployee(3);
        System.out.println();
        System.out.println("Employees Details: ");
        payrollSystem.displayEmployee();

    }
}