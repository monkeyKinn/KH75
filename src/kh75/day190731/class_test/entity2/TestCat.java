package kh75.day190731.class_test.entity2;

public class TestCat {

	public static void main(String[] args) {
		//Cat c = new Cat("喵星人",100);
				Cat c = new Cat();
				c.name="tomcat";
				//c.health=-99;  通过点击setter的方法名来设置值
				c.setHealth(-195);
				/*c.show();*/
				int health = c.getHealth();
				System.out.println(health);
	}
}
