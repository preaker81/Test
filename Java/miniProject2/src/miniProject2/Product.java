package miniProject2;

class Product {
	String prodName;
	double prodPrice;
//	int prodQty;
	int prodStock;
//	boolean discounted = false; //Probably not needed.
	
	Product(String prodName, double prodPrice, int prodStock){
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodStock = prodStock;
	}

	void setStockSell(){
		this.prodStock--;
	}
	
	int getprodStock() {
		return prodStock;
	}
}
