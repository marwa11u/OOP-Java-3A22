package main;

import entities.DepartementHashSet;
import entities.departement;

import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();


        gestionDepartements.ajouterDepartement(new departement(3, "Informatique", 50));
        gestionDepartements.ajouterDepartement(new departement(1, "Marketing", 30));
        gestionDepartements.ajouterDepartement(new departement(2, "RH", 20));


        System.out.println("All Departments:");
        gestionDepartements.displayDepartement();
        System.out.println();


        System.out.println("Searching for 'Marketing' department(byname):");
        boolean found = gestionDepartements.rechercherDepartement("Marketing");
        System.out.println("Found Marketing: " + found);
        System.out.println();


        departement dep2 = new departement(2, "RH", 20);
        System.out.println("Searching for department by object: " + dep2);
        boolean search = gestionDepartements.rechercherDepartement(dep2);
        System.out.println("Found department: " + search);
        System.out.println();


        departement dep3 = new departement(1, "Marketing", 30);
        System.out.println("Removing department: " + dep3);
        gestionDepartements.supprimerDepartement(dep3);
        gestionDepartements.displayDepartement();
        System.out.println();


        System.out.println("Departments sorted by ID:");
        TreeSet<departement> sortedById = gestionDepartements.trierDepartementById();
        for (departement dep : sortedById) {
            System.out.println(dep);
        }
    }
}