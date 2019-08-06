/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.afterschool_exercises.car_rental.test 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午5:59:17 
 */
package kh75.day190801.afterschool_exercises.car_rental.test;

import java.util.Scanner;

import kh75.day190801.afterschool_exercises.car_rental.son.Dog;
import kh75.day190801.afterschool_exercises.car_rental.son.Master;
import kh75.day190801.afterschool_exercises.car_rental.father.Pet;
import kh75.day190801.afterschool_exercises.car_rental.son.Penguin;



/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: PetTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午5:59:17 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public class PetTest {

	static Scanner in = new Scanner(System.in);

	private void adoptPet(int num, String name) {
		
		Pet pet = null;
		switch (num) {
		case 1:
			pet = new Dog();
			String type = null;
			int health = 0;
			System.out.print("Choose the type of the Dog:(1.聪明的拉布拉多 2.酷酷的雪纳瑞)");
			int typeNum = in.nextInt();
			switch (typeNum) {
			case 1:
				type = "聪明的拉布拉多";
				System.out.print("The Health of the dog:");
				health = in.nextInt();
				break;
			case 2:
				type = "酷酷的雪纳瑞";
				System.out.print("The Health of the dog:");
				health = in.nextInt();
				break;
			}
			pet.setName(name);
			pet.setHealth(health);
			Dog dog = (Dog)pet;
			dog.setStrain(type);
			dog.print();
			break;
		case 2:
			pet = new Penguin();
			String sex = null;
			System.out.print("Choose the sex of the Penguin:(1.Q仔 2.Q妹)");
			int sexNum = in.nextInt();
			switch (sexNum) {
			case 1:
				sex = "Q仔";
				break;
			case 2:
				sex = "Q妹";
				break;
			}
			pet.setName(name);
			Penguin p = (Penguin) pet;
			p.setSex("Q妹".equals(sex) ? "雌" : "雄");
			p.print();
			break;
		}
		new Master().play(pet);
		
	}

	public static void main(String[] args) {

		PetTest pt = new PetTest();
		System.out.println("Wellcome To Pet Store!");
		System.out.print("Input the name which you wanna adopt:");
		String name = in.next();
		System.out.print("Choose the type :(1.Dog 2.Penguin)");
		int num = in.nextInt();
		pt.adoptPet(num, name);

	}

}
