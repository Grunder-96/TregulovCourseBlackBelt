package nested_classes.static_nested_class;

public class Car {
	
	String color;
	int doorCount;
	Engine engine;
	private static int a;
	
	public Car(String color, int doorCount, Engine engine) {
		this.color = color;
		this.doorCount = doorCount;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + "]";
	}
	
	public void method() {
		Engine engine = new Engine(200);
		System.out.println(engine.horsePower);
	}

	public static class Engine {
		private int horsePower;
		static int countOfObjects;

		public Engine(int horsePower) {
			System.out.println(a);
//Невозможно обратиться к нестатической переменной из статического контекста
//          System.out.println(doorCount);
			this.horsePower = horsePower;
			countOfObjects++;
		}

		@Override
		public String toString() {
			return "My engine: [horsePower=" + horsePower + "]";
		}
	}
	
}

class Test {
	public static void main(String[] args) {
		Car.Engine engine = new Car.Engine(234);
		System.out.println(engine);
		Car car = new Car("red", 4, engine);
		System.out.println(car);		
//так работать не будет
//		Car.Engine engine2 = new car.Engine(150);
		AtmosphereEngine engine2 = new AtmosphereEngine(150);
	}
}

class AtmosphereEngine extends Car.Engine {

	public AtmosphereEngine(int horsePower) {
		super(horsePower);
	}
}
