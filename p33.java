package rowcolumn;

import java.util.Scanner;

public class Rowcolumnoumnl {

    public static void main(String[] args) {
        // TODO code application logic here
        int row,i,j,column,temp,k = 0;
        int[] arr=new int[100];
        int[][] arr1=new int[10][10];
Scanner sc=new Scanner(System.in);  
        System.out.println("enter row and columnoumn");
 row=sc.nextInt();
column=sc.nextInt();
for(i=0;i<column*row;i++)
arr[i]=sc.nextInt();
for(i=0;i<row*column;i++)
for(j=i+1;j<row*column;j++)
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
for(i=0;i<row;i++)
for(j=0;j<column;j++)
{
arr1[i][j]=arr[k];
k++;
}
for(i=0;i<row;i++)
{
for(j=0;j<column;j++)
{
    System.out.print(arr1[i][j]);
}
    System.out.println("");
    }
}}
