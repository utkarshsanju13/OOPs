package Java8Feature.Streams;

import java.util.*;
import java.util.stream.Collectors;



public class CollectorsClassFunction {

    public static void main(String[] args) {


        List<Person> listOfPerson = new ArrayList<>();
        Department It= new Department("IT");
        Department Cse= new Department("CSE");

        Person p1 = new Person("abhay",20,It);
        Person p2 = new Person("sonu",21,It);
        Person p3 = new Person("monu",22,It);
        Person p4 = new Person("utkarsh",24,Cse);
        listOfPerson.add(p1);
        listOfPerson.add(p2);
        listOfPerson.add(p3);
        listOfPerson.add(p4);


        //Accumulate the list by person name
        List<String> listbypersonname = listOfPerson.stream()
                .map(Person::getName).
                sorted(String::compareTo).
                collect(Collectors.toList());

        System.out.println(listbypersonname);

         // Convert elements to strings and concatenate them, separated by commas
        String joined =listOfPerson.stream()
                .map(Person::getName)
                .collect(Collectors.joining(","));

        System.out.println(joined);

        //Sum of salaries of all the person
        Integer sumOfallSalaries = listOfPerson.stream()
                .collect(Collectors.summingInt(Person::getSalary));

        System.out.println(sumOfallSalaries);

        //Group the person by department
        Map<Department,List<Person>> departwisepersonlist = listOfPerson.stream()
                .collect(Collectors.groupingBy(Person::getDepartment));

//        System.out.println(departwisepersonlist);
        for (Map.Entry<Department, List<Person>> entry : departwisepersonlist.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Sum of salary departemnt wise
        Map<Department,Integer> sumOFSalDeperatmentwise = listOfPerson.stream()
                .collect(Collectors.groupingBy(Person::getDepartment,Collectors.summingInt(Person::getSalary)));

        for(Map.Entry<Department,Integer> entry: sumOFSalDeperatmentwise.entrySet()){
            System.out.println(entry.getKey() + " -->"+ entry.getValue());
        }

        //  // Partition person on the basis of salary greater and less than 21
        Map<Boolean, List<Person>> personSalarygreaterThan21 =
                listOfPerson.stream()
                        .collect(Collectors.partitioningBy(s -> s.getSalary() > 21));

        for(Map.Entry<Boolean,List<Person>> entry: personSalarygreaterThan21.entrySet()) {
            System.out.println(entry.getKey() + " -->" + entry.getValue());
        }
    }
}
