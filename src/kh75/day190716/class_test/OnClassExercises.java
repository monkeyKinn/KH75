/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课堂练习包
 * @Package: kh75.day190716.class_test 
 * @author: 金聖聰   
 * @date: 2019年7月16日 上午8:54:47 
 */
package kh75.day190716.class_test;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ClassTest.java
* @Description: 课堂练习汇总
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月16日 上午8:54:47 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月16日     金聖聰           v1.0.0               修改原因
*/
public class OnClassExercises {
	public static void main(String[] args) {
		// 分数判断
		// test1();
		// 彩票
		// test2();
		// 多重选择联系之分数档次判断
		// test3();
		// 买车
		// test4();
		// 跑步
		// test5();
		//输入成绩,显示奖励
//		test6();
		//switch 手机自动拨号
		test7();

	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: switch 手机自动拨号
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午12:03:06 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test7() {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入快捷拨号按钮:");
		int num = in.nextInt();
		switch (num) {
		case 1:
			System.out.println("打给爸爸中...");
			break;
		case 2:
			System.out.println("打给妈妈中...");
			break;
		case 3:
			System.out.println("打给爷爷中...");
			break;
		case 4:
			System.out.println("打给奶奶中...");
			break;
		default:
			System.out.println("无默认快捷拨号!");
		}
		in.close();
		boolean a=(9>10);
		System.out.println(a);
	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 输入成绩,显示奖励
	*
	* @param: NULL
	* @return：NULL
	* @throws：NULL
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 上午11:19:24 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test6() {
		Scanner in = new Scanner(System.in);
		System.out.print("输入小明成绩:");
		int score = in.nextInt();
		if (score == 100) {
			System.out.println("爸爸给你买车");
		} else if (score < 100 && score >= 90) {
			System.out.println("妈妈给你买MP4");
		} else if (score < 90 && score >= 60) {
			System.out.println("妈妈给你买参考书");
		} else {
			System.out.println("想什么?滚去读书");
		}
		in.close();
	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 跑步
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 上午11:05:56 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test5() {
		String sex = "女";
		int time = 9;
		if (time <= 10) {
			System.out.println("进决赛");
			if ("男".equals(sex)) {
				System.out.println("进男子组");
			} else {
				System.out.println("进女子组");
			}
		} else {
			System.out.println("回家吧");
		}
	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 买车问题
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 上午10:13:48 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test4() {
		Scanner in = new Scanner(System.in);
		System.out.print("输入已有积蓄:");
		int money = in.nextInt();
		if (money >= 500_0000) {
			System.out.println("买凯迪拉克");
		} else if (money >= 100_0000) {
			System.out.println("买帕萨特");
		} else if (money >= 50_0000) {
			System.out.println("买伊兰特");
		} else if (money >= 10_0000) {
			System.out.println("买奥拓");
		} else {
			System.out.println("买捷安特");
		}
		in.close();

	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 多重选择联系之分数档次判断
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 上午10:04:48 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test3() {
		Scanner in = new Scanner(System.in);
		System.out.print("输入分数:");
		int score = in.nextInt();
		if (score >= 80) {
			System.out.println("优秀");
		} else if (score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不及格");
		}
		in.close();
	}

	/**   
	* @Function: OnClassExercises.java
	* @Description: 买彩票
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 上午9:52:39 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test2() {
		System.out.println("买彩票去喽");
		System.out.print("输入中了多少钱鸭:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num == 500_0000) {
			System.out.println("买车买房希望工程欧洲旅游会所嫩模嗨起来~");
		} else {
			System.out.println("算了下地干活继续买吧");
		}
		input.close();
	}

	/**   
	* @Function: ClassTest.java
	* @Description: 分数判断
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 上午8:59:13 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test1() {
		Scanner in = new Scanner(System.in);
		System.out.print("输入Java成绩:");
		double javaScore = in.nextDouble();
		System.out.print("输入Music成绩:");
		double musicScore = in.nextDouble();
		if ((javaScore > 98 && musicScore > 80) || (javaScore == 100 && musicScore > 70)) {
			System.out.println("外星人一台");
		} else {
			System.out.println("继续加油");
		}
		in.close();
		System.out.println("See U");
	}
}
