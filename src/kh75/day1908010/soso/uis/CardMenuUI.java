/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：UI包
 * @Package: kh75.day1908010.soso.uis 
 * @author: 金聖聰   
 * @date: 2019年8月11日 下午8:01:33 
 */
package kh75.day1908010.soso.uis;

import kh75.day1908010.soso.utils.CardUtil;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CardMenuUI.java
* @Description: 二级菜单
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月11日 下午8:01:33 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月11日     金聖聰           v1.0.0               修改原因
*/
public class CardMenuUI {
	public void cardMenuUI(String number){
		boolean flag = true;
		do {
			System.out.println("\n*************嗖嗖移动用户菜单*************");
			System.out.println("1.本月账单查询");
			System.out.println("2.套餐余量查询");
			System.out.println("3.打印消费详单");
			System.out.println("4.套餐变更");
			System.out.println("5.办理退网");
			System.out.print("请选择(输入1~5选择功能,其他键返回上一级)");
			int selectNum = CardUtil.INSTANCE.selectNum();
			switch (selectNum) {
			case 1:
				System.out.println("********本月账单查询********");
				CardUtil.INSTANCE.showAmountDetail(number);
				break;
			case 2:
				System.out.println("********套餐余量查询********");
				CardUtil.INSTANCE.showRemainDetail(number);
				break;
			case 3:
				System.out.println("********打印消费详单********");
				CardUtil.INSTANCE.printAmountDetail(number);
				break;
			case 4:
				System.out.println("********套餐变更********");
				System.out.print("1.话痨套餐\t2.网虫套餐\t3.超人套餐\t请选择(序号):");
				String packNum = null;
				boolean flags = true;
				do {
					packNum = CardUtil.INSTANCE.getString();
					if("1".equals(packNum) || "2".equals(packNum) || "3".equals(packNum)){
						flags = false;
					}else {
						System.out.print("输入错误,请重新输入:");
					}
				} while (flags);
				System.out.println();
				CardUtil.INSTANCE.changingPack(number, packNum);;
				break;
			case 5:
				System.out.println("********办理退网********");
				CardUtil.INSTANCE.delCard(number);
				
				flag = false;
				break;
			default:
				flag = false;
			}
			
		} while (flag);
		
		
		
	}
}
