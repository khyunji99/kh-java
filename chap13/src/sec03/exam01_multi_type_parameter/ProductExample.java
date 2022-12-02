package sec03.exam01_multi_type_parameter;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		// Product<T,M>
		// T kind , M model
		
		product1.setKind(new Tv());   // T <- Tv
		product1.setModel("½º¸¶Æ®TV"); // M <- String
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());  // T <- Car
		product2.setModel("µðÁ©");     // M <- String
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
