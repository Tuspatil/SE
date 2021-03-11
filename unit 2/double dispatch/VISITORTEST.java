public class VisitorTest {
	public static void main(String[] args) {
		
		TaxVisitor taxCalc = new TaxVisitor();//CLASS WHICH HAS TAXES DEFINED FOR ALL THREE CATEGORIES
		
        Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(19.99);
		
		System.out.println(milk.accept(taxCalc) + "\n");
        /* 
        1. First the control will go to milk class.
        2. accept method in the milk will recognize that calling object is of type necessity.(first invocation)
        3. accept method will redirect it to the tax calculation method of the taxcalculator class.(second invocation)
        4. In this way double dispatch is implemented using visitor pattern
        */
		System.out.println(vodka.accept(taxCalc) + "\n");
		System.out.println(cigars.accept(taxCalc) + "\n");
		

	}
}