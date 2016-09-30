import java.util.HashMap;
import java.util.Map;

public  class Store {

	Map<String, Map> Category = new HashMap<String, Map>();
	Map<String, String> Product = new HashMap<String, String>();
	
	
	public Store(Map Category) {
		this.Category = Category;
	}
	
	public Map getProduct() {
		return Product;
	}
	
	public void addProduct(String Title, String Price, String Status) {
		Map<String, String> Product = new HashMap<String, String>();
		Product.put("Title", Title);
		Product.put("Price", Price);
		Product.put("Status", Status);
		Category.put(Title, Product);
	}
	
	public void setPrice(double newPrice, Map Product) {
		this.Product = Product;
		String price = Double.toString(newPrice);
		Product.put("Price", price);
	}
	
	public void setStatus(String newStatus, Map Product) {
		this.Product = Product;
		Product.put("Status", newStatus);
	}

	
	
	
	

}
