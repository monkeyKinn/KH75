/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190727.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年7月27日 下午2:42:09 
 */
package kh75.day190727.class_test.test;

import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestSum.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月27日 下午2:42:09 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月27日     金聖聰           v1.0.0               修改原因
*/
public class TestSumAndAvg {
	Scanner in = new Scanner(System.in);
	int sum = 0;

	public void getInfo() {
		System.out.println("总成绩:" + getSum());
		System.out.println("平均分:" + getAve());
	}

	private int getSum() {
		String name;
		for (int i = 1; i <= 3; i++) {
			System.out.print("请输入要录入的课程名:");
			name = in.next();
			System.out.print("请输入第" + name + "的成绩:");
			sum += in.nextInt();
		}
		return sum;
	}

	private double getAve() {
		return sum / 3;
	}

	public String zhaZhi(String fru,int num) {
		return fru + "汁"+num+"杯";
	}

	public static void main(String[] args) {
//		new TestSumAndAvg().getInfo();
		System.out.println(new TestSumAndAvg().zhaZhi("葡萄",100));
	}
}
