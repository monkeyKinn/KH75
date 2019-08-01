package kh75.day190731.class_test.entity2;

import org.junit.Test;


public class TestPerson {

	
	@Test
	public void tests01(){
		Person p1 = new Person("蔡徐坤",30,"中国");
		Person p2 = new Person("张宇",40,"中国");
		Person p3 = new Person("王威",30,"中国");
		p1.show();
		p2.show();
		p3.show();
		System.out.println("============");
		
		p3.country="泰国";
		p1.show();
		p2.show();
		p3.show();
	}
}
