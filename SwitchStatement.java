public class SwitchStatement
{
	public static void main(String[] args)
	{
		char grade = 'C';

		switch (grade)
		{
			case 'A' : System.out.println("Excellent"); break;
			case 'B' : System.out.println("Good"); break;
			case 'C' : System.out.println("Well done"); break;
			case 'D' : System.out.println("Not So Bad");break;

			default : System.out.println("Invalid Grade!");
		}
	}
}