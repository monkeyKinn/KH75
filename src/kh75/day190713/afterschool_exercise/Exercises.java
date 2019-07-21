/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：第二章.课后作业包 P33-34 + 老师截图
 * @Package: kh75.day190713.afterschoolExercise 
 * @author: 金聖聰   
 * @date: 2019年7月13日 上午11:23:49 
 */
package kh75.day190713.afterschool_exercise;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Exercises.java
* @Description: 课后作业类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月13日 上午11:23:49 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月13日     金聖聰           v1.0.0               修改原因
*/
public class Exercises {
	public static void main(String[] args) {
		// // 计算工资
		// test1();
		// // 互换纸牌
		// test2();
		// // 银行存钱
		// test3();
		// 控制台输入成绩
		// test4();
		// 根据天数计算周数和剩余的天数
		// test5();
		// 圆的面积
		// test6();
		// 打印购物小票
		// test7();
		// 抽奖
		test8();
	}

	/**   
	* @Function: Exercises.java
	* @Description: 抽奖
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月14日 下午3:40:34 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月14日     金聖聰           v1.0.0               修改原因
	*/
	private static void test8() {
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.print("请输入4位会员卡号:");
			if (in.hasNextInt()) {
				int num = in.nextInt();
				if (String.valueOf(num).length() == 4) {
					// 1234
					int thousand = num / 1000;// 千位
					int hundred = num % 1000 / 100;// 百位
					int ten = num % 100 / 10;// 十位
					int unit = num % 10;// 个位
					int sum = thousand + hundred + ten + unit;
					System.out.println("会员卡号" + num + "的各位数之和:" + sum);
					System.out.println("是否是幸运客户?" + (sum > 20 ? " true" : " false"));
					in.close();
					return;//结束整个抽奖
				} else {
					System.out.println("输入的不是四位数!请重新输入!");
					in.nextLine();//吃空格,避免死循环
				}
			} else {
				System.out.println("输入错误!请重新输入!");
				in.nextLine();//吃空格,避免死循环
			}
		}
	}

	/**   
	* @Function: Exercises.java
	* @Description: 打印购物小票,计算积分
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月14日 下午3:03:16 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月14日     金聖聰           v1.0.0               修改原因
	*/
	private static void test7() {
		String[] names = new String[] { "T恤", "网球鞋", "网球拍" };
		int[] prices = new int[] { 245, 570, 320 };
		int[] nums = new int[] { 2, 1, 1 };
		int[] spends = new int[] { prices[0] * nums[0], prices[1] * nums[1], prices[2] * nums[2] };
		// 折扣
		double discount = 0.8;
		// 声明总消费,初始值为0
		double total = 0;
		for (int i : spends) {
			total += i;
		}
		total *= discount;
		// 实际交费
		int reality = 1500;
		// 找零
		double change = reality - total;
		// 积分
		int integral = (int) (0.0299 * total);

		System.out.println("*****************消费单*****************");
		System.out.println("购买物品\t\t单价\t\t个数\t\t金额");
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + "\t\t\t￥" + prices[i] + "\t\t" + nums[i] + "\t\t￥" + spends[i]);
		}
		System.out.println();
		System.out.println("折扣:" + discount * 10);
		System.out.println("消费总额:" + total);
		System.out.println("实际交费:" + reality);
		System.out.println("找零:" + change);
		System.out.println("本次购物所获积分:" + integral);

	}

	/**   
	* @Function: Exercises.java
	* @Description: 已知圆的半径(1.5)求面积
	*
	* @param:	null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月14日 下午2:59:03 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月14日     金聖聰           v1.0.0               修改原因
	*/
	private static void test6() {
		// 圆周率
		final double PI = 3.14159;
		// 半径
		double r = 1.5;
		// 圆的面积
		double s = PI * r * r;
		System.out.println("圆的面积为:" + s);
	}

	/**   
	* @Function: Exercises.java
	* @Description: 根据天数计算周数和剩余的天数
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月14日 下午2:51:41 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月14日     金聖聰           v1.0.0               修改原因
	*/
	private static void test5() {
		int days = 46;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println("一共有" + days + "天," + "共分" + weeks + "周," + "多" + leftDays + "天");
	}

	/**   
	* @Function: Exercises.java
	* @Description: 输入三门成绩 java和SQl的分数差,平均分
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 下午5:29:31 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void test4() {
		Scanner in = new Scanner(System.in);
		double javas = 0;
		double sqls = 0;
		double pss = 0;
		System.out.println("输入Java成绩:");
		if (in.hasNextDouble()) {
			javas = in.nextDouble();
		} else {
			System.out.println("输入错误");
		}
		System.out.println("输入SQL成绩:");
		if (in.hasNextDouble()) {
			sqls = in.nextDouble();
		} else {
			System.out.println("输入错误");
		}
		System.out.println("输入PS成绩:");
		if (in.hasNextDouble()) {
			pss = in.nextDouble();
		} else {
			System.out.println("输入错误");
		}
		System.out.println("Java和SQL分数差:" + Math.abs((javas - sqls)));
		System.out.println("平均分:" + (javas + sqls + pss) / 3);
		in.close();
	}

	/**   
	* @Function: Exercises.java
	* @Description: 银行存钱
	*
	* @param: null
	* @return：null,控制台输出
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 下午12:16:44 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void test3() {
		// Scanner扫描用户键盘输入
		Scanner in = new Scanner(System.in);
		// 双精度型 money变量
		double money;
		// 控制循环为死循环 循环显示菜单
		while (true) {

			System.out.print("输入本金:");

			if (in.hasNextDouble()) {// 如果输入的数是双精度
				// 输入的值赋给money
				money = in.nextDouble();
				System.out.println("本金:" + money);
				// 一年本息
				double one = money * (0.0225 + 1);
				// 2年本息
				double two = money * (0.027 * 2 + 1);
				// 3年本息
				double three = money * (0.0324 * 3 + 1);
				// 5年本息
				double five = money * (0.036 * 5 + 1);
				System.out.println("存取1年后本息:" + one);
				System.out.println("存取2年后本息:" + two);
				System.out.println("存取3年后本息:" + three);
				System.out.println("存取5年后本息:" + five);
				in.close();// 关闭扫描器
				return;// 结束方法
			} else {// 输入的不是双进度
				System.out.println("输入错误!");
				in.nextLine();// 消除回车,避免死循环
			}

		}
	}

	/**   
	* @Function: Exercises.java
	* @Description: 互换纸牌
	*
	* @param: null
	* @return：null ,控制台输出
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 下午12:10:39 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void test2() {
		int left = 10;
		int right = 8;
		System.out.println("互换前纸牌:");
		System.out.println("左手:" + left);
		System.out.println("右手:" + right);
		System.out.println();
		int temp = left;// 定义临时变量
		left = right;
		right = temp;
		System.out.println("互换后纸牌:");
		System.out.println("左手:" + left);
		System.out.println("右手:" + right);
	}

	/**   
	* @Function: Exercises.java
	* @Description: 计算工资
	*
	* @param: null
	* @return：noll ,交给控制台打印
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 上午11:25:17 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void test1() {
		Scanner in = new Scanner(System.in);
		double salary;
		while (true) {
			System.out.print("请输入基本工资:");
			if (in.hasNextDouble()) {// 输入的数是double类型
				salary = in.nextDouble();
				double wj = salary * 0.4;
				double house = salary * 0.25;
				double base = salary + wj + house;
				System.out.println("工资详请如下:");
				System.out.println(
						"基本工资:" + salary + "\n" + "物价津贴:" + wj + "\n" + "房屋津贴:" + house + "\n" + "员工薪水:" + base + "\n");
				in.close();// 关闭资源
				return;
			} else {// 不是double类型
				System.out.println("输入错误");
				in.nextLine();// 吃回车,避免死循环
			}
		}
	}
}
