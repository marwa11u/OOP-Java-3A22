package entities;


public class employe implements Comparable<employe> {
    private int id;
    private String name;
    private String lastname;
    private String department;
    private int grade;

    public employe(){}
    public employe(int id, String name,String lastname, String department,int grade){
        this.id=id;
        this.name=name;
        this.lastname=lastname;
        this.department=department;
        this.grade=grade;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastname;
    }
    public String getDepartment(){
        return department;
    }
    public int getGrade(){
        return grade;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(this==obj) return true;
        if(obj instanceof employe employee){
            return this.id==employee.id && this.name.equals(employee.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "employee{id:"+id+" name: "+name+" last name: "+lastname+" department: "+department+" grade: "+grade+"}";
    }

    @Override
    public int compareTo(employe emp){
        return this.id - emp.id;
    }

}
