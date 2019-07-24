/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：吃货联盟系统
 * @Package: kh75.day190724.foodieleague.ui 
 * @author: 金聖聰   
 * @date: 2019年7月24日 上午8:37:46 
 */
package kh75.day190724.source;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: FoodieOfLeagueOS.java
* @Description: 吃货联盟 全写在main函数中
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 上午8:37:46 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               修改原因
*/
public class FoodieOfLeagueOS {
	private static Scanner in = new Scanner(System.in);
	// 数据准备 length都只能4
	// 菜品信息 序号 菜品名称 单价 点赞数
	// 同一个下标表示同一个菜品信息
	/**
	 * 菜品名称
	 */
	private static String[] dishNames = new String[4];
	/**
	 * 单价
	 */
	private static double[] dishPrices = new double[4];
	/**
	 * 点赞数
	 */
	private static int[] likes = new int[4];

	// 订单信息 序号 订餐人 所定餐名及份数 订餐时间 送餐地址 订单状态 价格
	// 同一个下标表示同一个订单
	/**
	 * 订餐人
	 */
	private static String[] orderNames = new String[4];
	/**
	 * 所定餐名及份数
	 */
	private static String[] orderDishNamesAndNums = new String[4];
	/**
	 * 订餐时间 (10-20)
	 */
	private static int[] orderTimes = new int[4];
	/**
	 * 送餐地址
	 */
	private static String[] orderAddresses = new String[4];
	/**
	 * 订单状态(0：已预订	1：已完成)
	 */
	private static int[] orderStatus = new int[4];
	/**
	 * 订单总价格
	 */
	private static double[] orderSumPrices = new double[4];

	static {// 静态代码块
			// 初始化信息
			// 1.菜品信息
		dishNames[0] = "红烧带鱼";
		dishPrices[0] = 38.0;
		likes[0] = 0;
		dishNames[1] = "鱼香肉丝";
		dishPrices[1] = 20.0;
		likes[1] = 0;
		dishNames[2] = "时令鲜蔬";
		dishPrices[2] = 10.0;
		likes[2] = 0;

		// 2.订单信息
		orderNames[0] = "张晴";
		orderDishNamesAndNums[0] = "红烧带鱼 2份";
		orderTimes[0] = 12;
		orderAddresses[0] = "天成路207号";
		orderStatus[0] = 1;
		orderSumPrices[0] = 76;

		orderNames[1] = "张晴";
		orderDishNamesAndNums[1] = "鱼香肉丝 2份";
		orderTimes[1] = 18;
		orderAddresses[1] = "天成路207号";
		orderStatus[1] = 0;
		orderSumPrices[1] = 45;
	}

