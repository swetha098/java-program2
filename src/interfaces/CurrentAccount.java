package interfaces;

public class CurrentAccount extends Account implements Maintenance_charge {

	public CurrentAccount(String account_no, String name, double balance) {
		super(account_no, name, balance);
		
	}

	@Override
	public float calculateMaintenanceCharge(float year) {
		float charge=(100*year)+200;
		return charge;
	}

	

}
