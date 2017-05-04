import java.util.Scanner;
public class LCM {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("LCM of 2 numbers");
		System.out.println("Enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int lcm=(a<b)?a:b;
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.println("LCM: "+lcm);
				break;
			}
			lcm++;
		}

	}

}
