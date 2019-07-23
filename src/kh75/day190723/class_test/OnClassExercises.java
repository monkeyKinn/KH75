/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课堂练习包
 * @Package: kh75.day190723.class_test 
 * @author: 金聖聰   
 * @date: 2019年7月23日 上午8:48:34 
 */
package kh75.day190723.class_test;

import java.util.Arrays;
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: OnClassExercises.java
* @Description: 课堂练习类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月23日 上午8:48:34 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月23日     金聖聰           v1.0.0               修改原因
*/
public class OnClassExercises {
	Scanner in = new Scanner(System.in);

	@Test
	public void test01() {// 计算三个班各四名学生的成绩
		int count = 0;
		for (int i = 1; i <= 3; i++) {
			double sum = 0;
			System.out.println("第" + i + "个班的成绩:");
			for (int j = 0; j < 4; j++) {
				System.out.print("第" + (j + 1) + "名学生的成绩:");
				int score = in.nextInt();
				sum += score;
				if (score > 85) {
					count++;
				}
			}
			System.out.println("第" + i + "个班的平均成绩是:" + sum / 4);
			System.out.println();
		}
		System.out.println("成绩大于85分的人数有" + count + "人");
	}

	@Test
	public void test02() {// 打印矩形 5*5
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void test03() {// 直角三角形
		/*
		1 			*
		2 			***
		3 			*****
		4 			*******
		5 			*********
		*/
		System.out.print("输入直角三角形的行数:");
		int num = in.nextInt();
		for (int i = 1; i <= num; i++) {// 行数
			for (int j = 1; j <= 2 * i - 1; j++) {// 每行的规律 2*i-1
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void test04() {
		/*
		1 					*****   
		2 					****
		3 					***
		4 					**
		5 					*
		*/
		System.out.print("输入直角三角形的行数:");
		int num = in.nextInt();
		for (int i = num; i >= 0; i--) {// 5行
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void test05() {// 等腰三角
		System.out.print("输入倒等腰三角形的行数:");
		int num = in.nextInt();
		for (int i = 1; i <= num; i++) {// num行
			/*	
			
			 	  *
			 	 ***
			 	*****
			   *******
			  *********
			
			*/
			/*
			 * 1  4空1*
			 * 	  num-1   2*1-1
			 * 
			 * 2  3空3*
			 *    num-2   2*2-1
			 * 3  2空5*
			 *    num-3   2*3-1
			 * */
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	@Test
	public void test06() {// 99乘法表
		/*
				1*1=1	
				1*2=2	2*2=4	
				1*3=3	2*3=6	3*3=9	
				1*4=4	2*4=8	3*4=12	4*4=16	
				1*5=5	2*5=10	3*5=15	4*5=20	5*5=25	
				1*6=6	2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	
				1*7=7	2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	
				1*8=8	2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	
				1*9=9	2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81	
		
		*/
		for (int i = 1; i <= 9; i++) {// no.2
			for (int j = 1; j <= i; j++) {// no.1
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}

	@Test
	public void test07() {// 冒泡算法
		int[] arrs = { 16, 25, 9, 90, 23 };
		// char[] arrs = { 'c', 'j', 'o', 'e', 'm' };
		System.out.println("排序前" + Arrays.toString(arrs));
		for (int i = 0; i < arrs.length - 1; i++) {
			for (int j = 0; j < arrs.length - 1 - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					arrs[j] = (char) (arrs[j] ^ arrs[j + 1]);
					arrs[j + 1] = (char) (arrs[j] ^ arrs[j + 1]);
					arrs[j] = (char) (arrs[j] ^ arrs[j + 1]);
				}
			}
		}
		System.out.println("升序排序后" + Arrays.toString(arrs));
		for (int i = 0; i < arrs.length - 1; i++) {
			for (int j = 0; j < arrs.length - i - 1; j++) {
				if (arrs[j] < arrs[j + 1]) {
					arrs[j] = (char) (arrs[j] ^ arrs[j + 1]);
					arrs[j + 1] = (char) (arrs[j] ^ arrs[j + 1]);
					arrs[j] = (char) (arrs[j] ^ arrs[j + 1]);
				}
			}
		}
		System.out.println("降序排序后" + Arrays.toString(arrs));
	}

	@Test
	public void test08() {//五家店,每家最多买三件衣服
		int count =0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("----------------------------");
			System.out.println("欢迎光临第"+i+"店");
			for (int j = 0; j < 3; j++) {
				System.out.println("要离开吗(y/n)?");
				String str = in.next();
				if ("y".equals(str.toLowerCase())) {
					System.out.println("离开店结账");
					break;
				}else {
					System.out.println("买了一件衣服");
					count++;
					continue;
				}
			}
		}
		System.out.println("买了"+count+"件");
	}
}
