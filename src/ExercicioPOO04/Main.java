package ExercicioPOO04;

public class Main {

	public static void main(String[] args) {
		
		Invoice v1 = new Invoice(1048,"Caneta BIC", 5, 3.00);
		
		System.out.println("Descricao da compra: "+v1.toString()+" "
				+ "- Valor total: "+v1.getInvoiceAmount());
		
		System.out.println(); 
		
		Invoice v2 = new Invoice(2850,"Mouse Razer", 6, 290.00);
		
		System.out.println("Descricao da compra: "+v2.toString()+" "
				+ "- Valor total: "+v2.getInvoiceAmount());

	}

}
