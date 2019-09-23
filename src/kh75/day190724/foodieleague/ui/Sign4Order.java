/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190724.foodieleague.ui 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午3:30:09 
 */
package kh75.day190724.foodieleague.ui;

import java.util.Scanner;

import kh75.day190724.foodieleague.data.DataSource;
import kh75.day190724.foodieleague.utils.MyUtils;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Sign4Order.java
* @Description: 签收订单UI
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午3:30:09 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               代码重构
*/
public class Sign4Order {
	public void doMyWork(){

		Scanner in = new Scanner(System.in);
		System.out.println("***签收订单***");
		System.out.print("请选择要签收的订单号:");
		// 判断是否合法

		// 判断输入的数是不在订单号之间>>>>1~长度+1
		int signNo = -1;
		// 订单最大值
		int indexLengths = 0;
		// 判断是否合法
		// 订单号区间:0到为空的下标
		for (int i = 0; i < DataSource.orderNames.length; i++) {
			// 到不为空,退出,此时就是订单号的最大值
			if (DataSource.orderNames[i] == null) {// 为空
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
						// 1.循环遍历全部订单,为已预定状态才能签收,否则不可签收 0"已预订" :1 "已完成"
						// 循环遍历订单,为0的时候才能签收
					if (DataSource.orderStatus[signNo - 1] == 0) {// 能 签收
						DataSource.orderStatus[signNo - 1] = 1;
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
	}
}
