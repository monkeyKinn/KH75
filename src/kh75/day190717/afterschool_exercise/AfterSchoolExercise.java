/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课后作业包
 * @Package: kh75.day190717.afterschool_exercise 
 * @author: 金聖聰   
 * @date: 2019年7月17日 下午5:13:51 
 */
package kh75.day190717.afterschool_exercise;

import java.util.Scanner;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: AfterSchoolExercise.java
* @Description: 课后作业测试类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月17日 下午5:13:51 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月17日     金聖聰           v1.0.0               修改原因
*/
public class AfterSchoolExercise {
	Scanner in = new Scanner(System.in);

	@Test
	public void test01() {// 升级菜单切换
		System.out.println("欢迎使用MyShopping管理系统");
		System.out.println();
		System.out.println("********************************************");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.购物结算");
		System.out.println("\t\t3.真情回馈");
		System.out.println("\t\t4.注销");
		System.out.println("********************************************");
		System.out.println();
		while (true) {
			System.out.print("请输入菜单编号:");
			if (in.hasNextInt()) {// 输入的数是整型
				int num = in.nextInt();
				switch (num) {
				case 1:
					System.out.println("客户信息列表...略");
					System.out.println("程序结束");
					return;
				case 2:
					System.out.println("购物结算列表...略");
					System.out.println("程序结束");
					return;
				case 3:
					System.out.println("真情回馈列表...略");
					System.out.println("程序结束");
					return;
				case 4:
					System.out.println("谢谢使用,再见");
					System.exit(0);

				default:
					System.out.println("输入的数字非法,请重新输入!");
					in.nextLine();
				}
			} else {// 输入的不是整型
				System.out.println("输入的不是整型,请重新输入!");
				in.nextLine();
			}
		}
	}

	@Test
	public void test02() {// 读入一个整数，表示一个人的年龄。
		/*（if 语句）读入一个整数，表示一个人的年龄。
		 * 如果小于6 岁，则输出“儿童”， 
		 * 6 岁到13 岁，输出“少儿”； 
		 * 14 岁到17 岁，输出“青少年”； 
		 * 18 岁到35 岁， 输出“青年”；
		 * 36 岁到50 岁，输出“中年”；
		 * 50 岁以上输出“中老年”*/
		System.out.print("输入一个整数:");
		int age = in.nextInt();
		if (age <= 6) {
			System.out.println("儿童");
		} else if (age <= 13 && age > 6) {
			System.out.println("少儿");
		} else if (age <= 17 && age > 13) {
			System.out.println("青少年");
		} else if (age <= 35 && age > 17) {
			System.out.println("青年");
		} else if (age <= 50 && age > 35) {
			System.out.println("中年");
		} else {
			System.out.println("中老年");
		}
	}

	@Test
	public void test03() {// 五福
		/*（switch 语句）读入一个整数，如果是1~5 之间，则分别输出5 个福娃的名字，
		 * 										否则输出“北京欢迎你”。*/
		System.out.print("输入一个整数:");
		int num = in.nextInt();
		switch (num) {
		case 1:
			System.out.println("敬业");
			break;
		case 2:
			System.out.println("富强");
			break;
		case 3:
			System.out.println("爱国");
			break;
		case 4:
			System.out.println("友善");
			break;
		case 5:
			System.out.println("和谐");
			break;

		default:
			System.out.println("北京欢迎你");
		}
	}

	@Test
	public void test04() {// 比较三个数大小
		/*（if 语句，赋值操作）*读入三个整数，输出这三个整数中最大的一个。*/
		System.out.println("输入整数a:");
		int a = in.nextInt();
		System.out.println("输入整数b:");
		int b = in.nextInt();
		System.out.println("输入整数c:");
		int c = in.nextInt();
		if (a > b) {// a>b a大
			if (a > c) {// a>c a大
				System.out.println("a大");
				return;
			}
			System.out.println("c大");
		} else {// b大
			if (b > c) {
				System.out.println("b大");
				return;
			}
			System.out.println("c大");
		}
	}

