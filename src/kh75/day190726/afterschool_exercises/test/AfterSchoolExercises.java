/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课后练习包
 * @Package: kh75.day190726.afterschool_exercises.test 
 * @author: 金聖聰   
 * @date: 2019年7月26日 上午11:25:27 
 */
package kh75.day190726.afterschool_exercises.test;

import java.util.Arrays;
import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: AfterSchoolExercises.java
* @Description: 课后练习类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月26日 上午11:25:27 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月26日     金聖聰           v1.0.0               修改原因
*/
public class AfterSchoolExercises {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// 1. If：读入一个整数，判断其是奇数还是偶数
		// test1();

		// 2. 读入一个三位数，计算其各位数字之和。例如：123 各位数字之和为6
		// test2();

		/**
		 * Switch:*读入一个表示年份的整数，判断这一年是否是闰年。如何判断 
					一个年份是否是闰年： 
					1. 如果这个年份能够被4 整除，且不能被100 整除，则这一年是闰年。例 如，
											1996 年是闰年，而相应的，1993 年就不是闰年。 
					2. 如果这个年份能够被100 整除，则这个数必须要能被400 整除，才是闰 年。
											例如，2000 年是闰年，1900 年不是闰年。
		 */
		// test3();

		/**
		 * switch:
		 * 		完成一个简单的计算器程序。程序要求如下： 
				1. 读入两个整数 
				2. 提示用户选择对这两个整数的操作，即输出 
				1 ： + 
				2 ： - 
				3 ： * 
				4 ： / 
				请输入您的选择： 
				读入用户的选择，输出运算结果。
		 */
		// test4();
		// 5. If:读入三个整数，把这三个整数按照由大到小的顺序输出
		// test5();
		// 6:求100 以内所有能被3 整除但不能被5 整除的数字的和
		// test6();
		// 7.输出99 乘法表
		// test7();
		// 8给 定一个数组，把这个数组中所有元素顺序进行颠倒。
		// test8();
		// 9. 输入一个数组，向其插入一个数保存并输出
		// test9();
		// If:读入三个整数，输出这三个整数中最大的一个。
		 test10();
	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 读入三个整数，输出这三个整数中最大的一个。
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 下午1:17:36 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test10() {
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入第" + (i + 1) + "个数:");
			if (in.hasNextInt()) {// 是int
				nums[i] = in.nextInt();
			} else {// 不是int
				System.out.println("Input Error!\nSee U~");
				break;
			}
		}
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("Max:" + max);

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 输入一个数组，向其插入一个数保存并输出
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 下午1:04:33 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test9() {
		System.out.print("输入数组长度:");
		int length;
		// 判断是否合法
		if (in.hasNextInt()) {// 是int
			length = in.nextInt();
			int nums[] = new int[length];
			for (int i = 0; i < nums.length; i++) {
				System.out.print("输入数组的第" + (i + 1) + "个数:");
				// 判断是否合法
				if (in.hasNextInt()) {// 是int
					nums[i] = in.nextInt();
				} else {// 不是int
					System.out.println("Input Error!\nSee U~");
					return;
				}
			}
			System.out.println("输入的数组是:" + Arrays.toString(nums));
			System.out.print("输入插入的数:");
			int insert;
			// 判断是否合法
			if (in.hasNextInt()) {// 是int
				insert = in.nextInt();
				int[] copyOf = Arrays.copyOf(nums, nums.length + 1);
				copyOf[copyOf.length - 1] = insert;
				System.out.println("插入后的数组:" + Arrays.toString(copyOf));
			} else {// 不是int
				System.out.println("Input Error!\nSee U~");

			}
		} else {// 不是int
			System.out.println("Input Error!\nSee U~");
		}

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 给 定一个数组，把这个数组中所有元素顺序进行颠倒。
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 下午12:26:22 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test8() {
		int[] nums = { 1, 5, 6, 9, 7 };
		int[] nus = new int[nums.length];
		System.out.println("原数组为:" + Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			nus[nus.length - i - 1] = nums[i];
		}
		System.out.println("颠倒后为:" + Arrays.toString(nus));

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 输出99 乘法表
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 下午12:25:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test7() {
		// 99乘法表
		for (int i = 1; i <= 9; i++) {// 第二个数
			for (int j = 1; j <= i; j++) {// j第一个数
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();

		}

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 求100 以内所有能被3 整除但不能被5 整除的数字的和
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 下午12:20:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test6() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				sum += i;
			}
		}
		System.out.println("100以内符合要求的数的和为:" + sum);

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: If:读入三个整数，把这三个整数按照由大到小的顺序输出
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 下午12:06:04 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test5() {
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入第" + (i + 1) + "个数:");
			// 判断是否合法
			if (in.hasNextInt()) {// 是int
				nums[i] = in.nextInt();
			} else {// 不是int
				System.out.println("Input Error!\nSee U~");
			}
		}
		// TODO
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[i] < nums[i + 1]) {
					nums[i] = nums[i] ^ nums[i + 1];
					nums[i + 1] = nums[i] ^ nums[i + 1];
					nums[i] = nums[i] ^ nums[i + 1];
				}
			}
		}
		System.out.println("由大到小排列是:" + Arrays.toString(nums));
	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 简单的计算器程序
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 上午11:51:24 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test4() {
		int num1;
		int num2;
		System.out.print("请输入第一个数:");
		// 判断合法
		// 判断是否合法
		if (in.hasNextInt()) {// 是int

			num1 = in.nextInt();
			System.out.print("请输入第二个数");
			// 判断是否合法
			if (in.hasNextInt()) {// 是int
				num2 = in.nextInt();
				System.out.println("1 ： +");
				System.out.println("2 ： -");
				System.out.println("3 ： *");
				System.out.println("4 ： /");
				System.out.print("请输入您的选择：");
				// 判断是否合法
				if (in.hasNextInt()) {// 是int
					int num = in.nextInt();
					switch (num) {
					case 1:
						System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
						break;
					case 2:
						System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
						break;
					case 3:
						System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
						break;
					case 4:
						double results = (double) num1 / num2;
						System.out.println(num1 + "/" + num2 + "=" + results);
						break;

					default:
						System.out.println("Input Error!\nSee U~");
					}

				} else {// 不是int
					System.out.println("Input Error!\nSee U~");
				}

			} else {// 不是int
				System.out.println("Input Error!\nSee U~");
			}

		} else {// 不是int
			System.out.println("Input Error!\nSee U~");
		}

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 判断是否闰年
	*
	* @param:null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 上午11:39:39 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test3() {
		System.out.print("请输入一个年份(整数):");
		// 判断合法
		// 判断是否合法
		if (in.hasNextInt()) {// 是int
			int num = in.nextInt();
			boolean isRun = ((num % 4 == 0) && (num % 100 != 0)) || ((num % 100 == 0) && (num % 400 == 0));
			// 1 是 2不是
			int isRuns = isRun ? 1 : 2;
			switch (isRuns) {
			case 1:
				System.out.println("输入的是闰年");
				break;
			case 2:
				System.out.println("输入的不是闰年");
				break;
			}
		} else {// 不是int
			System.out.println("Input Error!\nSee U~");
		}
	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 读入一个三位数，计算其各位数字之和。例如：123 各位数字之和为6
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 上午11:31:53 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test2() {
		System.out.print("请输入一个三位数:");
		// 判断是否合法
		if (in.hasNextInt()) {// 是int
			int num = in.nextInt();
			if (String.valueOf(num).length() == 3) {// 是三位数
				int ge = num % 10;
				int ten = num % 100 / 10;
				int hun = num / 100;
				System.out.println("三位数之和为:" + (ge + ten + hun));
			} else {// 不是三位数
				System.out.println("输入的不是三位数!");
			}
		} else {// 不是int
			System.out.println("Input Error!\nSee U~");
		}
	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: If：读入一个整数，判断其是奇数还是偶数
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月26日 上午11:26:34 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月26日     金聖聰           v1.0.0               修改原因
	*/
	private static void test1() {
		System.out.print("请输入一个数:");
		// 判断是否合法
		if (in.hasNextInt()) {// 是int
			int num = in.nextInt();
			if (num % 2 == 0) {// 是偶数
				System.out.println("输入的是偶数!");
			} else {
				System.out.println("输入的不是偶数!");
			}
		} else {// 不是int
			System.out.println("Input Error!\nSee U~");
		}
	}
}
