class Employee{ 
    ... 
    int payAmount() { 
        switch (getType()) { 
            case EmployeeType.ENGINEER: 
                return _monthlySalary; 
            case EmployeeType.SALESMAN: 
                return _monthlySalary + _commission; 
            case EmployeeType.MANAGER: 
                return _monthlySalary + _bonus; 
            default: 
            throw new Exception("Incorrect Employee"); 
        } 
    } 
} 
