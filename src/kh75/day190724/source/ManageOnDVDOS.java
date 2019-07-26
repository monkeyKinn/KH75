/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：DVD租赁系统包
 * @Package: kh75.day190724.source 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午7:08:18 
 */
package kh75.day190724.source;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ManageOnDVD.java
* @Description: DVD租赁系统类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午7:08:18 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               修改原因
*/
public class ManageOnDVDOS {
	private static Scanner in = new Scanner(System.in);
	/*数据初始化
	使用数组对象保存DVD信息；
	每张DVD的信息包含：
	名称、是否可借的状态、借出的日期、借出的次数。*/
	/**
	 * DVD名称
	 */
	private static String[] names = new String[1024];
	/**
	 * 是否可借的状态 0:可以 1:不可以 默认0 可以
	 */
	private static int[] loanable = new int[6];
	/**
	 * 借出的日期  默认 0没有借的日期
	 */
	private static int[] dates = new int[6];
	/**
	 * 借出的次数 默认0 没有借过
	 */
	private static int[] times = new int[6];

	static {// 初始化2条dvd信息
		names[0] = "阿特曼";
		loanable[0] = 0;// 可以借
		dates[0] = 0;// 没借呢
		times[0] = 0;// 没人借

		names[1] = "七龙珠";
		loanable[1] = 1;// 不可以借
		dates[1] = 1;// 1号借的
		times[1] = 520;// 520次借出
	}

