package lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
	
	public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
		ArrayList<Car> al = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			al.add(carSupplier.get());
		}
		return al;
	}
	
	public static void changeCar(Car car, Consumer<Car> carConsumer) {
		carConsumer.accept(car);
	}
	
	public static void main(String[] args) {
		ArrayList<Car> al = createThreeCars(() -> new Car("Tesla", "red", 3.0));
		System.out.println(al);
		
		Iterator<Car> carIterator = al.iterator();
		while (carIterator.hasNext()) {
			Car car = carIterator.next();
			changeCar(car, a -> a.model = "Lada");
		}
		System.out.println(al);
	}
}

class Car {
	
	String model;
	String color;
	double engine;
	
	public Car(String model, String color, double engine) {
		this.model = model;
		this.color = color;
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
	}
	
}