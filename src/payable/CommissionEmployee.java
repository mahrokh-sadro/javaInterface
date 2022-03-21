package payable;

public class CommissionEmployee extends Employee{

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) throws Exception {
		super(first, last,  ssn);
		if(grossSales<=0.0 && commissionRate>=0.0 && commissionRate<=1.0) {
			this.commissionRate =rate;
			this.grossSales =sales;
		}
		
		else throw new Exception("bad gross sales/commission rate");
		
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) throws Exception{
		if(grossSales<=0.0 ) this.grossSales =grossSales;
		else throw new Exception("bad gross sales");
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) throws Exception{
		if(commissionRate>=0.0 && commissionRate<=1.0) this.commissionRate =commissionRate;
		else throw new Exception("bad commission rate");
	}

	@Override
	public String toString() {//how to use super
		return "CommissionEmployee [getGrossSales()=" + getGrossSales() + ", getCommissionRate()=" + getCommissionRate()
				+ "]";
	}
	
	@Override
	
	public double getPaymentAmount() {
		return 
	}
	
}
