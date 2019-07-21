/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课堂练习包
 * @Package: kh75.day190720.class_test 
 * @author: 金聖聰   
 * @date: 2019年7月20日 下午2:19:09 
 */
package kh75.day190720.class_test;

import java.util.Arrays;
import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: OnClassExercise.java
* @Description: 课堂练习类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月20日 下午2:19:09 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月20日     金聖聰           v1.0.0               修改原因
*/
public class OnClassExercise {
	public static void main(String[] args) {

		// 声明初始化数组
		// test01();
		// 计算平均分
		// test02();
		// 猜数字游戏
		// test03();
		// 清单及总金额
		// test04();
		// 求数组的最大最小
		// test05();
		//Arrays
		test06();
	}

	/**   
	* @Function: OnClassExercise.java
	* @Description: Arrays常用方法
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月20日 下午5:09:07 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月20日     金聖聰           v1.0.0               修改原因
	*/
	private static void test06() {
		int[] a1 = {9,5,8,10,33};
		int[] a2 = {9,5,8,10,33};
		int[] a3 = {5,8,10,33};
		
		boolean equals = Arrays.equals(a1, a2);
		boolean equals2 = Arrays.equals(a1, a3);
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		int num = Arrays.binarySearch(a1,10);
		System.out.println(num);
		int[] copyOf = Arrays.copyOf(a1, 6);
		System.out.println("444444"+Arrays.toString(copyOf));
		Arrays.fill(a2,6);
		System.out.println(Arrays.toString(a2));
		System.out.println(equals +"," +equals2);
	}

	/**   
	* @Function: OnClassExercise.java
	* @Description: 求数组的最大最小
	*
	* @param: null		
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月20日 下午4:24:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月20日     金聖聰           v1.0.0               修改原因
	*/
	private static void test05() {
		int[] a = { 1, 5, 9, 8, 7, 3, 0, 200 };
		int max = a[0];
		int min = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
			sum += a[i];
		}
		System.out.println("Max:" + max);
		System.out.println("Min:" + min);
		System.out.println("Ave:" + (double) sum / a.length);
	}

	/**   
	* @Function: OnClassExercise.java
	* @Description: 清单及总金额
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月20日 下午3:52:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月20日     金聖聰           v1.0.0               修改原因
	*/
	private static void test04() {
		Scanner in = new Scanner(System.in);
		double[] goods = new double[5];
		double sum = 0;
		for (int i = 1; i <= goods.length; i++) {
			System.out.print("请输入第" + i + "笔购物金额:");
			goods[i - 1] = in.nextDouble();
		}
		System.out.println("----------------------------");
		System.out.println("序号\t\t 金额(元)");
		for (int i = 1; i <= goods.length; i++) {
			System.out.println(i + "\t\t" + goods[i - 1]);
			sum += goods[i - 1];
		}

		System.out.println("总金额\t\t" + sum);
	}

	/**   
	* @Function: OnClassExercise.java
	* @Description: 猜数字
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月20日 下午3:16:05 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月20日     金聖聰           v1.0.0               修改原因
	*/
	private static void test03() {
		Scanner in = new Scanner(System.in);
		int[] nums = { 8, 4, 2, 1, 23, 344, 12 };
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i != nums.length - 1) {
				System.out.print(",");
			}

		}

		System.out.println();
		System.out.println("----------------------------");
		int sum = 0;
		for (int i : nums) {
			sum = i;
		}
		System.out.print("Sum:" + sum);
		System.out.println();
		System.out.println("----------------------------");
		System.out.print("猜哪一个数在里面:");
		int num = in.nextInt();
		boolean flag = false;
		for (int i : nums) {
			if (num == i) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "猜对了" : "猜错了");
		in.close();
	}

	/**   
	* @Function: OnClassExercise.java
	* @Description: 计算平均分
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月20日 下午2:59:48 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月20日     金聖聰           v1.0.0               修改原因
	*/
	private static void test02() {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("请输入人数:");
		num = in.nextInt();
		int[] a = new int[num];
		for (int i = 1; i <= a.length; i++) {
			System.out.print("No." + i + "号的成绩:");
			a[i - 1] = in.nextInt();
		}
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println("平均分:" + (double) sum / a.length);
		in.close();
	}

	/**   
	* @Function: OnClassExercise.java
	* @Description: 声明初始化数组
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月20日 下午2:57:48 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月20日     金聖聰           v1.0.0               修改原因
	*/
	private static void test01() {
		int[] a = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 2;
		}
		int[] b = new int[3];
		for (int i = 0; i < b.length; i++) {
			b[i] = i + 3;
		}
		int[] c = { 20, 21, 22 };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println("----------------------------");

		String str = "adc";
		System.out.println(str.length());
		System.out.println("QQ输入法导致git客户端报错");
	}
}
