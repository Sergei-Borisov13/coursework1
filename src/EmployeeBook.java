public class EmployeeBook {
    private final Employee[] employees;
    private final Integer DEPARTAMENT_SIZE = 5;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public int getSize() {
        return this.size = size;
    }

    // печать всех сотрудников
    public void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // печать ФИО сотрудников
    public void printFioEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }

    // затраты в месяц на зарплату
    public float findCostWages() {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    //средняя зп в месяц
    public float averageSalary() {
        float sum = findCostWages() / getSize();
        return sum;
    }

    // min ЗП
    public void minSalary() {
        float minSalary = employees[0].getSalary();
        String minFio = "";
        for (int i = 0; i < getSize(); i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                minFio = employees[i].getFIO();
            }
        }
        System.out.println("Минимальная зарплата - " + minFio + " " + minSalary);
    }

    // max зп
    public void maxSalary() {
        float maxSalary = employees[0].getSalary();
        String maxFio = "";
        for (int i = 0; i < getSize(); i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                maxFio = employees[i].getFIO();
            }
        }
        System.out.println("Максимальная зарплата - " + maxFio + " " + maxSalary);
    }


    // индексация ЗП
    public void indexationSalary(int percent) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * (percent / 100f * 1)));
        }
    }

    // сотрудник с минимальной ЗП в отделе
    public Employee minOfDepartamentSalary(int departament) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != departament) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // сотрудник с максимальной ЗП в отделе
    public Employee maxOfDepartamentSalary(int departament) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != departament) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // сумма затрат по отделу
    public float findCostWagesOfDepartement(int departamint) {
        float sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departamint) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    // средняя ЗП по отделу
    public float averageSalaryOfDepartament(int departament) {
        int numberStaff = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departament) {
                sum += employee.getSalary();
                numberStaff++;
            }
        }
        return sum / (float) numberStaff;
    }

    // индексация зп в отделе
    public void indexationSalaryOfDepartament(int departament, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departament) {
                employee.setSalary((int) (employee.getSalary() * (percent / 100f * 1)));
            }
        }
    }

    // печать сотрудников отдела
    public void printFioEmployeeOfDepartament(int departament) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departament) {
                System.out.println(employee.toStringNotDepartament());
            }
        }
    }

    // сотрудник с ЗП меньше заданной
    public void printEmployeesLessSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.getId() + " " + employee.getFIO() + " " + employee.getSalary());
            }
        }
    }

    // сотрудник с ЗП больше заданной
    public void printEmployeesMoreSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " " + employee.getFIO() + " " + employee.getSalary());
            }
        }
    }

    // изменение ЗП сотрудника
    public void changeSalary(String fio, int salary) {
        for (Employee employee : employees) {
            if (employee.getFIO().equals(fio)) {
                employee.setSalary(salary);
            }
        }
    }

    // изменение отдела
    public void changeDepartament(String fio, int departament) {
        for (Employee employee : employees) {
            if (employee.getFIO().equals(fio)) {
                employee.setDepartment(departament);
            }
        }
    }

    // печать сотрудников по отделам
    public void printFioEmployeeByDepartament() {
        for (int i = 1; i <= DEPARTAMENT_SIZE; i++) {
            System.out.println("Отдел - " + i + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i) {
                    System.out.println("ФИО: " + employee.getFIO() + ", Зарплата: " + employee.getSalary());
                }
            }
        }

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