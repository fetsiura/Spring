package pl.coderslab.advanced.stream;

import java.time.Year;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Leszek", "N", 'M', 1985, 5000.00),
                new Employee("Marian", "W", 'M', 1976, 2500.00),
                new Employee("Ilona", "Z", 'K', 2003, 10_000.00),
                new Employee("Zofia", "S", 'K', 1994, 2900.00)
        );

        //     wypisz na ekranie wszystkich pracowników, których nazwisko zaczyna się na literę „N”

        employees.stream()
                .filter(emp -> emp.getLastName().startsWith("N"))
                .forEach(System.out::println);

        //    wypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat

        Integer currentYear = Year.now().getValue();
        employees.stream()
                .filter(emp -> currentYear - emp.getYearOfBirth() <= 45 && currentYear - emp.getYearOfBirth() >= 30)
                .forEach(System.out::println);

        //    daj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, a ich wynagrodzenie jest nie wyższe niż 3500 zł.

        employees.stream()
                .filter(emp -> emp.getGender() == 'K')
                .filter(emp -> emp.getSalary() <= 3500)
                .filter(emp -> currentYear - emp.getYearOfBirth() <= 30 && currentYear - emp.getYearOfBirth() >= 20)
                .peek(emp -> emp.setSalary(emp.getSalary() * 1.05))
                .forEach(System.out::println);

        employees.stream()
                .filter(Main02::onlyWomenBetween20And30YearsOldWithSalaryBelow3000)
                .forEach(System.out::println);

    }

    private static boolean onlyWomenBetween20And30YearsOldWithSalaryBelow3000(Employee employee) {
        int currentYear = Year.now().getValue();
        return employee.getGender() == 'K'
                && employee.getSalary() <= 3000
                && (currentYear - employee.getYearOfBirth()) >= 20
                && (currentYear - employee.getYearOfBirth()) <= 30;
    }
}
