package miniProject2;

class Product {
	String prodName;
	int prodPrice;
	int prodStock;

	
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
	
	int getprodStock() {
		return prodStock;
	}
	
}
