import java.io.*;

import java.util.*;

import java.lang.*;

class Series

{

void findNthTerm(int n)

{

// If input number is even

if (n % 2 == 0)

{

n = n / 2;

System.out.print(Math.pow(3, n - 1) + "\n");

}

// If input number is odd

else

{

n = (n / 2) + 1;

System.out.print(Math.pow(2, n - 1) + "\n");

}
  }

}

class Assign1

{

public static void main(String[] args)

{

Series s=new Series();

Scanner sc=new Scanner(System.in);

System.out.println("Enter the value of n");

int n=sc.nextInt();

s.findNthTerm(n);

}

}