	@Test
	public void test05() {// 判断是否闰年
		/*（if 语句）*读入一个表示年份的整数，判断这一年是否是闰年。如何判断
		一个年份是否是闰年： 
		1. 如果这个年份能够被4 整除，且不能被100 整除，则这一年是闰年。例 
		如，1996 年是闰年，而相应的，1993 年就不是闰年。 
		2. 如果这个年份能够被100 整除，则这个数必须要能被400 整除，才是闰 
		年。例如，2000 年是闰年，1900 年不是闰年。 */
		System.out.println("请输入一个年份:");
		int year = in.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}

	@Test
	public void test06() {// 简单的计算器程序
		/*（switch 语句）*完成一个简单的计算器程序。程序要求如下： 
		1. 读入两个整数 
		2. 提示用户选择对这两个整数的操作，即输出 
		1 ： + 
		2 ： - 
		3 ： * 
		4 ： / 
		请输入您的选择： 
		读入用户的选择，输出运算结果。 */
		System.out.print("请输入整数a:");
		int a = in.nextInt();
		System.out.print("请输入整数b:");
		int b = in.nextInt();
		System.out.println("1: +");
		System.out.println("2: -");
		System.out.println("3: *");
		System.out.println("4: /");
		System.out.println("请选择操作");
		int num = in.nextInt();
		switch (num) {
		case 1:
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case 2:
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case 3:
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case 4:
			System.out.println(a + "/" + b + "=" + (a / (double) b));
			break;

		default:
			System.out.println("输入序号错误,再见");
		}
	}

	@Test
	public void test07() {// 托运费问题
		/*（if 语句）*托运计费问题： 
		当货物重量小于20 公斤的时候，
				   收费5 元，
				   大于20 公斤小于100 公斤的时候
				   	超出20 公斤的部分按每0.2 元每公斤计费，
				   如果超出100 公斤的时候
				   	超出的部分按照每公斤0.15 元计算。 
		读入货物的重量，输出计算之后货物的运费。 */
		System.out.print("输入货物的重量:");
		double weight = in.nextDouble();
		if (weight <= 20) {
			System.out.println("运费5元");
		} else if (weight > 20 && weight <= 100) {
			System.out.println("运费:" + (5 + (weight - 20) * 0.2));
		} else {
			System.out.println("运费:" + (5 + (weight - 20) * 0.15));
		}
	}

	@Test
	public void test08() {// 税后实际收入
		/*（if 语句）*中国的个税计算方法： 
		应税所得为税前收入扣除2000 元（起征点），然后超出部分，按照以下税率 
		收税：
		超出 				利率 
		500 				5% 
		500-2000 			10% 
		2000-5000 			15% 
		5000-20000 			20% 
		20000-40000 		25% 
		40000-60000 		30% 
		60000-80000 		35% 
		80000-100000 		40% 
		100000 - ? 		45% 
		例：
		若月收入1_5000，则应税所得为15000-2000=13000；
		总的个人所得税为 
		（13000-5000）*20% + （5000-2000）*15% + （2000-500）*10% + 500*5%= 2225 
		要求：读入一个整数，表示税前收入，输出应当缴纳的个人所得税和税后实
		际收入。*/
		System.out.print("输入税前收入:");
		// 税前
		int preTax = in.nextInt();
		// 应税所得
		int taxableIncome = preTax - 2000;
		// 个人所得税
		double personalTax = 0;
		if (!(taxableIncome <= 0)) {// 需要收税,以下应税所得是大于0的
			if (taxableIncome <= 500) {
				// 个税
				personalTax = taxableIncome * 0.05;
				preTax -= personalTax;
			} else if (taxableIncome <= 2000) {
				// 个税
				personalTax = 500 * 0.05 + (taxableIncome - 500) * 0.1;
				// 税后收入
				preTax -= personalTax;
			} else if (taxableIncome <= 5000) {
				// 个税
				personalTax = 500 * 0.05 + 2000 * 0.1 + (taxableIncome - 500 - 2000) * 0.15;
				// 税后收入
				preTax -= personalTax;
			} else if (taxableIncome <= 20000) {
				// 个税
				personalTax = 500 * 0.05 + 2000 * 0.1 + 5000 * 0.15 + (taxableIncome - 500 - 2000 - 5000) * 0.2;
				// 税后收入
				preTax -= personalTax;
			} else if (taxableIncome <= 40000) {
				// 个税
				personalTax = 500 * 0.05 + 2000 * 0.1 + 5000 * 0.15 + 20000 * 0.2
						+ (taxableIncome - 500 - 2000 - 5000 - 20000) * 0.25;
				// 税后收入
				preTax -= personalTax;
			} else if (taxableIncome <= 60000) {
				// 个税
				personalTax = 500 * 0.05 + 2000 * 0.1 + 5000 * 0.15 + 20000 * 0.2 + 40000 * 0.25
						+ (taxableIncome - 500 - 2000 - 5000 - 20000 - 40000) * 0.3;
				// 税后收入
				preTax -= personalTax;
			} else if (taxableIncome <= 80000) {
				// 个税
				personalTax = 500 * 0.05 + 2000 * 0.1 + 5000 * 0.15 + 20000 * 0.2 + 40000 * 0.25 + 60000 * 0.3
						+ (taxableIncome - 500 - 2000 - 5000 - 20000 - 40000 - 60000) * 0.35;
				// 税后收入
				preTax -= personalTax;
			} else if (taxableIncome <= 10000) {
				// 个税
				personalTax = 500 * 0.05 + 2000 * 0.1 + 5000 * 0.15 + 20000 * 0.2 + 40000 * 0.25 + 60000 * 0.3
						+ 80000 * 0.35 + (taxableIncome - 500 - 2000 - 5000 - 20000 - 40000 - 60000 - 80000) * 0.4;
				// 税后收入
				preTax -= personalTax;
			} else {
				// 个税
				personalTax = 500 * 0.05 + 2000 * 0.1 + 5000 * 0.15 + 20000 * 0.2 + 40000 * 0.25 + 60000 * 0.3
						+ 80000 * 0.35 + 80000 * 0.4
						+ (taxableIncome - 500 - 2000 - 5000 - 20000 - 40000 - 60000 - 80000 - 100000) * 0.45;
				// 税后收入
				preTax -= personalTax;
			}
			System.out.println("缴纳的个税:" + personalTax);
			System.out.println("税后收入:" + preTax);
		} else {// 不要收税
			System.out.println("缴纳的个税:0");
			System.out.println("税后收入:" + preTax);
		}

	}

