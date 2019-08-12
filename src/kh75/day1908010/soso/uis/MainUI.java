/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：UI包
 * @Package: kh75.day1908010.soso.uis 
 * @author: 金聖聰   
 * @date: 2019年8月11日 下午8:01:07 
 */
package kh75.day1908010.soso.uis;

import kh75.day1908010.soso.utils.CardUtil;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MainUI.java
* @Description: 主菜单
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月11日 下午8:01:07 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月11日     金聖聰           v1.0.0               修改原因
*/
public class MainUI {
	public void mainUI() {
		boolean flag = true;
		do {
			System.out.println("*****************欢迎使用嗖嗖移动业务大厅*****************");
			System.out.println("1.用户登录\t2.用户注册\t3.使用嗖嗖\t4.话费充值\t5.资费说明\t6.退出系统");
			System.out.print("请选择:");
			int selectMainNum = CardUtil.INSTANCE.selectNum();
			switch (selectMainNum) {
			case 1:
				System.out.print("请输入手机号:");
				String number = CardUtil.INSTANCE.getString();
				System.out.print("请输入密码:");
				String passWord = CardUtil.INSTANCE.getString();
				boolean existCard = CardUtil.INSTANCE.isExistCard(number);
				if (!existCard){
					System.out.println("尚未注册,再见");
					flag = false;
					return;
				}
				boolean isExistCard = CardUtil.INSTANCE.isExistCard(number, passWord);
				if (isExistCard) {// 注册了
					// 进二级菜单
					System.out.println("登录成功!");
					new CardMenuUI().cardMenuUI(number);
				} else {
					System.out.println("谢谢使用~再见!");
					flag = false;
				}
				break;
			case 2:
				CardUtil.INSTANCE.registCard();
				break;
			case 3:
				System.out.println("----使用嗖嗖----");
				System.out.print("请输入手机卡号:");
				String numberToUse = CardUtil.INSTANCE.getString();
				boolean isExistCards = CardUtil.INSTANCE.isExistCard(numberToUse);
				if (isExistCards) {// 注册了
					CardUtil.INSTANCE.useSoso(numberToUse);
					break;
				} else {
					System.out.println("暂未注册,谢谢使用~再见!");
					flag = false;
				}
				break;
			case 4:
				System.out.print("请输入充值卡号:");
				String chargenumber = null;
				boolean flags = true;
				do {
					chargenumber = CardUtil.INSTANCE.getString();
					// 判断是否有这个手机号
					boolean isExit = CardUtil.INSTANCE.isExistCard(chargenumber);
					if (isExit) {// 存在
						System.out.print("请输入充值金额:");
						double money = 0.0;
						boolean f = true;
						do {
							money = CardUtil.INSTANCE.selectNum();
							if (money >= 50) {
								f = false;
							} else {
								System.out.print("充值金额最少50,请重新输入:");
							}
						} while (f);
						// System.out.println("测试:手机号:"+chargenumber+"金额"+money);
						CardUtil.INSTANCE.chargeMoney(chargenumber, money);
						flags = false;
					} else {// 不存在
						System.out.print("亲,您输入的手机号不存在,请重新输入:");
					}
				} while (flags);
				break;
			case 5:
				System.out.println("******资费说明******\n");
				CardUtil.INSTANCE.showDescription();
				System.out.println();
				break;
			case 6:
				System.out.println("谢谢使用~再见!");
				flag = false;
				break;
			default:
				System.out.println("输入错误,请重新选择:");
			}

		} while (flag);
	}
}
