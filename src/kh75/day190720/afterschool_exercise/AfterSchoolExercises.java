/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：家作包
 * @Package: kh75.day190720.afterschool_exercise 
 * @author: 金聖聰   
 * @date: 2019年7月21日 下午11:20:01 
 */
package kh75.day190720.afterschool_exercise;

import java.util.Arrays;
import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: AfterSchoolExercise.java
* @Description: 家作总类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月21日 下午11:20:01 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月21日     金聖聰           v1.0.0               修改原因
*/
public class AfterSchoolExercises {
	public static void main(String[] args) {
		// 在数组中插入一个数,位置在原数组的基础上从大到小插入
		// test01();
		// 字符升序逆序输出
		// test02();
		// 一组有序的字符序列a、b、c、e、f、p、u、z，向次字符序列中插入一个新的字符，要求插入之后字符序列仍保持有序
		// test03();
		//求出4家店的最低手机价格
		 test04();

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 求出4家店的最低手机价格
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月22日 上午1:28:03 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月22日     金聖聰           v1.0.0               修改原因
	*/
	private static void test04() {
		Scanner input = new Scanner(System.in);
		double[] prices = new double[4];
		System.out.println("请输入四家店的价格");
		for (int i = 1; i <= 4; i++) {
			System.out.print("第"+i+"家店的价格:");
			prices[i-1]=input.nextInt();
		}
		double min = prices[0];
		double max = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (max<prices[i]) {
				max = prices[i];
			}
			if (min>prices[i]) {
				min = prices[i];
			}
		}
		System.out.println("最低价格:"+min);
		System.out.println("最高价格:"+max);
	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 一组有序的字符序列a、b、c、e、f、p、u、z，向次字符序列中插入一个新的字符，要求插入之后字符序列仍保持有序
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月22日 上午1:06:38 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月22日     金聖聰           v1.0.0               修改原因
	*/
	private static void test03() {
		Scanner input = new Scanner(System.in);
		char[] a = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		// 生序排序
		Arrays.sort(a);
		System.out.println("原字符数组:" + Arrays.toString(a));
		System.out.print("待插入的字符是:");
		char charNum = input.next().charAt(0);
		// 初始化插入数的索引,-1为插入失败
		int index = -1;
		/*
		 * 思路:
		 * 1.得到索引
		 * 2.扩容,并往后移位
		 * 3.把值插入索引位
		 * */
		/***1.得到索引***/
		for (int i = 0; i < a.length; i++) {
			/*
			 * 找规律:
			 * 插入b,index = c的index,num<=c
			 * 插入d,index = u的index,num<=u
			 * 插入y,index = z的index,num<=z
			 * 
			 * */
			if (charNum <= a[i]) {
				index = i;
				break;
			}
		}
		/**索引ok**/
		/**2.扩容
		 * 往后移位
		 * */
		a = Arrays.copyOf(a, a.length + 1);
		for (int i = a.length - 1; i > index; i--) {
			a[i] = a[i - 1];
		}
		/**2.ok**/
		/**3.赋值**/
		a[index] = charNum;
		System.out.println("待插入的下标是:" + index);
		System.out.println("插入后的数组:" + Arrays.toString(a));

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 字符升序逆序输出
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月22日 上午12:40:21 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月22日     金聖聰           v1.0.0               修改原因
	*/
	private static void test02() {
		char[] a = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.println("原数组:" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("升序输出:" + Arrays.toString(a));
		System.out.print("逆序输出:");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 在数组中插入一个数,位置在原数组的基础上从大到小插入
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月21日 下午11:21:09 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月21日     金聖聰           v1.0.0               修改原因
	*/
	private static void test01() {
		Scanner in = new Scanner(System.in);
		// 定义一个[9,7,5,0]数组
		int[] arrs = { 9, 7, 5, 0 };
		System.out.print("请输入要插入的数:");
		int num = in.nextInt();// 6
		/*
		 * Test:原数组
		 */
		// System.out.println("原数组:"+Arrays.toString(arrs));

		// 数组扩容+1
		arrs = Arrays.copyOf(arrs, arrs.length + 1);// 9, 7, 5, 0, 0
		/*
		 * Test:扩容后的数组
		 */
		// System.out.println("扩容后的数组:"+Arrays.toString(arrs));

		/*
		 * 1.找到对应的下标
		 * 2.从那个下标开始数组往后移1位
		 * 3.把那个数插入找到的那个下标的位置
		 * 
		 * */
		/*************1.寻找下标*************/
		// 定义需要插入的数字的下标的初始值为-1(插入失败为-1);
		int index = -1;// 2---- > 结果:[9, 7, 5, 2, 0]
		// 9, 7, 5, 0, 0
		for (int i = 0; i < arrs.length; i++) {// 遍历数组
			/*
			 * 找规律:
			 * 如果输入8 放7的位置 下标为7原来的下标-->8>7-->8>=7
			 * 如果输入6放5的位置 下标为5原来的下标-->6>5-->6>=5
			 * 如果输入4放0的位置 下标为0原来的下标-->4>0-->4>=0
			 * */
			if (num >= arrs[i]) {// 输入的数大于等于某一个元素
				index = i;// 把那个元素的下标当成需要插入的数字的下标
				break;// 跳出循环
			}
		}
		/*
		 * Test:下标值
		 */
		// System.out.println("检测下标值:"+index);// 2

		/*************1.以上,下标已找到*************/

		/*************2.目的:从那个下标开始数组往后移1位,
		 * ***********			为了避免覆盖,循环要从数组最后一位开始(因为是扩容来的,最后一位为默认值),
		 * 						把数组的前一个值给当前值,直到那个下标的后一个(下标值)结束.
		 * 						(如果=那个下标,会出现数组越界异常(当插入第一个值时),对应的,i要-1)*************/
		for (int i = arrs.length - 1; i > index; i--) {
			arrs[i] = arrs[i - 1];
		}
		/*
		 * Test: 移动情况
		 */
		// System.out.println("检测移动情况:"+Arrays.toString(arrs));
		/************2.以上,移动结束***********/
		/************3.把那个数插入找到的那个下标的位置********/
		arrs[index] = num;
		/************3.以上,插入结束***************************/
		System.out.println("下标是:" + index + "\n输入的值是:" + num + "\n最后的结果是:" + Arrays.toString(arrs));

	}
}
