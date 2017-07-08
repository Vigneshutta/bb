import java.util.*;
import java.io.*;
public class Evenintervals

{
public static void main(String[] args)throws IOException
{
  
 int a;
 int g;
   BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the first number");
a=Integer.parseInt(vc.readLine());
System.out.println("Enter the second number");

g=Integer.parseInt(vc.readLine());
while(a<g){
 
 if(a%2==0)
 {
 System.out.println("even no"+a);
 
 }
 a=a+1;
}
}
}
