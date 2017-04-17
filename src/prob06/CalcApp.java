package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ex = null;
		int a,b;
		
		while( true ) {
			/*  코드를 완성 합니다 */
			
			ex = scanner.nextLine();
			
			if(ex.equals("quit")){
				break;
			}
			
			String[] exs =ex.split(" ");
			a=Integer.parseInt(exs[0]);
			b=Integer.parseInt(exs[2]);
			
			
			switch (exs[1]) {
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
				break;
			default:
				break;
			}
		}
		
		scanner.close();

	}

}
