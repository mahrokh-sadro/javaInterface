package payable;

public class Invoice implements Payable{
	
	private String part;
	private String description;
	private int count;
	private double price;
	
	public Invoice(String part, String description, int count, double price) {
		this.part=part;
		this.description=description;
		this.count=count;
		this.price=price;
	}
	
	String getPart() {
		return part;
	}
	
	void setPart(String part) {
		this.part=part;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Part : "+getPart()+ " | Description : "+getDescription()+" | Count : "
	                 +getCount()+" | Price : "+getPrice()+"\n";
	}

	@Override
	
	public double getPaymentAmount() {
		
		return getCount()*getPrice();
	}
	
	
	

	
	
	
}