	@Test
	public void test09() {// 计算其各位数字之和
		/*（if 语句，操作符）**读入一个三位数，计算其各位数字之和。例如：123 
		各位数字之和为6 */
		System.out.println("输入一个三位整数:");
		int number = in.nextInt();
		int ge = number % 10;
		System.out.println("个:" + ge);
		int shi = number % 100 / 10;
		System.out.println("十:"+shi);
		int bai = number/100;
		System.out.println("百:"+bai);
		System.out.println("他们的和为:"+(ge+shi+bai));
	}
	
	@Test
	public void test10(){//三个整数按照由大到小的顺序输出
		 /*（if 语句）**读入三个整数，把这三个整数按照由大到小的顺序输出。 */
		System.out.println("输入一个整数a=");
		int a = in.nextInt();
		System.out.println("输入一个整数b=");
		int b = in.nextInt();
		System.out.println("输入一个整数c=");
		int c = in.nextInt();
		if (a>b) {//a大,b小
			if(a>c){//a大
//				System.out.println(a+"大");
				if(b>c){//b大
					System.out.println(a+"\t"+b+"\t"+c);
				}else {
					System.out.println(a+"\t"+c+"\t"+b);
				}
			}else {//a小
				System.out.println(c+"\t"+a+"\t"+b);
			}
		} else {//b大
			if(b>c){//b大
//				System.out.println(b+"大");
				if(a>c){//a大
					System.out.println(b+"\t"+a+"\t"+c);
				}else{
					System.out.println(b+"\t"+c+"\t"+a);
				}
			}else {//b小
				System.out.println(c+"\t"+b+"\t"+a);
			}
		}
	}

	@Test
	public void test11(){//计算1+2+3+...+100 的和   USE while
		/*计算1+2+3+...+100 的和 */
		int sum = 0;
		int i = 1;
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println("和为:"+sum);
		
	}
	
	@Test
	public void test12(){//计算1+3+5+...+99 的和 USE do-while
		/*计算1+3+5+...+99 的和 */
		int sum = 0;
		int i = 1;
		do{
			sum += i;
			i += 2;
		}while(i<=99);
		System.out.println("和为:"+sum);
		
	}
}
