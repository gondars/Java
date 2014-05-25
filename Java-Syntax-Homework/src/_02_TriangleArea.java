import java.util.Scanner;
public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] a = scanner.nextLine().split(" ");
		String[] b = scanner.nextLine().split(" ");
		String[] c = scanner.nextLine().split(" ");
		int ax = Integer.parseInt(a[0]);
		int ay = Integer.parseInt(a[1]);
		int bx = Integer.parseInt(b[0]);
		int by = Integer.parseInt(b[1]);
		int cx = Integer.parseInt(c[0]);
		int cy = Integer.parseInt(c[1]);		
		int area = Math.abs(((ax*(by-cy))+(bx*(cy-ay))+(cx*(ay-by)))/2);
		System.out.println(area);
		scanner.close();

	}

}
