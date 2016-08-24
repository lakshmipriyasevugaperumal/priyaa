import java.util.Scanner;


public class AtoB {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		StringBuffer sb=new StringBuffer(a);
		int tot=0;
		while(true)
		{
		System.out.println("Enter the your amount to change A 3)Rs.3 4)Rs.4 5)Rs5");
		int op=s.nextInt();
		tot+=op;
		int c;
	String d;
		if(tot<19)
		{
		switch(op)
		{
		case 3:
			System.out.println("Enter the position to delete");
			c=s.nextInt()-1;
			sb.deleteCharAt(c);
			System.out.println(sb);
			break;
		case 4:
			System.out.println("Enter the position & Character to insert");
			sb.insert(s.nextInt()-1, s.next().charAt(0));
			System.out.println(sb);
			break;
		case 5:
			System.out.println("Enter the Position to replace & by which Character");
		    c=s.nextInt()-1;
		    d=a.substring(0, c) + s.next().charAt(0)+ a.substring(c + 1);
		    sb=new StringBuffer(d);
		    System.out.println(sb);
		    break;
		 default:
			 System.out.println("Enter a valid amount");
		}
		if(sb.toString().equals(b))
		{
			System.out.println("you got it by Rs."+tot);
			break;
		}
		}else
		{
			System.out.println("your turn over");
			break;
		}
		}
	}

}
