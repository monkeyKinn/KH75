/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：课后联系打包
 * @Package: kh75.day190716.afterschool_exercise 
 * @author: 金聖聰   
 * @date: 2019年7月16日 下午2:36:16 
 */
package kh75.day190716.afterschool_exercise;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: AfterSchoolExercise.java
* @Description: 课后练习类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月16日 下午2:36:16 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月16日     金聖聰           v1.0.0               修改原因
*/
public class AfterSchoolExercise {

	public static void main(String[] args) {
		// 编写一个Java程序（抛硬币），输入硬币的正反面，判断要做什么事情。
		// test01();
		// 编写一个Java程序（打篮球），输入人数，如果人数小于10人，就打半场，否则就是全场
		// test02();
		// 编写一个Java程序（看病），输入体温，如果体温小于38度，一切正常，否则就是去医院挂点滴
		// test03();
		// 编写一个Java程序（交作业），输入时间，如果时间在12点之前，提交作业不会受到处罚，否则就是抄代码20遍
		// test04();
		// 实现菜单互相转换
		// test05ToLogin();
		// 实现商品换购
		// test06();
		// 判断享受的折扣
		// test07();
		// 购物车结算
		test08();

	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 购物车结算
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午8:02:02 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test08() {
		double money;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入是否是会员:(是:y,否:其他)");
		String isVip = in.next();
		System.out.println("请输入消费金额:");
		while (true) {
			if (in.hasNextDouble()) {// 是double
				money = in.nextDouble();
				break;
			} else {// 不是double
				System.out.println("输入金额错误,重新输入:");
				// in.nextLine();
				in.next();
			}
		}
		if ("y".equals(isVip)) {// 是会员
			if (money >= 200) {
				money *= 0.75;
			} else {
				money *= 0.8;
			}
			System.out.println("实际支付:" + money);
		} else {// 不是会员
			if (money >= 100) {
				money *= 0.9;
			}
			System.out.println("实际支付:" + money);
		}
	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 判断享受的折扣
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午7:51:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test07() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("请输入会员积分(整数),负数和0退出系统:");
			if (in.hasNextInt()) {// 若是int型
				int score = in.nextInt();
				if (score <= 0) {
					System.out.println("谢谢使用,再见");
					System.exit(0);
				}
				if (score >= 8000) {
					System.out.println("享受的折扣是0.6");
					break;
				} else if (score >= 4000) {
					System.out.println("享受的折扣是0.7");
					break;

				} else if (score >= 2000) {
					System.out.println("享受的折扣是0.8");
					break;
				} else {
					System.out.println("享受的折扣是0.9");
					break;
				}
			} else {// 若不是int型
				System.out.println("对不起,输入错误,请重新输入");
				in.nextLine();// 吃回车.避免死循环
			}

		}
	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 实现商品换购
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午7:25:25 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test06() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("请输入消费金额(负数或0退出系统):");
			if (in.hasNextDouble()) {// 是double
				double money = in.nextDouble();
				if (money <= 0) {// 消费负数退出程序
					System.out.println("谢谢使用,再见");
					System.exit(0);
				}
				System.out.println("是否参加换购活动:");
				System.out.println("1:满50,加2元换购百事可乐一瓶");
				System.out.println("2:满100,加3元换购500ml可乐一瓶");
				System.out.println("3:满100,加10元换购5公斤面粉");
				System.out.println("4:满200,加10元换购1个苏泊尔炒锅");
				System.out.println("5:满200,加20元换购欧莱雅爽肤水一瓶");
				System.out.println("0:不换购");
				System.out.print("请选择:");
				if (in.hasNextInt()) {// 是int
					int num = in.nextInt();
					switch (num) {
					case 1:
						if (money >= 50) {
							money += 2;
							System.out.println("本次消费总额:" + money);
							System.out.println("成功换购百事可乐一瓶");
							break;
						} else {
							System.out.println("您消费未达标");
							break;
						}
					case 2:
						if (money >= 100) {
							money += 3;
							System.out.println("本次消费总额:" + money);
							System.out.println("成功换购500ml可乐一瓶");
							break;
						} else {
							System.out.println("您消费未达标");
							break;
						}
					case 3:
						if (money >= 100) {
							money += 10;
							System.out.println("本次消费总额:" + money);
							System.out.println("成功换购5公斤面粉");
							break;
						} else {
							System.out.println("您消费未达标");
							break;
						}
					case 4:
						if (money >= 200) {
							money += 10;
							System.out.println("本次消费总额:" + money);
							System.out.println("成功换购1个苏泊尔炒锅");
							break;
						} else {
							System.out.println("您消费未达标");
							break;
						}
					case 5:
						if (money >= 200) {
							money += 20;
							System.out.println("本次消费总额:" + money);
							System.out.println("成功换购欧莱雅爽肤水一瓶");
							break;
						} else {
							System.out.println("您消费未达标");
							break;
						}
					case 0:
						System.out.println("本次消费总额:" + money);
						System.out.println("我有钱,不换购");
						break;
					default:
						System.out.println("输入错误,请重新输入");
						in.nextLine();
					}
				} else {// 不是int
					System.out.println("输入的不是整型,请重新输入");
					in.nextLine();
				}
			} else {// 不是double
				System.out.println("输入的金额有误,请重新输入");
				in.nextLine();
			}
		}
	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 从登录菜单跳转到主菜单,实现菜单互相转换
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午6:24:06 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test05ToLogin() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1.登录系统");
			System.out.println("2.退出");
			System.out.print("请输入序号:");
			if (in.hasNextInt()) {// 输入的是int
				int loginNum = in.nextInt();
				switch (loginNum) {
				case 1:
					test05ToMain();
					return;
				case 2:
					System.out.println("谢谢使用,再见!");
					System.exit(0);// 0正常退出,1非正常
				default:
					System.out.println("输入的数不合法(1~2),请重新输入");
					break;
				}

			} else {// 输入的不是int
				System.out.println("输入的不是整型,请重新输入!");
				in.nextLine();
			}
		}
	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: test05的二级菜单
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午6:42:05 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test05ToMain() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("---------主菜单---------");
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			System.out.print("请输入序号:");
			if (in.hasNextInt()) {// 输入的是int
				int mainNum = in.nextInt();
				switch (mainNum) {
				case 1:
					test05ToInfo();
					break;
				case 2:
					System.out.println("购物车结算界面.....略");
					break;
				case 3:
					test05ToReal();
					break;
				case 4:
					System.out.println("已注销!");
					System.exit(0);// 0正常退出,1非正常
				default:
					System.out.println("输入的数不合法(1~4),请重新输入");
					break;
				}

			} else {// 输入的不是int
				System.out.println("输入的不是整型,请重新输入!");
				in.nextLine();
			}
		}

	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 真情回馈界面
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午7:04:18 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test05ToReal() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("购物管理系统>真情回馈(非菜单选项返回主菜单)");
			System.out.println("1.幸运大放送");
			System.out.println("2.幸运大抽奖");
			System.out.println("3.生日问候");
			System.out.print("请输入序号:");
			if (in.hasNextInt()) {// 输入的是int
				int realNum = in.nextInt();
				switch (realNum) {
				case 1:
					System.out.println("幸运大放送界面.....略");
					break;
				case 2:
					System.out.println("幸运大抽奖界面.....略");
					break;
				case 3:
					System.out.println("お誕生日おめでとうございます");
					break;
				default:
					test05ToMain();
				}

			} else {// 输入的不是int
				System.out.println("输入的不是整型,请重新输入!");
				in.nextLine();
			}
		}

	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 客户信息管理界面
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午6:54:50 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test05ToInfo() {
		Scanner in = new Scanner(System.in);
		while (true) {

			System.out.println("购物管理系统>客户信息管理(非菜单选项返回主菜单)");
			System.out.println("1.显示所有客户信息");
			System.out.println("2.增加客户信息");
			System.out.println("3.修改客户信息");
			System.out.println("4.查询客户信息");
			System.out.print("请输入序号:");
			if (in.hasNextInt()) {// 输入的是int
				int infoNum = in.nextInt();
				switch (infoNum) {
				case 1:
					System.out.println("所有客户信息......略");
					break;
				case 2:
					System.out.println("增加客户信息......略");
					break;
				case 3:
					System.out.println("修改客户信息......略");
					break;
				case 4:
					System.out.println("查询客户信息......略");
					break;
				default:
					test05ToMain();
				}

			} else {// 输入的不是int
				System.out.println("输入的不是整型,请重新输入!");
				in.nextLine();
			}
		}
	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 	编写一个Java程序（交作业），输入时间，如果时间在12点之前，提交作业不会受到处罚，否则就是抄代码20遍
	*
	* @param: null
	* @return：null,交给控制台
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午3:09:15 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test04() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("请输入交作业时间点(0-23之间整点)");
			if (in.hasNextInt()) {// 输入的是整点
				int time = in.nextInt();
				if (time >= 0 && time <= 23) {
					if (time >= 0 && time <= 12) {
						System.out.println("没有惩罚");
						break;
					} else {
						System.out.println("代码抄20遍");
						break;
					}
				} else {
					System.out.println("请输入正确的时间点!");
					in.nextLine();
				}
			} else {
				System.out.println("输入的不是整点数,请重新输入!");
				in.nextLine();
			}
		}
	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: 	编写一个Java程序（看病），输入体温，如果体温小于38度，一切正常，否则就是去医院挂点滴
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午2:55:00 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test03() {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("输入体温:");
			if (input.hasNextDouble()) {// 输入的体温是double
				// 体温
				double thermometer = input.nextDouble();
				if (thermometer < 38) {
					System.out.println("Body Is All Right");
					break;
				} else {
					System.out.println("Go to Hospital");
					break;
				}
			} else {// 不是double
				System.out.println("输入体温错误,请重新输入!");
				input.nextLine();
			}
		}
	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description: ②	编写一个Java程序（打篮球），输入人数，如果人数小于10人，就打半场，否则就是全场
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午2:49:21 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test02() {
		/*②	编写一个Java程序（打篮球），输入人数，如果人数小于10人，就打半场，否则就是全场*/
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("请输入人数:");
			if (input.hasNextInt()) {// 输入的 是int型
				int num = input.nextInt();
				if (num < 10) {
					System.out.println("打半场");
					break;
				} else {
					System.out.println("打全场");
					break;
				}
			} else {// 输入的不是int
				System.out.println("输入错误,请重新输入");
				input.nextLine();
			}

		}

	}

	/**   
	* @Function: AfterSchoolExercise.java
	* @Description:编写一个Java程序（抛硬币），输入硬币的正反面，判断要做什么事情。
	*
	* @param: null
	* @return：null
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月16日 下午2:37:09 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void test01() {
		/*①	编写一个Java程序（抛硬币），输入硬币的正反面，判断要做什么事情。
		正面：看java书
		背面：出去爬山*/

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("输入硬币的正反面(正/反):");
			String str = in.next();
			if ("正".equals(str)) {
				System.out.println("看<<Java核心技术卷>>");
				break;
			} else if ("反".equals(str)) {
				System.out.println("出去爬山~");
				break;
			} else {
				System.out.println("只能输入正/反,请重输");
				in.nextLine();// 吃回车,避免死循环
			}
		}

	}
}
