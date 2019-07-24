/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：UI包
 * @Package: kh75.day190724.foodieleague.ui 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午2:50:24 
 */
package kh75.day190724.foodieleague.ui;

import java.util.Scanner;

import kh75.day190724.foodieleague.utils.MyUtils;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MainMenu.java
* @Description: 主菜单UI
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午2:50:24 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               代码重构
*/
public class MainMenuUI {
	static{
		OrderFoodUI orderFoodUI = new OrderFoodUI();
		ViewMealBagsUI viewMealBagsUI = new ViewMealBagsUI();
		Sign4Order sign4Order = new  Sign4Order();
		DeleteOrderUI deleteOrderUI = new DeleteOrderUI();
		WantToLikeUI wantToLikeUI = new WantToLikeUI();
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		do{
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
					//进 OrderFoodUI 类
					orderFoodUI.doMyWork();
					// 判断是否为0方法
					MyUtils.INSTANCE.isZero();
					break;
				case 2:
					//进查看餐袋UI
					viewMealBagsUI.doMyWork();
					MyUtils.INSTANCE.isZero();
					break;
				case 3:
					//进签收订单UI
					sign4Order.doMyWork();
					// 判断是否为0方法
					MyUtils.INSTANCE.isZero();
					break;
				case 4:
					//进删除订单UI
					deleteOrderUI.doMyWork();
					// 判断是否为0方法
					MyUtils.INSTANCE.isZero();
					break;
				case 5:
					//进我要点赞UI
					wantToLikeUI.doMyWork();
					// 判断是否为0方法
					MyUtils.INSTANCE.isZero();
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
		} while(flag);
	}
}
