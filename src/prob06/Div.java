package prob06;

public class Div {
	
	private int a;
	private int b;
	
	public void setValue(int a, int b){
		this.a = a;
		this.b = a;
	}
	public double calculate(){
		double result;
		
		if(b==0){
			System.out.println("0으로 나눌수 없습니다.");
			return 0;
		}
		else{
			result=a/b;
			return result;
		}
		
	}

}
