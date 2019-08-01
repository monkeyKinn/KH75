package kh75.day190731.class_test.entity;

import org.junit.Test;

public class TestDog {

	
	@Test
	public void test01(){
		//测试给狗狗类赋值
		Dog dog = new Dog("二哈",99);
		Dog dog1 = new Dog("阿黄",88,"哈士奇");
		Dog dog2 = new Dog();
		dog.name="旺财";
		dog.love=99;
		dog.show();
		
	}
	
}
