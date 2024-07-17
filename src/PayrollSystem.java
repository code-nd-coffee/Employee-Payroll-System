import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employees> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employees employees){
        employeeList.add(employees);
    }

    public void removeEmployee(int id){
        Employees employeeToRemove = null;
        for (Employees employee: employeeList) {
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for (Employees employee : employeeList) {
            System.out.println(employee);
        }
    }
}
