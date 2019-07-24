/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190724.foodieleague.ui 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午3:21:41 
 */
package kh75.day190724.foodieleague.ui;

import kh75.day190724.foodieleague.data.DataSource;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ViewMealBags.java
* @Description: 查看餐带UI
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午3:21:41 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               代码重构
*/
public class ViewMealBagsUI {
	public void doMyWork(){

		System.out.println("***查看餐袋***");
		// TODO 遍历已有订单信息
		System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
		for (int i = 0; i < DataSource.orderNames.length; i++) {
			if (DataSource.orderNames[i] != null) {// 不为空
				System.out.println((i + 1) + "\t" + DataSource.orderNames[i] + "\t"
						+ DataSource.orderDishNamesAndNums[i] + "\t" + DataSource.orderTimes[i] + "点\t\t"
						+ DataSource.orderAddresses[i] + "\t" + DataSource.orderSumPrices[i] + "\t"
						+ ((DataSource.orderStatus[i] == 0) ? "已预订" : "已完成"));
			}
		}
		if(DataSource.orderNames[0]== null){
			System.out.println("                            空                                                             ");
		}
		System.out.println("----------------------------");
	
	} 
}
