package miniProject2;

class Product {
	private String prodName;
	private int prodPrice;
	private int prodStock;

	
	Product(String prodName, int prodPrice, int prodStock){
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodStock = prodStock;
	}

	void setStockSell(){
		if(this.prodStock <= 0) {
			this.prodStock = 0;
		}
		this.prodStock--;
	}
	
	String getProdName() {
		return prodName;
	}
	
	int getProdPrice() {
		return prodPrice;
	}
	
	int getProdStock() {
		return prodStock;
	}
	
}
