public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public int getSize() {
        return this.size = size;
    }

    // печать всех сотрудников
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    // печать ФИО сотрудников
    public void printFioEmployee() {
        for (int i = 0; i < size; i++) {
            String fio = employees[i].getFIO();
            System.out.println(fio);
        }
    }
// затраты в месяц на зарплату
    public float findCostWages() {
        float sum = 0;
        for (int i = 0; i < getSize(); i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        return sum;
    }
//средняя зп в месяц
    public float averageSalary() {
        float sum = 0;
        for (int i = 0; i < getSize(); i++) {
            Employee employee = employees[i];
            sum += employee.getSalary() / getSize();
        }
        return sum;
    }
// min ЗП
    public float minSalary() {
        float minSalary = employees[0].getSalary();
        for (int i = 0; i < getSize(); i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }
// max зп
public float maxSalary() {
    float maxSalary = employees[0].getSalary();
    for (int i = 0; i < getSize(); i++) {
        if (maxSalary < employees[i].getSalary()) {
            maxSalary = employees[i].getSalary();
        }
    }
    return maxSalary;
}

    // добавление сотрудника
    public void addEmployee(String FIO, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, места нет");
        }
        Employee newEmployee = new Employee(FIO, department, salary);
        employees[size++] = newEmployee;
    }

    // удаление сотрудников
    public void removeEmployee(String FIO) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFIO().equals(FIO)) {
                System.out.println(employees[i].getFIO() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }
}