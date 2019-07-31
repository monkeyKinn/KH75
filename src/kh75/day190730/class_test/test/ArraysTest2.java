/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190730.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年7月30日 上午9:44:34 
 */
package kh75.day190730.class_test.test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ArraysTest2.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 上午9:44:34 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class ArraysTest2 {
	private int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	private double getAvg(int[] arr){
		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		return avg;
	}
	public static void main(String[] args) {
		ArraysTest2 arraysTest2 = new ArraysTest2();
		int[] arr = {10,20,8};
		int max = arraysTest2.getMax(arr);
		System.out.println("MAX:"+max);
		double avg = arraysTest2.getAvg(arr);
		System.out.println("Avg:"+avg);
	}
}
