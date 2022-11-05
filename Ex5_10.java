

package ex5_10;
class Employee{
    String name;
    double salary=0.0d,netsalary=0.0d,total=0.0d, bypercent=0.0d;
    Employee(){
    name="tans";
    salary=40000.0d;
    }
    Employee(String n,double s){
    name=n;
    salary=s;
    System.out.println("The employee name is "+name);
    System.out.println("The current salary is "+salary);
    }
    String getName(String n){
    name=n;
    return name;
    }
    double getSalary(double s){
    salary=s;
    return salary;
    }

    void raiseSalary(double b) {
    bypercent=b;
    netsalary=salary*(bypercent/100);
    total=salary+netsalary;
    System.out.println("The incremental amount is "+total);
    }
}

public class Ex5_10 {

    
    public static void main(String[] args) {
       
        Employee e1=new Employee("kalai",10000.0d);
    e1.raiseSalary(20.0d);
    //z1=e2.getName("priya");
//z2=e2.getSalary(20000.0d);
    Employee e2=new Employee("kavi",20000.0d);
    e2.raiseSalary(10.0d);
    }
    
}













/*class Employee{
    String name;
    double salary=0.0d,netsalary=0.0d,total=0.0d, bypercent=0.0d;
    Employee(){
    name="tans";
    salary=40000.0d;
    }
    Employee(String n,double s){
    name=n;
    salary=s;
    System.out.println("The employee name is "+name);
    System.out.println("The current salary is "+salary);
    }
    String getName(String n){
    name=n;
    return name;
    }
    double getSalary(double s){
    salary=s;
    return salary;
    }

    void raiseSalary(double b) {
    bypercent=b;
    netsalary=salary*(bypercent/100);
    total=salary+netsalary;
    System.out.println("The incremental amount is "+total);
    }
}
class EmployeeTester{
    public static void main(String args[]){
    Employee e1=new Employee("kalai",10000.0d);
    e1.raiseSalary(20.0d);
    //z1=e2.getName("priya");
//z2=e2.getSalary(20000.0d);
    Employee e2=new Employee("kavi",20000.0d);
    e2.raiseSalary(10.0d);
    }
}*/


/**
C:\>java EmployeeTester
The employee name is kalai
The current salary is 10000.0
The incremental amount is 12000.0
The employee name is kavi

The current salary is 20000.0
The incremental amount is 22000.0
*/
