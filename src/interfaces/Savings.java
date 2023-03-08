package interfaces;

public class Savings extends Account implements Maintenance_charge {
	
	public Savings(String account_no, String name, double balance) {
		super(account_no, name, balance);
		
	}

	public float calculateMaintenanceCharge(float year) {
		float charge=(50*year)+50;
		return charge;
	}
}
