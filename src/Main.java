import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Map<String, Map> Instruments = new HashMap<String, Map>();
				Map<String, Map> Consumables = new HashMap<String, Map>();
				HardwareStore store1 = new HardwareStore(Instruments);
				HardwareStore store2 = new HardwareStore(Consumables); 
				store1.addProduct("Hammer", "30", "Aviable");
				store1.addProduct("Pliers", "40", "Aviable");
				store2.addProduct("Nail", "70", "Aviable");
				store2.addProduct("Screw", "20", "Aviable");
				Set<Map.Entry<String, Map>> set = Instruments.entrySet();
				for(Map.Entry<String, Map> me : set) {
					
					store1.setStatus("Absent",  me.getValue());
				
				}
				//store2.setStatus("Expected", Category2.get("Shurup"));
				int k = 0;
				Set<Map.Entry<String, Map>> set1 = Consumables.entrySet();
				for(Map.Entry<String, Map> me : set1) {
					
					k++;
					
				}
				int b = k;
				for(Map.Entry<String, Map> me : set1) {
					while(k * 2 > b ){
						store2.setStatus("Expected",  me.getValue());
						k--;
					}
					
				}
				
				for(Map.Entry<String, Map> me : set) {
					
					if(store1.getStatus(me.getValue()) == "Aviable") {
						Double d2 = Double.valueOf(store1.getPrice(me.getValue()));
						store1.setPrice(d2, me.getValue());
					}
				
				}
				
				for(Map.Entry<String, Map> me : set1) {
					
					if(store2.getStatus(me.getValue()) == "Aviable") {
						Double d2 = Double.valueOf(store2.getPrice(me.getValue())) + Double.valueOf(store2.getPrice(me.getValue())) / 5;
						store2.setPrice(d2, me.getValue());
					}
				
				}
				
				System.out.println(Instruments);
				System.out.println(Consumables);
				
			}
			
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Map<String, Map> Mobile = new HashMap<String, Map>();
				Map<String, Map> Computer = new HashMap<String, Map>();
				AppleStore store1 = new AppleStore(Mobile);
				AppleStore store2 = new AppleStore(Computer); 
				store1.addProduct("IPhone", "300", "Aviable");
				store1.addProduct("IPad", "400", "Aviable");
				store1.addProduct("IPod", "200", "Aviable");
				store2.addProduct("IMac", "700", "Aviable");
				store2.addProduct("MacBook", "600", "Aviable");
				store2.addProduct("MacPro", "1000", "Aviable");
				store2.addProduct("MacMini", "500", "Aviable");
				Set<Map.Entry<String, Map>> set = Mobile.entrySet();
				for(Map.Entry<String, Map> me : set) {
					
					store1.setStatus("Absent",  me.getValue());
				
				}
				//store2.setStatus("Expected", Category2.get("Shurup"));
				int k = 0;
				Set<Map.Entry<String, Map>> set1 = Computer.entrySet();
				for(Map.Entry<String, Map> me : set1) {
					
					k++;
					
				}
				int b = k;
				for(Map.Entry<String, Map> me : set1) {
					while(k * 2 > b ){
						store2.setStatus("Expected",  me.getValue());
						k--;
					}
					
				}
				
				for(Map.Entry<String, Map> me : set) {
					
					if(store1.getStatus(me.getValue()) == "Aviable") {
						Double d2 = Double.valueOf(store1.getPrice(me.getValue()));
						store1.setPrice(d2, me.getValue());
					}
				
				}
				
				for(Map.Entry<String, Map> me : set1) {
					
					if(store2.getStatus(me.getValue()) == "Aviable") {
						Double d2 = Double.valueOf(store2.getPrice(me.getValue())) + Double.valueOf(store2.getPrice(me.getValue())) / 5;
						store2.setPrice(d2, me.getValue());
					}
				
				}
				
				System.out.println(Mobile);
				System.out.println(Computer);
				System.out.println("Completed");
				
			}
			
			
		});
		
		t1.start();
		t2.start();	
		
	}
			
		
}


