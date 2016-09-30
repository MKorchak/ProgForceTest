import java.util.Map;

public class HardwareStore extends Store {

	private static HardwareStore instance; 
	
	HardwareStore(Map Category) {
		super(Category);
	}
	
	public static HardwareStore getInstance() {
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
