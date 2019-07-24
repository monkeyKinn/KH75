/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：UI包
 * @Package: kh75.day190724.foodieleague.ui 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午3:08:35 
 */
package kh75.day190724.foodieleague.ui;

import java.util.Scanner;

import kh75.day190724.foodieleague.data.DataSource;
import kh75.day190724.foodieleague.utils.MyUtils;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: OrderFoodUI.java
* @Description: 我要订餐UI
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午3:08:35 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               代码重构
*/
public class OrderFoodUI {
	public void doMyWork() {
		Scanner in = new Scanner(System.in);
		// 判断是否饱满
		// 1.先遍历,哪里空的填哪里,用订单名子就行,从而获得index
		int index = -1;
		boolean isSave = false;
		// TODO 订餐人
		for (int i = 0; i < DataSource.orderNames.length; i++) {
			if (DataSource.orderNames[i] == null) {
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
			for (int i = 0; i < DataSource.dishNames.length; i++) {
				if (DataSource.dishNames[i] != null) {
					System.out.println((i + 1) + "\t" + DataSource.dishNames[i] + "\t" + DataSource.dishPrices[i] + "\t"
							+ DataSource.likes[i]);
				}
			}
			System.out.print("选择菜品编号(1-3):");
			int dishNum = -1;
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
			DataSource.orderNames[index] = orderName;
			String orderDishName = DataSource.dishNames[dishNum - 1];
			int orderDishNum = orderNum;
			String orderInfo = orderDishName + " " + orderDishNum + "份";
			DataSource.orderDishNamesAndNums[index] = orderInfo;
			DataSource.orderTimes[index] = orderTime;
			DataSource.orderAddresses[index] = orderAddress;
			// TODO
			double orderPrice = DataSource.dishPrices[dishNum - 1] * orderNum;
			// 配送费
			double deliveryPrice = orderPrice >= 50 ? 0 : 5;
			DataSource.orderSumPrices[index] = orderPrice + deliveryPrice;

			System.out.println("订餐成功");
			System.out.println("----------------------------");
			// TODO 打印输入的信息,在此之前先存档
			System.out.println("您输入的是:" + orderInfo + "\n送餐时间:" + orderTime + "点\n" + "餐费:" + orderPrice + "元,送餐费:"
					+ deliveryPrice + "元,总计:" + DataSource.orderSumPrices[index] + "元.");
		}
	}
}
