import java.util.Scanner;
public class storeemp 
{
        int id;
        String name;
        double salary;

        public storeemp(int id, String name, double salary)
        {
            this.id = id;
            this.name=name;
            this.salary=salary;
        }
        public void display()
        {
           System.out.println("Id: "+id+"name: "+name+"salary: "+salary);
        }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        storeemp e1= new storeemp(10,"Sagnika",10000);
        storeemp e2= new storeemp(2,"snigdha",34789);
        storeemp e3= new storeemp(3,"sniu",289928);
        storeemp [] emp = new storeemp[3];
        emp[0]=e1;
        emp[1]=e2;
        emp[2]=e3;
    for(int i=0;i<=emp.length-1;i++)
    {
        emp[i].display();
    }
}
}
