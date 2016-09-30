import java.util.Map;

public class AppleStore extends Store {
	private static AppleStore instance; 
	
	AppleStore(Map Category) {
		super(Category);
	}
	
	public static AppleStore getInstance() {
		return instance;
	}
	
	
	public String getStatus(Map Product) {
		this.Product = Product;
		return (String)Product.get("Status");
	}
	
	public String getPrice(Map Product) {
		this.Product = Product;
		return (String)Product.get("Price");
	}

}
