package java8;

import java.util.*;
import java.util.function.Function;
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


        Map<Boolean, List<Employee>> agegreaterthan30 = employeeList.stream().collect(Collectors.partitioningBy(s -> s.getAge() > 30));
        System.out.println("agegreaterthan30-"+agegreaterthan30.get(true));
        
        Map<Boolean, List<Employee>> agelessthan30 = employeeList.stream().collect(Collectors.partitioningBy(s -> s.getAge() < 30));
        
        System.out.println("age less than " + agelessthan30.get(true));
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        
        List<Integer> evennums = numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        
        System.out.println("evennums " + evennums);
        
        List<String> toUpperCaseEle = Arrays.asList("kishore", "kamalay");
        
        List<String> result = toUpperCaseEle.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        
        System.out.println("result " + result);
        
        
        // FlatMap Example -- start
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );
        
        List<Integer> resultFlat = list.stream().flatMap(x -> x.stream().map(p -> p * 2)).collect(Collectors.toList());
        
        System.out.println("resultFlat" + resultFlat);
        // FlatMap Example -- end
        
        // Second Highest Number
        
        List<Integer> listSecond = Arrays.asList(10, 20, 30, 40, 40, 30);
        
        Integer secondHighest = listSecond.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        
        System.out.println("second Highest " + secondHighest);
        
        // End of Second Highest Number
        
        // Find k smallest
        
        int k = 3;
        
        List<Integer> listkthsmallest = Arrays.asList(1,4,2,3,6,5,9,8);
                                                      //1,2,3,4,5,6,8,9
        
        Integer kthsmallest = listkthsmallest.stream().sorted().skip(k - 1).findFirst().orElse(null);
        
        System.out.println("kth smallest element " + kthsmallest);
        
        // End of kth smallest
        
        // Find Duplicate elemt Java8
        
        List<Integer> listDuplicate = Arrays.asList(1,2,3,4,5,6,6,5);
        
        List<Integer> findDuplicate = listDuplicate.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                                .entrySet().stream().filter(s -> s.getValue() > 1) .map(s -> s.getKey())
                                                .collect(Collectors.toList());
        
        System.out.println("find Duplicates " + findDuplicate);
        
        // Sort By age using stream
        List<Employee> sortByAge = employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        
        List<Employee> clonedList = new ArrayList<>(employeeList);
        
        // Sort By age using Collections
        Collections.sort(employeeList, (a, b) -> {
          return  a.getAge() - b.getAge();
        });
        
        System.out.println("sortByAge employeelist" + employeeList);
        
        
        System.out.println("sortByAge " + sortByAge);
        
        // Reduce method Java8
        
        List<Integer> reduceExample = Arrays.asList(1, 2, 3, 4, 5);
        
        int resultReduce = reduceExample.stream().reduce(0, (a, b) -> a + b);
        
        System.out.println("result Reduce " + resultReduce);
        
    }

}
