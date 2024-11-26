package entities;

import interfaces.IDepartement;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<departement> {

    Set<departement> departementHashSet=new HashSet<>();

    public DepartementHashSet(){}
    public void ajouterDepartement(departement dep){
        departementHashSet.add(dep);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(departement dep : departementHashSet){
            if(dep.getName().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(departement departement) {
        if(departementHashSet.contains(departement))return true;
        return false;
    }

    @Override
    public void supprimerDepartement(departement departement) {
        departementHashSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for(departement dep : departementHashSet){
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet<departement> trierDepartementById() {
        TreeSet<departement> sortedById = new TreeSet<>(departementHashSet);
        return sortedById;
    }
}
