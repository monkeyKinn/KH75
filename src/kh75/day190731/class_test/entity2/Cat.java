package kh75.day190731.class_test.entity2;

public class Cat {
	
  //	private   私有的，只能在本类中可以访问
	/**
	 * 当属性是被private 修饰的时候，要想继续访问的话，可以通过
	 * getter / setter  的方法来访问
	 */
	String name;
	private int health;
	int love;
	
	public void setHealth(int health){
		if(health<0 || health>100){
			System.out.println("输入健康值有误，默认60");
			this.health=60;
		}else{
			
			this.health=health;
		}
	}
	
	public int getHealth(){
		return health;
	}
	
	
	
	public Cat(){
		System.out.println("cat()....");
	}
	
	
	public Cat(String name,int health){
		this(name);  // 可以修饰构造方法，如果在构造方法里面的话，需要在代码的第一行
		//this.name=name;  //this可以修饰属性
		this.health=health;
		this.show();  //可以修饰普通方法
		
	}
	public Cat(String name){
		System.out.println("cat(name)....");
		this.name=name;  
		
		
		
	}
	
	
	public void show(){
		System.out.println("宠物的独白");
		System.out.println("姓名是："+name+",健康值是："+health+",亲密度是："+love);
	}
	
	/*public static void main(String[] args) {
		//Cat c = new Cat("喵星人",100);
		Cat c = new Cat();
		c.name="tomcat";
		c.health=-99;
		c.show();
		
	}*/
	
	
}
