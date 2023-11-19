package Random.OptionalWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeManagmentSystem {

    public List<Employee> filerEmployeesBySalary(List<Employee> empList,double minSal){
        List<Employee> newList=new ArrayList<>();
        for(Employee em: empList){
            if(em.salary()>=minSal) newList.add(em);
        }
        return newList;

    }

    public double calcSalary(List<Employee> emplist){
        double tot=0;
        for(Employee em:emplist){
            tot+=em.salary();
        }
        return tot;
    }

    public void displayEmployee(List<Employee> list){
        for(Employee em:list){
            System.out.println(em.id()+" "+em.name()+" "+em.salary());
        }
    }

    public Optional<Employee> findEmpByID(int id1,List<Employee> list){
        for(Employee em:list){
            if(em.id()==id1) return Optional.of(em);
        }
        return Optional.empty();
    }

}
