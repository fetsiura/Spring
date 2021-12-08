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

        employees.stream()
                .filter( employee -> employee.getLastName().startsWith("N"))
                .forEach(System.out::println);

        System.out.println("----------------");

        Integer currentYear = Year.now().getValue();
        employees.stream()
                .filter( employee ->  (currentYear-employee.getYearOfBirth())>29 && (currentYear-employee.getYearOfBirth()<46))
                .forEach(System.out::println);

        System.out.println("----------------");

        employees.stream()
                .filter( employee -> employee.getGender() =='K')
                .filter(employee -> (currentYear-employee.getYearOfBirth()>19 && currentYear-employee.getYearOfBirth()<31))
                .filter(employee -> employee.getSalary() < 3500)
                .peek(employee -> employee.setSalary(employee.getSalary()*1.05))
                .forEach(System.out::println);
    }
}
