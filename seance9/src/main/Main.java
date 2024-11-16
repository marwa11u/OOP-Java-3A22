package main;
import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList company = new SocieteArrayList();

        // Create employe instances
        employe emp1 = new employe(1, "Marwa", "Mokhtar", "Engineering", 3);
        employe emp2 = new employe(2, "Salah", "Salah", "DEVOPS", 2);
        employe emp3 = new employe(3, "Hedi", "Tounsi", "Engineering", 1);
        employe emp4 = new employe(4, "Mohamed", "Tounsi", "HR", 2);
        employe emp5 = new employe(3, "Hedi", "Tounsi", "Marketing", 1);

        // Add employees to the company list
        company.ajouterEmploye(emp1);
        company.ajouterEmploye(emp2);
        company.ajouterEmploye(emp3);
        company.ajouterEmploye(emp4);
        company.ajouterEmploye(emp5);

        if(emp3.equals(emp5)){
            System.out.println("emp3 and emp5 have same name , same id\n");
        }

        // Display employees before sorting
        System.out.println("employees before sorting:");
        company.displayEmploye();

        company.trierEmployeParId();
        System.out.println("\nemployees after sorting by ID:");
        company.displayEmploye();

        // Sort employees by name, department, and grade
        company.trierEmployeParNomDepartementEtGrade();

        // Display employees after sorting
        System.out.println("\nemployees after sorting by name, department, and grade:");
        company.displayEmploye();

        System.out.println("delete emp3");
        company.supprimerEmploye(emp3);

        System.out.println("\nemployees after deleting emp3:");
        company.displayEmploye();


    }
}