	public static void main(String[] args) {
		boolean flag = true;
		do {
			System.out.println("欢迎使用\"吃货联盟订餐系统\"");
			System.out.println("********************************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("********************************************");
			System.out.print("请选择:");
			// 判断输入的菜单号是否合法
			if (in.hasNextInt()) {// 合法
				int menu = in.nextInt();
				// 判断是否在1-6之间
				switch (menu) {
				case 1:
					// 判断是否饱满
					// 1.先遍历,哪里空的填哪里,用订单名子就行,从而获得index
					int index = -1;
					boolean isSave = false;
					// TODO 订餐人
					for (int i = 0; i < orderNames.length; i++) {
						if (orderNames[i] == null) {
							//
							index = i;
							isSave = true;
							break;
						}
					}
					// 判断是否成功
					if (!isSave) {// 不成功
						System.out.println("订单饱满,添加失败!");
					} else {// 成功,存入订单信息
						System.out.println("***我要订餐***");
						// TODO 把输入的数据放到数组第一个为空的地方
						// 输入数据
						System.out.print("请输入订餐人姓名:");
						String orderName = in.next();
						System.out.println("序号\t菜名\t\t单价\t点赞数");
						// 循环菜品信息
						for (int i = 0; i < dishNames.length; i++) {
							if (dishNames[i] != null) {
								System.out.println(
										(i + 1) + "\t" + dishNames[i] + "\t" + dishPrices[i] + "\t" + likes[i]);
							}
						}
						System.out.print("选择菜品编号(1-3):");
						// 判断是否菜单编号
						int dishNum = -1;
						// 判断是否合法
						while (!(dishNum >= 1 && dishNum <= 3)) {// 第一次进入循环,出去前再判断一次
							// 判断输入合法性
							if (in.hasNextInt()) {// 合法,是int
								dishNum = in.nextInt();
								if (dishNum < 1 || dishNum > 3) {
									System.out.print("没有此菜品~请重输:");
								}
							} else {// 不合法 不是int
								System.out.print("输入的不是整型,请重新输入:");
								in.next();
							}
						}
						System.out.print("请输入您要的份数(1-99):");
						// 判断输入份数在1-99之间
						int orderNum = -1;
						// 判断是否合法
						while (!(orderNum >= 1 && orderNum <= 99)) {// 第一次进入循环,出去前再判断一次
							// 判断输入合法性
							if (in.hasNextInt()) {// 合法,是int
								orderNum = in.nextInt();
								if (orderNum < 1 || orderNum > 99) {
									System.out.print("输入份数过大或过小~请重输:");
								}
							} else {// 不合法 不是int
								System.out.print("输入的不是整型,请重新输入:");
								in.next();
							}
						}
						System.out.print("输入用餐时间(10点到20点之间送餐):");
						// 判断时间是否在10-20之间
						int orderTime = -1;
						// 判断是否合法
						while (!(orderTime >= 10 && orderTime <= 20)) {// 第一次进入循环,出去前再判断一次
							// 判断输入合法性
							if (in.hasNextInt()) {// 合法,是int
								orderTime = in.nextInt();
								if (orderTime < 10 || orderTime > 20) {
									System.out.print("时间不在规定范围(10点到20点之间送餐)~请重输:");
								}
							} else {// 不合法 不是int
								System.out.print("输入的不是整型,请重新输入:");
								in.next();
							}
						}
						System.out.print("输入送餐地址:");
						String orderAddress = in.next();
						// TODO 存档
						orderNames[index] = orderName;
						String orderDishName = dishNames[dishNum - 1];
						int orderDishNum = orderNum;
						String orderInfo = orderDishName + " " + orderDishNum + "份";
						orderDishNamesAndNums[index] = orderInfo;
						orderTimes[index] = orderTime;
						orderAddresses[index] = orderAddress;
						// TODO
						double orderPrice = dishPrices[dishNum - 1] * orderNum;
						// 配送费
						double deliveryPrice = orderPrice >= 50 ? 0 : 5;
						orderSumPrices[index] = orderPrice + deliveryPrice;

						System.out.println("订餐成功");
						System.out.println("----------------------------");
						// TODO 打印输入的信息,在此之前先存档
						System.out.println("您输入的是:" + orderInfo + "\n送餐时间:" + orderTime + "点\n" + "餐费:" + orderPrice
								+ "元,送餐费:" + deliveryPrice + "元,总计:" + orderSumPrices[index] + "元.");
					}
					// 判断是否为0方法
					isZero();
					break;
				case 2:
					System.out.println("***查看餐袋***");
					// TODO 遍历已有订单信息
					System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
					for (int i = 0; i < orderNames.length; i++) {
						if (orderNames[i] != null) {// 不为空
							System.out.println((i + 1) + "\t" + orderNames[i] + "\t" + orderDishNamesAndNums[i] + "\t"
									+ orderTimes[i] + "点\t\t" + orderAddresses[i] + "\t" + orderSumPrices[i] + "\t"
									+ ((orderStatus[i] == 0) ? "已预订" : "已完成"));
						}
					}
					if(orderNames[0]== null){
						System.out.println("                            空                                                             ");
					}
					System.out.println("----------------------------");
					// 判断是否为0方法
					isZero();
					break;
				case 3:
					System.out.println("***签收订单***");
					System.out.print("请选择要签收的订单号:");
					// 判断是否合法

					// 判断输入的数是不在订单号之间>>>>1~长度+1
					int signNo = -1;
					// 订单最大值
					int indexLengths = 0;
					// 判断是否合法
					// 订单号区间:0到为空的下标
					for (int i = 0; i < orderNames.length; i++) {
						// 到不为空,退出,此时就是订单号的最大值
						if (orderNames[i] == null) {// 为空
							indexLengths = i;
							break;
						}
					}
					while (!(signNo >= 1 && signNo <= indexLengths)) {// 第一次进入循环,出去前再判断一次
						// 判断输入合法性
						if (in.hasNextInt()) {// 合法,是int
							// 具体的订单号
							signNo = in.nextInt();
							if (signNo < 1 || signNo > indexLengths) {
								System.out.println("无此订单!");
								break;
							} else {// 有订单
									// 用signNo操作
									// 1.循环遍历全部订单,为签收状态才能删,否则不可删 0"已预订" :1 "已完成"
									// 循环遍历订单,为0的时候才能签收
								if (orderStatus[signNo - 1] == 0) {// 能 签收
									orderStatus[signNo - 1] = 1;
									System.out.println("签收成功");
								} else {// 不能签收
									System.out.println("不能签收已完成订单!");
								}
							}
						} else {// 不合法 不是int
							System.out.print("输入的不是整型,请重新输入:");
							in.next();
						}
					}
					// 判断是否为0方法
					isZero();
					break;
				case 4:
					System.out.println("***删除订单***");

					System.out.print("请选择要删除的订单号:");
					// 判断是否合法

					// 判断输入的数是不在订单号之间>>>>1~长度+1
					int deleteNo = -1;

					// 订单最大值
					int maxLengths = 0;
					// 判断是否合法
					// 订单号区间:0到为空的下标
					for (int i = 0; i < orderNames.length; i++) {
						// 到不为空,退出,此时就是订单号的最大值
						if (orderNames[i] == null) {// 为空
							maxLengths = i;
							break;
						}
					}
					while (!(deleteNo >= 1 && deleteNo <= maxLengths)) {// 第一次进入循环,出去前再判断一次
						// 判断输入合法性
						if (in.hasNextInt()) {// 合法,是int
							// 具体的订单号
							deleteNo = in.nextInt();
							if (deleteNo < 1 || deleteNo > maxLengths) {
								System.out.println("无此订单!");
								break;
							} else {// 有订单
									// 用signNo操作
									// 1.循环遍历全部订单,为签收状态才能删,否则不可删 0"已预订" :1 "已完成"
									// 循环遍历订单,为0的时候才能签收
								if (orderStatus[deleteNo - 1] != 0) {// 能删除
									// TODO
									// 把后面的订单信息全移到这个位置**deleteNo-1**(循环),并把本来最后一位不为空的置空
									for (int i = deleteNo - 1; i < maxLengths; i++) {
										orderNames[i] = orderNames[i + 1];
										orderDishNamesAndNums[i] = orderDishNamesAndNums[i + 1];
										orderTimes[i] = orderTimes[i + 1];
										orderAddresses[i] = orderAddresses[i + 1];
										orderStatus[i] = orderStatus[i + 1];
										orderSumPrices[i] = orderSumPrices[i + 1];
									}
									System.out.println("删除成功");
								} else {// 不能删除
									System.out.println("不能删除已预定订单!");
								}
							}
						} else {// 不合法 不是int
							System.out.print("输入的不是整型,请重新输入:");
							in.next();
						}
					}
					// 判断是否为0方法
					isZero();
					break;
				case 5:
					System.out.println("***我要点赞***");
					// 打印所有菜单
					System.out.println("序号\t菜名\t\t单价\t点赞数");
					// 循环菜品信息
					for (int i = 0; i < dishNames.length; i++) {
						if (dishNames[i] != null) {
							System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + dishPrices[i] + "\t" + likes[i]);
						}
					}
					System.out.print("请选择要点赞的菜品序号:");
					// 判断是否菜单编号
					int dishNum = -1;
					// 判断是否合法
					while (!(dishNum >= 1 && dishNum <= 3)) {// 第一次进入循环,出去前再判断一次
						// 判断输入合法性
						if (in.hasNextInt()) {// 合法,是int
							dishNum = in.nextInt();
							if (dishNum < 1 || dishNum > 3) {
								System.out.print("没有此菜品~请重输:");
							}
						} else {// 不合法 不是int
							System.out.print("输入的不是整型,请重新输入:");
							in.next();
						}
					}
					System.out.print("编号:" + dishNum);// 1
					// 设置对应的like+1;
					likes[dishNum - 1] += 1;
					System.out.println("点赞成功");

					// 判断是否为0方法
					isZero();
					break;
				case 6:
					System.out.println("ありがとうございました～");
					System.out.println("またお越（こ）しくださいませ～");
					flag = false;
					break;// 不加break 会走default

				default:// 不在1-6之间
					System.out.println("输入非法,再见!");
					flag = false;
				}
			} else {// 不合法
				System.out.println("输入非法,再见!");
				flag = false;
			}
		} while (flag);
	}

	/**   
	* @Function: FoodieOfLeagueOS.java
	* @Description: 判断输入是否为0,不是的话循环输入,直到为0
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月24日 上午9:15:39 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月24日     金聖聰           v1.0.0               修改原因
	*/
	private static void isZero() {
		System.out.print("输入0返回:");
		int isZero = -1;
		while (isZero != 0) {
			// 判断输入合法性
			if (in.hasNextInt()) {// 合法
				isZero = in.nextInt();
				if (isZero != 0) {
					System.out.print("输入无效~请重输:");
				}
			} else {// 不合法
				System.out.print("输入非法,请重新输入:");
				in.next();
			}
		}
		System.out.println();
	}
}
