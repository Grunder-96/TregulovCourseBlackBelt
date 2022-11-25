package annotation_examples;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class XiaomiClass = Class.forName("annotation_examples.Xiaomi");
		Annotation annotation1 = XiaomiClass.getAnnotation(Smartphone.class);
		Smartphone sm1 = (Smartphone) annotation1;
		System.out.println("Annotation info from Xiaomi class: " + sm1.OS() + ", " + sm1.yearOfCompanyCreation());
		
		Class IphoneClass = Class.forName("annotation_examples.Iphone");
		Annotation annotation2 = IphoneClass.getAnnotation(Smartphone.class);
		Smartphone sm2 = (Smartphone) annotation2;
		System.out.println("Annotation info from Iphone class: " + sm2.OS() + ", " + sm2.yearOfCompanyCreation());
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone {
	
	String OS() default "Android";
	int yearOfCompanyCreation() default 2010;
}

@Smartphone
class Xiaomi {
	
	String model;
	double price;
}

@Smartphone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
	
	String model;
	double price;
}
