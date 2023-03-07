import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
classSalary_sort
floatemployee_salary[]=newfloat[21];
floattemp;
Scannersc=newScanner(System.in);
System.out.println("enterthesalariesof21employees");
for(inti=0;i<21;i++){
employee_salary[i]=sc.nextFloat();
}
Arrays.sort(employye_salary);
System.out.println("sorted array:");
for(floatarr1:employee_salary)
{
System.out.println(arr1);
}
for(int i=0;i<employee_salary.length;i++)
{
for(int j=i+1;j<employee_salary.length;j++)
{
if(employee_salary[i]<employeee_salary[j])

4.Results:
}
{
temp=employee_salary[i];
employee_salary[i]=employee_salary[j];
employee_salary[j]=temp;
}
System.out.println();
System.out.println("elements of the array sorted in the ascending order:");
for(int i=0;i<employee_salary.length;i++)
System.out.println(employee_salary[i]+"");
System.out.println();
System.out.println("information of 21 employees as below:");
int k=0;
float y[][]=new float [6][6];
for(int i=0;i<6;i++)
for(int j=0;j<=i;j++)
{
y[i][j]=employee_salary[k];
System.out.print(y[i][j]+"");
}
k++;
System.out.println();
}
