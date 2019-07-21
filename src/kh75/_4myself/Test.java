/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：自己测试自己想法
 * @Package: kh75.self 
 * @author: 金聖聰   
 * @date: 2019年7月12日 上午10:52:24 
 */
package kh75._4myself;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Test.java
* @Description: 测试想法类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月12日 上午10:52:24 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月12日     金聖聰           v1.0.0               修改原因
*/
public class Test {
	public static void main(String[] args) {
		// isLuck();
		// compares();
		 change2Num();
		// testNextLine();
		// testLoop();
//		testSum();
		System.exit(0);
	}

	/**   
	* @Function: Test.java
	* @Description: 100以内偶数和
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月17日 下午4:06:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月17日     金聖聰           v1.0.0               修改原因
	*/
	private static void testSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	/**   
	* @Function: Test.java
	* @Description: 
	*	2012年培养学员25万人，每年增长25%。请问按此增长速度，到哪一年培训学员人数将达到100万人？
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月17日 上午11:16:14 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月17日     金聖聰           v1.0.0               修改原因
	*/
	private static void testLoop() {
		/*	int peopleIn2012 = 25_0000;
			int num = 0;
			while(peopleIn2012<=100_0000){
				peopleIn2012 *= (1+0.25);
		//			peopleIn2012 = (int) (peopleIn2012*(1+0.25));
				num++;//num 6
			}
			num += 2012;
			System.out.println(num);*/
		// int score = 99;
		// System.out.println( (score > 60 && score<100) ? true : false);
	}

	/**   
	* @Function: Test.java
	* @Description: 
	* 				问题1:while前面不能有in.next类似,不然else后用in.nextLine重复打印2遍,只能把前面的判断放while结束的下面;
	* 				问题2:当while前有in.next()类似,else后用in.next即可解决上述问题1,但不知原因		 
	* @Solution:	in.next()和in.nextLine本身的问题,就是要颠倒顺序,就类似与do-while和while一样~
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月17日 上午8:56:47 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月17日     金聖聰           v1.0.0               修改原因
	*/
	private static void testNextLine() {

		Scanner in = new Scanner(System.in);
		System.out.println("请输入是否是会员:(是:y,否:其他)");
		String isVip = in.next();
		System.out.println("请输入消费金额:");
		double money;
		while (true) {
			boolean IsHasNextDouble = in.hasNextDouble();
			if (IsHasNextDouble) {// 是double
				money = in.nextDouble();
				break;
			} else {// 不是double
				System.out.println("输入金额错误,重新输入:");
				// in.next();// 遇到空百符结束(空格，回车，tab 等等)
				in.nextLine();// 遇到回车结束(\r)
			}
		}
		// System.out.println("money=" + money);
		// System.out.println("请输入是否是会员:(是:y,否:其他)");
		// String isVip = in.next();

	}

	/**   
	* @Function: Test.java
	* @Description: 连续输入判断输入打印最大最小
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 下午3:45:58 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void compares() {
		boolean flag = true;
		Scanner in = new Scanner(System.in);
		int[] nums = new int[100];
		for (int i = 0;; i++) {
			System.out.println("请输入一个数:");
			if (in.hasNextInt()) {
				nums[i] = in.nextInt();
				if (in.nextInt() != 0) {
					// todo
					System.out.println(nums[i]);
				} else {
					return;
				}
			} else {
				System.out.println("输入错误");
				in.nextLine();
			}
		}
	}

	/**   
	* @Function: Test.java
	* @Description: 抽奖
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月13日 上午10:01:32 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月13日     金聖聰           v1.0.0               修改原因
	*/
	private static void isLuck() {
		int custNo = getCustNo();
		while (custNo > 20) {
			System.out.println("Nice Luck!");
			return;
		}
		System.out.println("See U");
	}

	/**   
	* @Function: Test.java
	* @Description: 得到会员卡号
	*
	* @param: null
	* @return：int 会员卡号
	* @throws：不是整数类型就提示用户输入错误
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月12日 下午11:01:55 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月12日     金聖聰           v1.0.0               修改原因
	*/
	private static int getCustNo() {
		Scanner in = new Scanner(System.in);
		String num;
		while (true) {
			try {
				System.out.println("输入4位整数:");
				num = in.next();
				if (Integer.valueOf(num) instanceof Integer && num.length() == 4) {
					// System.out.println("整数:" + num);1234
					int k = Integer.valueOf(num) / 1000;
					int b = (Integer.valueOf(num) % 1000) / 100;
					int t = (Integer.valueOf(num) % 100) / 10;
					int g = Integer.valueOf(num) % 10;
					int sum = k + b + t + g;
					// System.out.println(sum);
					in.close();
					return sum;
				} else {
					System.out.println("位数错误!");
				}
			} catch (NumberFormatException e) {
				System.out.println("输入有误!");
			}
		}
	}

	private static void change2Num() {
		/*int a = 9;
		int b = 10;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + "," + b);*/

//		// 99乘法表
//		for (int i = 1; i <= 9; i++) {// 第二个数
//			for (int j = 1; j <= i; j++) {// j第一个数
//				System.out.print(j + "*" + i + "=" + j * i + "\t");
//			}
//			System.out.println();
//
//		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
	}
}
