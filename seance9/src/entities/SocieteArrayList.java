package entities;

import interfaces.IGestion;
import java.util.*;

public class SocieteArrayList implements IGestion<employe> {
    public ArrayList<employe> ArrayEmployees;

    public SocieteArrayList(){
        this.ArrayEmployees=new ArrayList<>();
    }
    public ArrayList<employe> getEmployees(){
        return ArrayEmployees;
    }
    @Override
    public void ajouterEmploye(employe employee){
        ArrayEmployees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom){
        Iterator<employe> iterator= ArrayEmployees.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next().getName();
            if (name.equals(nom))
                return true;
        }
      /* or
      for(employe emp : employees){
                String name = emp.getName();
                if (name.equals(nom))
                    return true;
        }*/
        return false;
    }

    @Override
    public boolean rechercherEmploye(employe emp){
        return ArrayEmployees.contains(emp);
    }

    @Override
    public void supprimerEmploye(employe emp){
        String name=emp.getName();
        if(rechercherEmploye(emp)){
            if(ArrayEmployees.remove(emp)) System.out.println(name + "deleted");
            else System.out.println("cannot delete"+name);
        }
        else System.out.println(name+"not found");
    }
    @Override
    public void displayEmploye(){
        for(employe emp: ArrayEmployees){
            System.out.println(emp.toString());
        }
    }
    @Override
    public void trierEmployeParId(){
        Collections.sort(ArrayEmployees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade(){
        ArrayEmployees.sort(new EmployeeDepartmentComparator().thenComparing(new EmployeeGradeComparator()));

    }

}
