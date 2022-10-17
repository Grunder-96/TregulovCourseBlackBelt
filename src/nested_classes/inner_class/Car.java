package nested_classes.inner_class;

public class Car {
	
	String color;
	int doorCount;
	Engine engine;
		
	public Car(String color, int doorCount/*, int horsePower*/) {
//		Engine engine = new Engine(200);
//		System.out.println(engine.horsePower);
		this.color = color;
		this.doorCount = doorCount;
//		this.engine = this.new Engine(horsePower); 
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + "]";
	}

	public class Engine {
		private int horsePower;
		public static int a = 5;

		public Engine(int horsePower) {
			this.horsePower = horsePower;
		}

		@Override
		public String toString() {
			return "My engine: [horsePower=" + horsePower + "]";
		}
	}
	
}

class Test {
	public static void main(String[] args) {
		Car car = new Car("black", 3);
		Car.Engine engine = car.new Engine(128);
		System.out.println(engine);
		System.out.println(car);
		
//Ошибочное написание
//		Car.Engine engine2 = new car.Engine(150);
		
// В этом случае теряется ссылка на сам автомобиль
		Car.Engine engine3 = new Car("yellow", 2).new Engine(350);
		
	}
}
