package entities;

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<employe> {
    @Override
    public int compare(employe o1, employe o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }

}
