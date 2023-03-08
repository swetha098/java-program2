package interfaces;

public class Account {
	String Account_no;
	String Name;
	double balance;
	public Account(String account_no, String name, double balance) {
		super();
		Account_no = account_no;
		Name = name;
		this.balance = balance;
	}
	public String getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(String account_no) {
		Account_no = account_no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
