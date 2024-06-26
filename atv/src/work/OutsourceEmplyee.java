package work;

	
public class OutsourceEmplyee extends Employee{

	private Double additionalCharge;
	
	
	
	public OutsourceEmplyee() {
		super();
	}

	public OutsourceEmplyee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getadditionalCharge() {
		return additionalCharge;
	}
	
	public void setadditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double Payment() {
		return getValuePerHour() * getHours() + additionalCharge * 1.1;
	}
	
	
}
