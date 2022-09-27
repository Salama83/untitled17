package interfaces;

import models.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class OperationImpl implements Operation {

    Employee employee1 = new Employee("Айдар" , 73);
    Employee employee2 = new Employee("Анвар" , 15);
    Employee employee3 = new Employee("Нурс" , 23);
    Employee employee4 = new Employee("Дони" , 54);
    Employee employee5 = new Employee("Дося" , 32);

    ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(employee1,employee2,employee3,employee4,employee5));

    @Override
    public Employee[] getSort() {
        int sort = 0;
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = 0; j < employees.size() - 1; j++) {
                if (employees.get(j).getAge() > employees.get(j + 1).getAge()) {
                    sort = employees.get(j + 1).getAge();
                    employees.get(j + 1).setAge(employees.get(j).getAge());
                    employees.get(j).setAge(sort);
                }
            }
        }

        return null;
    }
    @Override
    public Employee[] getInfo() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("ФИО: " + employees.get(i).getName() + ", возраст: " + employees.get(i).getAge());
        }
        return null;
    }
}


