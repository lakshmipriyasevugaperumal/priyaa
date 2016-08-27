import java.util.Scanner;


public class Candies {

	
	public static void main(String[] args) {
		System.out.println("Enter the number of childs");
		Scanner sr=new Scanner(System.in);
		int child=sr.nextInt();
		int[] a=new int[child];
		int Candies=0;
		int candies[]=new int[child];
		System.out.println("enter the rating");
		int rating=0;
		for(int i=0;i<a.length;i++)
		{
			rating=sr.nextInt();
			a[i]=rating;
		}
		
		System.out.println("Enter the candies");
		int c=0;
		for(int k=0;k<candies.length;k++){
			c=sr.nextInt();
			candies[k]=c;
		}
		
		
		for(int j=0;j<a.length-1;j++){
			if(a[j+1]>a[j]){
				candies[j+1]+=candies[j];
			}
			else
				candies[j+1]=1;
			
		}
		for(int h=0;h<candies.length;h++){
			Candies+=candies[h];
			
		}
		System.out.println("Min Candies Required:"+Candies);
		
	}

}
