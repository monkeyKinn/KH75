package kh75.day190801.class_core.entity;

public class TestStudent {
	/**
	 * 方法的重写
	 * 发生在子父中
	 * 方法名相同，参数列表相同，返回值类型相同或者是其子类，
	 * 访问修饰符不能严于父类
	 * 抛出的异常不能大于父类抛出的异常
	 * 
	 */
	public static void main(String[] args) {
		Student s1 = new Student(101,"张三",25);
		Student s2 = new Student(101,"张三",25);
		System.out.println(s1.equals(s2));
	}
}
