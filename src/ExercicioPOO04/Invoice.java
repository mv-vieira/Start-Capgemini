package ExercicioPOO04;

public class Invoice {

	private int codigoItem;
	private String descricao;
	private int quantidade;
	private double precoUnitario;
	
	
	public Invoice(int codigoItem, String descricao, int quantidade, double precoUnitario) {
		super();
		this.setCodigoItem(codigoItem);
		this.setDescricao(descricao); 
		this.setQuantidade(quantidade);
		this.setPrecoUnitario(precoUnitario);
		
	}

	
	public double getInvoiceAmount() {
		return quantidade * precoUnitario;
	}

	public int getCodigoItem() {
		return codigoItem;
	}


	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		
		if(quantidade < 0) {
			quantidade = 0;
		}else {
			this.quantidade = quantidade;
		}
		
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}


	public void setPrecoUnitario(double precoUnitario) {
		
		if(precoUnitario < 0) {
			precoUnitario = 0;
		}else {
			this.precoUnitario = precoUnitario;
		}
		
	}


	@Override
	public String toString() {
		return "Codigo do Item: " + codigoItem + " - Descricao do pedido: " + descricao + " - Quantidade: " + quantidade
				+ " - Valor produto: " + precoUnitario;
	}
	
	
	
	
	
	
	
	
}
