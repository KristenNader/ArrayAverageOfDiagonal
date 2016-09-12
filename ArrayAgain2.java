import java.util.Scanner;
public class ArrayAgain2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 9 numbers");
		int element = scan.nextInt();
		int element1=scan.nextInt();
		int element2=scan.nextInt();
		int element3=scan.nextInt();
		int element4=scan.nextInt();
		int element5=scan.nextInt();
		int element6=scan.nextInt();
		int element7=scan.nextInt();
		int element8=scan.nextInt();
	int [][] array = { {element,element1,element2}, {element3,element4, element5}, {element6,element7, element8}};
	for (int[] row : array) {
		for (int column : row) {
			System.out.print(column + " ");
		}
		System.out.print("\n");
	}
		// TODO Auto-generated method stub
		int diag=element+element4+element8;
		System.out.println(diag/3);
	}

}
