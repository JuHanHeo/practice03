package prob03;

public class CurrencyConverter {

	private static double rate;

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		double dollar=0;
		if(won<=0){
			return 0;
		}
		else{
			dollar = won/CurrencyConverter.rate;
			return dollar;
		}
		
	}

	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		double won=0;
		if(dollar<=0){
			return 0;
		}
		else{
			won = dollar*CurrencyConverter.rate;
			return won;
		}
	}

	public static void setRate(double rate) {
		// 환율 설정(KRW/$1)
		CurrencyConverter.rate = rate;
	}
}
