package prob05;

public class Account {
	private String accountNo;
	private int balance;
	

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account(String accountNo) {
		// TODO Auto-generated constructor stub
		this.accountNo = accountNo;
		System.out.println(accountNo+ "계좌가 개설되었습니다.");
	}
	public void save(int money){
		this.balance = this.balance + money;
	}
	
	public void deposit(int money){
		if(this.balance == 0){
			return;
		}
		this.balance = this.balance - money;
	}
}
