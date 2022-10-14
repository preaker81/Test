package miniProject2;

class DiscountedProduct extends Product{
	private double discount;
	
	DiscountedProduct(String prodName, int prodPrice, int stock, double discount){
		super(prodName, prodPrice, stock);
		this.discount = discount;
	}
	
	double discountedPrice() {
		return getProdPrice() * discount; //är det overkill att ha alla egenskaper private?
	}

}