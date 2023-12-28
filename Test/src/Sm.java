import java.util.Scanner;

public class Sm {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//"Числата трябва да са двуциферни!"
		long n1,n2,sum,result;
		System.out.println("Въведи първото число");
		long number1= Integer.parseInt(input.nextLine());
		System.out.println("Въведи второто число");
		long number2= Integer.parseInt(input.nextLine());
		sum= number1+number2;
		n1= sum / 10;
		n2= sum % 10;
		result=n1+n2;
		System.out.println("Сумата от цифрите на числото " + sum  +" е " +result);
		input.close();
		
		
		
		
		
		

	}

}
