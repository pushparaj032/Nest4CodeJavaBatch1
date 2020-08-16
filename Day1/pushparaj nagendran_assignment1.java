
public class CalculateRestaurant {
	public static void main(String[] args) {
		int Price1 =70;
		int Price2 =20;
		int Price3 =10;
		int per =18;
		
		int Price = (Price1+Price2+Price3);		
		double TaxAmount2;	
		TaxAmount2 = (double)per/100;
		//System.out.println(TaxAmount2);			
		double tax;	
		tax = (double)TaxAmount2*Price;
		//System.out.println(tax);
		
		double finalvalue;	
		finalvalue = (double)tax+Price;
		System.out.println(finalvalue);
		
		float Price4 =(float)15.5;
		float Price5 =(float)4.5;
		int Price6 =30;	
		int per1 =5;
		
		float Price8 = (float)(Price4+Price5+Price6);
		//System.out.println(Price8);		
		double TaxAmount3;	
		TaxAmount3 = (double)per1/100;
		//System.out.println(TaxAmount3);			
		double tax1;	
		tax1 = (double)TaxAmount3*Price8;
		//System.out.println(tax1);
		
		double finalvalue2;	
		finalvalue2 = (double)tax1+Price8;
		System.out.println(finalvalue2);
		
}

}
