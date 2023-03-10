package project6;
import java.util.*;
import java.io.*;
public class Project6 {
 public static void main(String[] args) {
 int i, n=21;
 int count= n;
 double list[] = new double[n+1];
 Scanner S = new Scanner(System.in);
 System.out.println("Enter the monthly salary of all the employee with space: ");
 for(i=1;i<n+1;i++) {
 list[i] = S.nextDouble();
 }
 Arrays.sort(list);
 System.out.println("The salary table: ");
 for(i=count;i>0;i++) {
 for(int j=n; j<=i;j++) {
 System.out.printf(list[count--]+" ");
 if(count==0) { System.out.println(); return; }
   }

 System.out.println();

 }

 }

}