import java.util.Scanner;


public class _03_PointsInsideACircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] coords = scanner.nextLine().split(" ");
		float a = Float.parseFloat(coords[0]);
		float b = Float.parseFloat(coords[1]);
		if(a< 12.5 || a>22.5 && b<6 || b>13.5 )
		{System.out.println("Outside");
		
		}
		else
		{
			if(a>17.5 && a<20 && b>8.5 && b<13.5)
			{
				System.out.println("Outside");
			}
			else {
				System.out.println("Inside");
			}
		}
		scanner.close();
		
 
	}

}
