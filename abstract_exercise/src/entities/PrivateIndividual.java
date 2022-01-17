package entities;

public class PrivateIndividual extends TaxPayer	{
	
	private Double healthCoust;
	
	public PrivateIndividual() {
		
	}

	public PrivateIndividual(String name, Double annualIncome, Double healthCoust) {
		super(name, annualIncome);
		this.healthCoust = healthCoust;
	}

	public Double getHealthCoust() {
		return healthCoust;
	}

	public void setHealthCoust(Double healthCoust) {
		this.healthCoust = healthCoust;
	}

	@Override
	public double taxCalculate() {
		
		double tax = 0;
		if (super.getAnnualIncome() <= 20000) {
			tax = 0.15;
		}
		else {
			tax = 0.25;
		}
		
		healthCoust = healthCoust/2;
		
		return (super.getAnnualIncome() * tax) - healthCoust;
	}
	
	

}
