public class Main {
    public static void printSeparator() {
        System.out.println("====================");
    }

    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook();
// добавление сотрудников
        employee.addEmployee("Борисов Сергей Олегович", 1, 100000);
        employee.addEmployee("Борисова Ангелина Витальевна", 1, 90000);
        employee.addEmployee("Устинов Ермак Александрович", 2, 108563);
        employee.addEmployee("Суворов Сергей Павлович", 2, 87156);
        employee.addEmployee("Логинова Евгения Еремеевна", 3, 110263);
        employee.addEmployee("Корнилова Бронислава Эдуардовна", 3, 98365);
        employee.addEmployee("Селиверстов Арнольд Глебович", 4, 137542);
        employee.addEmployee("Сорокина Тала Авксентьевна", 4, 125600);
        employee.addEmployee("Иванов Иван Иванович", 5, 121600);
        employee.addEmployee("Васильев Василий Васильевич", 5, 122700);
// печать всех сотрудников
        employee.printEmployee();
        printSeparator();
// печать ФИО сотрудников
        employee.printFioEmployee();
        printSeparator();
// затраты в месяц
        System.out.println("Затраты в месяц - " + employee.findCostWages() + " рублей");
        printSeparator();
// средня зп
        System.out.println("Средняя зарплата в месяц - " + employee.averageSalary() + " рублей");
        printSeparator();
// min зп
        employee.minSalary();
        printSeparator();
// max зп
        employee.maxSalary();
        printSeparator();
// печать сотрудников по отделу
        employee.printFioEmployeeByDepartament();
        printSeparator();
// сотрудники с ЗП меньше
        employee.printEmployeesLessSalary(110000);
        printSeparator();
// сотрудники с ЗП больше
        employee.printEmployeesMoreSalary(110000);
        printSeparator();
// печать сотрудников отдела
        employee.printFioEmployeeOfDepartament(1);
        printSeparator();
// средняя зп по отделу
        System.out.println(employee.averageSalaryOfDepartament(2));
        printSeparator();
    }
}