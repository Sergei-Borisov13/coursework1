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
// удаление сотрудника
        employee.removeEmployee("Борисов Сергей Олегович");
        printSeparator();
// печать всех сотрудников
        employee.printEmployee();
        printSeparator();
// печать ФИО сотрудников
        employee.printFioEmployee();
        printSeparator();
// затраты в месяц
        System.out.println("Затраты в месяц - " + employee.findCostWages() + "рублей");
        printSeparator();
// средня зп
        System.out.println("Средняя зарплата в месяц - " + employee.averageSalary());
        printSeparator();
// min зп
        System.out.println("Минимальная зарплата - " + employee.minSalary());
        printSeparator();
// max зп
        System.out.println("Максимальная зарплата - " + employee.maxSalary());
        printSeparator();


    }
}