public class Employee {
    private final String FIO;
    private int department;
    private int salary;
    private static int counter;
    private int id;


    // конструктор
    public Employee(String FIO, int department, int salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        id = ++counter;

    }

    // геттеры
    public int getId() {
        return this.id = id;
    }
    public String getFIO() {
        return FIO;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    // сеттеры
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id:" + id +  ", ФИО: " + FIO + ", Отдел: " + department + ", Зарплата в месяц: " + salary;
    }
}
