package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee(1, "kishore", 34, "IT");

        Employee emp2 = new Employee(2, "kamalay", 33, "Mech");

        Employee emp3 = new Employee(3, "swati", 26, "CSE");

        Employee emp4 = new Employee(4, "surajkar", 24, "ECE");

        Employee emp5 = new Employee(5, "kamalay123", 27, "ECE");

        Employee emp6 = new Employee(6, "kishore123", 27, "CSE");



        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);


        // Map Example
        List<Integer> listAllAge = employeeList.stream().map(s1 -> s1.getAge()).collect(Collectors.toList());
        System.out.println(listAllAge);

        //Filter Example  starts with K
        List<Employee> listAllEmployeesStartswithK = employeeList.stream().filter(s1 -> s1.getName().startsWith("k")).collect(Collectors.toList());
        System.out.println(listAllEmployeesStartswithK);

        // Groupingby
        Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println("map--"+map);

        // partitioned by
        Map<Boolean, List<Employee>> map1 = employeeList.stream().collect(Collectors.partitioningBy( s -> s.getName().startsWith("k")));
        System.out.println("map1-startswithK-"+map1.get(true));







    }

}
