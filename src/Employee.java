public class Employee {
    
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;
    
    public int getEmpNum(){
        return empNum;
    }
    public void setEmpNum(int emp){
        empNum = emp;
        
    }
    public String getEmpLastName(){
        return empLastName;
    }
    public void setEmpLastName(String name){
        empLastName = name;
    }
    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String name) {
        empFirstName = name;
    }
    
    public double getSalary(){
        return empSalary;
    }
    public void setSalary(double sal) {
        empSalary = sal;
    }

    public void SetEmpNum(int id) {
    }

    public void SetSalary(double sal) {
    }
}