	public static void main(String[] args) {
		boolean flag = true;
		do {
			System.out.println("欢迎使用迷你DVD管理器");
			System.out.println("----------------------------");
			System.out.println("1.新增DVD");
			System.out.println("2.查看DVD");
			System.out.println("3.删除DVD");
			System.out.println("4.借出DVD");
			System.out.println("5.归还DVD");
			System.out.println("6.退出DVD");
			System.out.println("----------------------------");
			System.out.print("请选择:");
			// 判断输入是否合法
			if (in.hasNextInt()) {// 输入的是int
				int menuNum = in.nextInt();
				// switch判断输入的数是否在1-6之间
				switch (menuNum) {
				case 1:
					// 判断是否饱和
					// 1.先遍历,哪里空的填哪里,用名字就行,从而获得index
					int index = -1;
					boolean isNew = false;
					// 用dvdname遍历
					for (int i = 0; i < names.length; i++) {
						if (names[i] == null) {
							index = i;
							isNew = true;
							break;
						}
					}
					// 判断是否新建成功
					if (!isNew) {// 失败
						System.out.println("货架已满,新增失败!");
					} else {// 成功
						System.out.println("-->新增DVD---");
						// 把输入的数据放到第一个为空的地方
						// 输入数据
						System.out.print("请输入DVD名称:");
						String name = in.next();
						System.out.println("新增<<" + name + ">>成功");
						//存档 默认可借 默认没接触日期和次数
						names[index] = name;
					}
					isZero();
					break;
				case 2:
					System.out.println("-->查看DVD---");
					// 遍历dvd信息,用名字遍历,有名字就有信息
					System.out.println("序号\tDVD名\t是否可借\t借出日期\t借出次数");
					for (int i = 0; i < names.length; i++) {
						if (names[i] != null) {// 不为空
							System.out.println((i + 1) + "\t" + names[i] + "\t" + ((loanable[i] == 0) ? "Y" : "N")
									+ "\t\t" + ((dates[i] == 0) ? "没借" : ("" + dates[i] + "日")) + "\t\t" + times[i]
									+ "次");
						}
					}
					if (names[0] == null) {
						System.out.println(
								"                            空                                                             ");
					}
					System.out.println("----------------------------");
					isZero();
					break;
				case 3:
					System.out.println("-->删除DVD---");
					System.out.print("请选择要删除的DVD序号:");
					// 判断序号是否合法
					// 判断输入的数是不是在查看DVD的列表中间 1~长度+1
					int deleteNo = -1;
					// 列表最大值
					int maxLength = 0;
					// 判断是否合法
					// 列表序号区间:0到为空的下标
					for (int i = 0; i < names.length; i++) {
						// 到不为空,退出,此时就是列表的最大值
						if (names[i] == null) {// 为空
							maxLength = i;
							break;
						}
					}
					while (!(deleteNo >= 1 && deleteNo <= maxLength)) {// 第一次进入循环,出去前再判断一次
						// 判断输入合法性
						if (in.hasNextInt()) {// 合法,是int
							// 具体的DVD序号
							deleteNo = in.nextInt();
							if (deleteNo < 1 || deleteNo > maxLength) {
								System.out.println("查无此DVD!");
								break;
							} else {// 有DVD
									// 1.循环遍历全部DVD单,可借状态为Y才能删,否则不可删,0:可以
									// 1:不可以,默认0 可以
									// 循环遍历DVD单,为0的时候才能删除
								if (loanable[deleteNo - 1] != 1) {// 能删除
									// 把后面的订单信息全移到这个位置**deleteNo-1**(循环),并把本来最后一位不为空的置空
									for (int i = deleteNo - 1; i < maxLength; i++) {
										names[i] = names[i + 1];
										loanable[i] = loanable[i + 1];
										dates[i] = dates[i + 1];
										times[i] = times[i + 1];
									}
									System.out.println("删除成功");
								} else {// 不能删除
									System.out.println("不能删除已借出DVD!");
								}
							}
						} else {// 不合法 不是int
							System.out.print("输入的不是整型,请重新输入:");
							in.next();
						}
					}
					isZero();
					break;
				case 4:
					System.out.println("-->借出DVD---");
					System.out.print("请输入借出的DVD序号:");

					// 判断序号是否合法
					// 判断输入的数是不是在查看DVD的列表中间 1~长度+1
					int loanNo = -1;
					// 列表最大值
					int maxLengths = 0;
					// 判断是否合法
					// 列表序号区间:0到为空的下标
					for (int i = 0; i < names.length; i++) {
						// 到不为空,退出,此时就是列表的最大值
						if (names[i] == null) {// 为空
							maxLengths = i;
							break;
						}
					}
					while (!(loanNo >= 1 && loanNo <= maxLengths)) {// 第一次进入循环,出去前再判断一次
						// 判断输入合法性
						if (in.hasNextInt()) {// 合法,是int
							// 具体的DVD序号
							loanNo = in.nextInt();
							if (loanNo < 1 || loanNo > maxLengths) {
								System.out.println("查无此DVD!");
								break;
							} else {// 有DVD
									// 1.循环遍历全部DVD单,可借状态为Y才能,否则不可删,0:可以
									// 1:不可以,默认0 可以
									// 循环遍历DVD单,为0的时候才能借出
								if (loanable[loanNo - 1] != 1) {// 能借
									System.out.print("输入日期(1-31):");
									// 判断日期合法性

									// 判断时间是否在10-20之间
									int time = -1;
									// 判断是否合法
									while (!(time >= 1 && time <= 31)) {// 第一次进入循环,出去前再判断一次
										// 判断输入合法性
										if (in.hasNextInt()) {// 合法,是int
											time = in.nextInt();
											if (time < 1 || time > 31) {
												System.out.print("日期不在规定范围(1~31日)~请重输:");
											}
										} else {// 不合法 不是int
											System.out.print("输入的不是整型,请重新输入:");
											in.next();
										}
									}
									// 把这个DVD的可借状态改成N>>1,借出日期覆盖成输入的日期,借出次数+1
									loanable[loanNo - 1] = 1;
									dates[loanNo - 1] = time;
									times[loanNo - 1] += 1;

									System.out.println("借出成功");
								} else {// 不能删除
									System.out.println("抱歉,此DVD已借出!");
								}
							}
						} else {// 不合法 不是int
							System.out.print("输入的不是整型,请重新输入:");
							in.next();
						}
					}
					isZero();
					break;
				case 5:
					System.out.println("-->归还DVD---");
					System.out.print("请输入归还的DVD序号");
					
					// 判断序号是否合法
					// 判断输入的数是不是在查看DVD的列表中间 1~长度+1
					int backNo = -1;
					// 列表最大值
					int maxLengthss = 0;
					// 判断是否合法
					// 列表序号区间:0到为空的下标
					for (int i = 0; i < names.length; i++) {
						// 到不为空,退出,此时就是列表的最大值
						if (names[i] == null) {// 为空
							maxLengthss = i;
							break;
						}
					}
					while (!(backNo >= 1 && backNo <= maxLengthss)) {// 第一次进入循环,出去前再判断一次
						// 判断输入合法性
						if (in.hasNextInt()) {// 合法,是int
							// 具体的DVD序号
							backNo = in.nextInt();
							if (backNo < 1 || backNo > maxLengthss) {
								System.out.println("查无此DVD!");
								break;
							} else {// 有DVD
									// 1.循环遍历全部DVD单,可借状态为N才能,否则不可还,0:可以,1不可以
									// 1:不可以,默认0 可以
									// 循环遍历DVD单,为0的时候才能借出
								if (loanable[backNo - 1] != 0) {// 能还
									
									// 把这个DVD的可借状态改成N>>0,借出日期覆盖成0,借出次数不变
									loanable[backNo - 1] = 0;
									dates[backNo - 1] = 0;
									System.out.println("归还成功");
								} else {// 不能归还
									System.out.println("抱歉,此DVD已借出!");
								}
							}
						} else {// 不合法 不是int
							System.out.print("输入的不是整型,请重新输入:");
							in.next();
						}
					}
					
					
					isZero();
					break;
				case 6:
					System.out.println("ありがとうございました～");
					System.out.println("またお越（こ）しくださいませ～");
					flag = false;
					break;
				default:
					System.out.print("输入非法,再见!");
					flag = false;
				}

			} else {// 输入的不是int
				System.out.println("输入的非法,再见~");
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
