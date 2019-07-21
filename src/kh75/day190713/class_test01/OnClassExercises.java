/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课堂练习包
 * @Package: kh75.day190713.test01 
 * @author: 金聖聰   
 * @date: 2019年7月13日 下午3:06:47 
 */
package kh75.day190713.class_test01;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: OnClassExercises.java
* @Description: 课堂练习汇总
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月13日 下午3:06:47 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月13日     金聖聰           v1.0.0               修改原因
*/
public class OnClassExercises {
	public static void main(String[] args) {
		//用变量实现MP3存储
		test01();
		System.out.println("----------------------------");
		//最高分获得
		test02();
		System.out.println("----------------------------");
		//键盘输入Scanner练习
		test03();
		
	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 键盘输入Scanner练习
	*
	* @param: null
	* @return：coid
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 下午4:50:11 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void test03() {
		//new扫描器,用于用户输入
		Scanner in = new Scanner(System.in);
		System.out.print("输入姓名:");
		System.out.println("姓名:"+in.next());//把输入的String类型值输出
		System.out.print("输入年龄:");
		System.out.println("年龄:"+in.nextInt());//把输入的int类型值输出
		System.out.print("输入分数:");
		System.out.println("分数:"+in.nextDouble());//把输入的double类型值输出
		in.close();//关闭资源
	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 最高分获得
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 下午3:13:26 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void test02() {
		double score = 98.5;
		String name = "张三";
		char gender = '男';
		System.out.println("Java最高分:"+score+"\n"+
							"最高分获得者:"+name+"\n"+
							"获得者性别:"+gender+"\n");
		
	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 用变量实现MP3存储
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 下午3:08:13 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void test01() {
		//品牌
		String brand = "爱国者F928";
		double weight = 12.4;
		String type = "内置锂电池";
		int price = 499;
		System.out.println("-----------MP3 INFORMATION---------");
		
		System.out.println("品牌:"+brand+"\n"+
							"重量:"+weight+"\n"+
							"电池类型:"+type+"\n"+
							"价格:"+price);
	}
}
