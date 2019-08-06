/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：汽车租凭测试包
 * @Package: kh75.day190801.afterschool_exercises.car_rental.test 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午3:13:01 
 */
package kh75.day190801.afterschool_exercises.car_rental.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import kh75.day190801.afterschool_exercises.car_rental.father.MotoVehicle;
import kh75.day190801.afterschool_exercises.car_rental.son.Bus;
import kh75.day190801.afterschool_exercises.car_rental.son.Car;
import kh75.day190801.afterschool_exercises.car_rental.son.Truck;
import kh75.day190801.afterschool_exercises.car_rental.utils.CarsUtlis;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CarRentalTest.java
* @Description: 汽车租凭测试类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午3:13:01 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public class CarRentalTest {
	Scanner in = new Scanner(System.in);
	@Test
	public void test01() throws Exception {
		System.out.println("欢迎来到汽车租凭公司!");
		System.out.print("请输入要租凭的天数:");
		int days = in.nextInt();
		System.out.print("请输入要租凭的汽车类型(1.轿车	2.客车):");
		String kindsNum = in.next();
		/**
		 * 汽车类型
		 */
		String kinds = null;
		switch(kindsNum){
		case "1":
			kinds = "轿车";
			System.out.print("输入要租凭的汽车品牌(1.宝马	2.别克):");
			String brandNum = in.next();
			/**
			 * 汽车品牌
			 */
			String brand = null;
			Car car = new Car();
			switch (brandNum) {
			case "1":
				brand = "宝马";
				car.setNo("京BK5543");
				System.out.println("分配给您的车牌号为:"+car.getNo());
				System.out.println("分配给您的轿车型号为:宝马550i");
				car = new Car(car.getNo(),"宝马550i");
				car.setBrand(brand);
				System.out.println();
				
				System.out.print("顾客您好!您需要支付的租金为:"+car.calcRent(days));
				break;
			case "2":
				brand = "别克";
				System.out.print("请输入轿车的型号(2.商务舱GL8 3.林荫大道):");
				String typeNum = in.next();
				String type = null;
				switch (typeNum) {
				case "2":
					type = "商务舱GL8";
					car.setNo("京BK5543");
					System.out.println("分配给您的车牌号为:"+car.getNo());
					car = new Car(car.getNo(),type);
					car.setBrand(brand);
					System.out.println();
					
					System.out.print("顾客您好!您需要支付的租金为:"+car.calcRent(days));
					break;
				case "3":
					type = "林荫大道";
					car.setNo("京BK5543");
					System.out.println("分配给您的车牌号为:"+car.getNo());
					car = new Car(car.getNo(),type);
					car.setBrand(brand);
					System.out.println();
					
					System.out.print("顾客您好!您需要支付的租金为:"+car.calcRent(days));
					break;
				}
				break;
			}
			break;
		case "2":
			kinds = "客车";
			Bus bus = new Bus();
			bus.setNo("京BK5543");
			System.out.print("输入要租凭的汽车座位数:");
			int seats = in.nextInt();
			bus.setSeatCount(seats);
			System.out.println("分配给您的车牌号为:"+bus.getNo());
			bus = new Bus(bus.getNo(),seats);
			System.out.println();
			
			System.out.print("顾客您好!您需要支付的租金为:"+bus.calcRent(days));
			break;
		}
	}

	@Test
	public void test02() throws Exception {
		MotoVehicle[] motos = new MotoVehicle[5];
		motos[0] = new Car("京NY28588","宝马550i");
		motos[1] = new Car("京NNN328","宝马550i");
		motos[2] = new Car("京NY28588","商务舱GL8");
		motos[3] = new Bus("京NY28588",34);
		motos[4] = new Truck("京NY28586",1);
		System.out.print("请输入要租的天数:");
		int days = in.nextInt();
		int calcTotalRent = CarsUtlis.INSTANCE.calcTotalRent(motos, days);
		System.out.println("一共收取租金:"+calcTotalRent);
	}
}
