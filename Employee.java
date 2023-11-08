public class Employee {

    private int getMonthlySalary() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private int getCommission() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private int getBonus() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    abstract class EmployeeType {
        abstract int payAmount(Employee emp);
    }
    class Salesman {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getCommission();
        }
    }
    class Manager {
        int payAmount(Employee emp) {
            return emp.getMonthlySalary() + emp.getBonus();
        }
    }
}