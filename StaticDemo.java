import java.io.*;
class StaticDemo
{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
int num=sc.nextInt(); 
System.out.println("***Account Information System***");
System.out.println("Select one option below");
System.out.println("1 Add record to file \n 2 show record from file \n 3 search record \n 4 Update record \n 5 Delete Record");
System.out.println("Enter your choice");
switch(num)
{
case 1:
System.out.println(" Enter  Name \n Enter Account number \n Enter Balance");
break;
case 2:
System.out.println(" Enter  Name");
break;
case 3:
System.out.println(" Enter  name to search");
break;
case 4:
System.out.println(" Enter file name to Update");
break;
case 5:
System.out.println(" Enter file name to delete");
break;
default:
System.out.println(" Match not found");
}
}
}




