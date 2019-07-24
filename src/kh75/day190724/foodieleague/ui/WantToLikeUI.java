/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190724.foodieleague.ui 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午3:38:31 
 */
package kh75.day190724.foodieleague.ui;

import java.util.Scanner;

import kh75.day190724.foodieleague.data.DataSource;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: WantToLikeUI.java
* @Description: 我要点赞UI
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午3:38:31 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               代码重构
*/
public class WantToLikeUI {
	public void doMyWork(){
		System.out.println("***我要点赞***");
		Scanner in = new Scanner(System.in);
		// 打印所有菜单
		System.out.println("序号\t菜名\t\t单价\t点赞数");
		// 循环菜品信息
		for (int i = 0; i < DataSource.dishNames.length; i++) {
			if (DataSource.dishNames[i] != null) {
				System.out.println((i + 1) + "\t" + DataSource.dishNames[i] + "\t" + DataSource.dishPrices[i] + "\t" + DataSource.likes[i]);
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
		DataSource.likes[dishNum - 1] += 1;
		System.out.println("点赞成功");
	}
}
