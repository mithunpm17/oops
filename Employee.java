class Employee
{
private int no;
private String name;
private double sal;
private String dept;
public Employee(int no,String name,double sal,String dept)
{
this.no=no;
this.name=name;
this.sal=sal;
this.dept=dept;
}
public String getName()
{
return name;
}
public double getSal()
{
return sal;
}
public void setSal(double sal)
{
this.sal=sal;
}
public String getDept()
{
return dept;
}
public void setDept(String dept)
{
this.dept=dept;
}
public void display()
{
System.out.printf("employe details");
System.out.printf("%d,%s,%.2f,%s\n",no,name,sal,dept);
}
public static void main(String args[])
{
Employee[] emp=new Employee[3];
emp[0]=new Employee(1001,"Olivia",5000,"core java");
emp[1]=new Employee(1002,"Amelia",5500,"Net");       
emp[2]=new Employee(1003,"Alfiya",50000,"Avanced java");
System.out.println("original employee details:");
for(Employee e3:emp)
{
e3.display();
for(Employee e2:emp)
{
if((e2.getDept().toUpperCase().contains("JAVA")||e2.getDept().toUpperCase().contains("Net"))&&(!e2.getName().equalsIgnoreCase("Amelia")))
{
e2.setDept("Python");
e2.setSal(e2.getSal()+500);
}
}
System.out.println("\nModified Employee details:");
for(Employee e1:emp)
{
e1.display();
}
}
}
}
