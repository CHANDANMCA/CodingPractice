import java.util.*;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        Employee emp = new Employee(new Address("kendrapara", "odisha", 754244), "HR", 1, "chandan", 46000);
        Employee emp2 = new Employee(new Address("UttamNagar", "Delhi", 122976), "IT", 2, "mukesh", 30300);
        Employee emp3 = new Employee(new Address("arabinda Colony", "gujarat", 232132), "HR", 3, "chandan", 92000);
        Employee emp4 = new Employee(new Address("amrit sahar", "gujarat", 754243), "IT", 4, "anil", 65400);
        Employee emp5 = new Employee(new Address("Bhubaneswar", "odisha", 754245), "MANAGER", 5, "gaura", 23000);
        Employee emp6 = new Employee(new Address("cattack", "odisha", 123456), "HR", 6, "adhir", 67030);
        Employee emp7 = new Employee(new Address("bangalore", "karnatak", 345908), "IT", 7, "anirudh", 30200);
        Employee emp8 = new Employee(new Address("mysore", "karnatak", 321980), "HR", 8, "biswa", 19099);
        Employee emp9 = new Employee(new Address("ashram", "delhi", 953245), "MANAGER", 9, "nirmal", 75000);
        List<Employee> list = Arrays.asList(emp, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9);
        //  list.stream().map(Employee::getDept).distinct().forEach(System.out::println);
        // list.stream().filter(p->"kendrapara".equalsIgnoreCase(p.getAddress().getCity())).collect(Collectors.toSet()).forEach(System.out::println);

        //  list.stream().filter(l->l.getAddress().getState().startsWith("odisha")).collect(Collectors.toList()).forEach(System.out::println);

        // Employee employee = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
//        list.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(
//                Employee::getSalary)))).forEach((dept, name) -> name.ifPresent(e -> System.out.println(dept + "->" + e.getName() + "->" + e.getSalary())));


        // list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::print);

        //  Hr-{ 3-{ empName,empname2,empneame3}}
        //  it-{emp1,emp2,emp3};

        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDept));


        collect.forEach((dept, empList) -> {
                    System.out.print(dept+"-");
                    System.out.print(empList.size()+"-");
                    System.out.print(empList.stream().map(Employee::getName).collect(Collectors.toList()));
                }
        );

    }

}
