import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {
//		int number = 0;
//		System.out.println("단?");
//		Scanner scanner = new Scanner(System.in);
//		number = scanner.nextInt();
//		
//		//print(calculate(number), number);
//		
//		//int[] result = Gugudan.calculate(number);
//		//Gugudan.print(result, number);
//		//Gugudan.calculate(number);
//		
//		Gugudan.print(Gugudan.calculate(number), number);
		
		System.out.println("단??"); // number,number 
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		Gugudan.print(Gugudan.calculate(first,second),first,second);
		
	}


}
