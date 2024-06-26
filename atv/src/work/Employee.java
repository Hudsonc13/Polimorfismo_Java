package work;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double ValuePerHour;
	
	
	public Employee(){
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		ValuePerHour = valuePerHour;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHours() {
		return hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double getValuePerHour() {
		return ValuePerHour;
	}
	
	public void setValuePerHour(Double ValuePerHour) {
		this.ValuePerHour = ValuePerHour;
	}
	
	public Double Payment() {
		return ValuePerHour * hours;
	}
	
	public String toString() {
		return "Nome: " 
				+ name 
				+ "\n Horas: " 
				+ hours 
				+ "\n Salario/hora: " 
				+ ValuePerHour
				+ "\n Pagamento: "
				+ Payment();
	}
	
	

}
