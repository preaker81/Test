package miniProject2;

class DiscountedProduct extends Product{
	double discount;
	
	DiscountedProduct(String prodName, double prodPrice, int stock, double discount){
		super(prodName, prodPrice, stock);
		this.discount = discount;
	}
	
	double discountedPrice() {
		return prodPrice * discount;
	}

}
