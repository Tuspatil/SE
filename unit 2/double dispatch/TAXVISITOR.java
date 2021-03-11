class TaxVisitor implements Visitor {
	public TaxVisitor() {
	}
	
	// Calculates total price based on this being taxed
	// as a liquor item
	
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor Item: Price with Tax");
		return Double.parseDouble((liquorItem.getPrice() * .18) + liquorItem.getPrice());
	}
	
	// Calculates total price based on this being taxed
	// as a tobacco item
		
	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco Item: Price with Tax");
		return Double.parseDouble((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice());
	}
	
	// Calculates total price based on this being taxed
	// as a necessity item
		
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity Item: Price with Tax");
		return Double.parseDouble(necessityItem.getPrice());
	}

}