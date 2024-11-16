package entities;
import java.util.Comparator;
public class EmployeeGradeComparator implements Comparator<employe> {
    public int compare(employe emp1,employe emp2){
       return emp1.getGrade()-emp2.getGrade();

    }
}
