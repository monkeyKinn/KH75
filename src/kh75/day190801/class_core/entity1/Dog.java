package kh75.day190801.class_core.entity1;

import kh75.day190801.class_core.entity.Pet;

public class Dog  extends Pet{

	
	private String strain;
	
	
	public Dog(){
	}
	
	

	
	public Dog(String strain) {
	

		this.strain = strain;
	}




	
	

	public String getStrain() {
		return strain;
	}




	public void setStrain(String strain) {
		this.strain = strain;
	}




	@Override
	public String toString() {
		return "Dog [strain=" + strain + "]";
	}




	/*@Override
	public String toString() {
		return "Dog [name=" + name + ", health=" + health + ", love=" + love + ", strain=" + strain + "]";
	}*/
	
	
	
	public void show(){
		//System.out.println(name);//  private:同包中不可以使用
		System.out.println(score);//  public: 不同包中可以使用
		//System.out.println(age);//  default: 不同包中可以使用
		System.out.println(height);//  protected: 不同包中可以使用
	}
	




	
}
