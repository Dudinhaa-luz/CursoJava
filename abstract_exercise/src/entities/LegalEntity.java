package entities;

public class LegalEntity extends TaxPayer{
	
	private Integer employeeQuantity;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIncome, Integer employeeQuantity) {
		super(name, annualIncome);
		this.employeeQuantity = employeeQuantity;
	}

	public Integer getEmployeeQuantity() {
		return employeeQuantity;
	}

	public void setEmployeeQuantity(Integer employeeQuantity) {
		this.employeeQuantity = employeeQuantity;
	}

	@Override
	public double taxCalculate() {
		double tax = 0;
		if (employeeQuantity <= 10) {
			tax = 0.16;
		}
		else {
			tax = 0.14;
		}
		
		return super.getAnnualIncome() * tax;
	}
	
	
	
	

}
