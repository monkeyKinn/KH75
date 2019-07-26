/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190724.foodieleague.ui 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午3:36:23 
 */
package kh75.day190724.foodieleague.ui;

import java.util.Scanner;

import kh75.day190724.foodieleague.data.DataSource;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: DeleteOrderUI.java
* @Description: 删除订单UI
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午3:36:23 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               代码重构
*/
public class DeleteOrderUI {
	public void doMyWork(){
		Scanner in = new Scanner(System.in);
		System.out.println("***删除订单***");
		System.out.print("请选择要删除的订单号:");
		// 判断是否合法
		// 判断输入的数是不在订单号之间>>>>1~长度+1
		int deleteNo = -1;
		// 订单最大值
		int maxLengths = 0;
		// 判断是否合法
		// 订单号区间:0到为空的下标
		for (int i = 0; i < DataSource.orderNames.length; i++) {
			// 到不为空,退出,此时就是订单号的最大值
			if (DataSource.orderNames[i] == null) {// 为空
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
					if (DataSource.orderStatus[deleteNo - 1] != 0) {// 能删除
						// 把后面的订单信息全移到这个位置**deleteNo-1**(循环),并把本来最后一位不为空的置空
						for (int i = deleteNo - 1; i < maxLengths; i++) {
							DataSource.orderNames[i] = DataSource.orderNames[i + 1];
							DataSource.orderDishNamesAndNums[i] = DataSource.orderDishNamesAndNums[i + 1];
							DataSource.orderTimes[i] = DataSource.orderTimes[i + 1];
							DataSource.orderAddresses[i] = DataSource.orderAddresses[i + 1];
							DataSource.orderStatus[i] = DataSource.orderStatus[i + 1];
							DataSource.orderSumPrices[i] = DataSource.orderSumPrices[i + 1];
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
	}
}
