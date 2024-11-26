package entities;

import java.util.Objects;

public class departement implements Comparable<departement>{
    private int id;
    private String name;
    private int nbEmployes;

    public departement(){}
    public departement(int id,String name,int nbEmployes){
        this.id=id;
        this.name=name;
        this.nbEmployes=nbEmployes;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(obj instanceof departement dep){
            return this.name.equals(dep.name) && this.id==dep.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Departement{id :"+id+" name:"+name+" nb employes:"+nbEmployes+ "}";
    }

    @Override
    public int hashCode() {
        int resultat=17;
        resultat=31*resultat +id+ name.hashCode();
        return 31 * resultat + name.hashCode();
    }

    @Override
    public int compareTo(departement o) {
        return Integer.compare(this.id,o.id);
    }
}
