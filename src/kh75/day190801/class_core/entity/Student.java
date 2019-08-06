package kh75.day190801.class_core.entity;

public class Student {
	private int id;
	private String name;
	private int age;

	public Student() {
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	// 重写方法
	public boolean equals(Object obj) {
		// 当前的 this 指代 s1 obj 被赋予了实参s2
		// (this == obj); 比较的是 s1 和 s2的地址值是否相等
		/* return (this == obj);*/

		if (this == obj) {
			return true;
		}
		// 判断传过来的obj是否和Student为一个类型
		if (obj instanceof Student) {
			// 如果是一个类型则强制转换
			Student s = (Student) obj;
			// 使用s1 和传过来的对象的每个属性进行比较，如果都是相同的话，则认为是一个人
			if (this.id == s.id && this.name == s.name && this.age == s.age) {
				return true;
			}
		}
		// 如果上面说的 地址不同，比较的类型或者属性有不同的，则默认不是同一个人
		return false;
	}

}
