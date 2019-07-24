/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：数据包
 * @Package: kh75.day190724.foodieleague.data 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午2:48:18 
 */
package kh75.day190724.foodieleague.data;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: DataSource.java
* @Description: 重构数据类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午2:48:18 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0               代码重构
*/
public class DataSource {
	// 数据准备 length都只能4
	// 菜品信息 序号 菜品名称 单价 点赞数
	// 同一个下标表示同一个菜品信息
	/**
	 * 菜品名称
	 */
	public static String[] dishNames = new String[4];
	/**
	 * 单价
	 */
	public static double[] dishPrices = new double[4];
	/**
	 * 点赞数
	 */
	public static int[] likes = new int[4];

	// 订单信息 序号 订餐人 所定餐名及份数 订餐时间 送餐地址 订单状态 价格
	// 同一个下标表示同一个订单
	/**
	 * 订餐人
	 */
	public static String[] orderNames = new String[4];
	/**
	 * 所定餐名及份数
	 */
	public static String[] orderDishNamesAndNums = new String[4];
	/**
	 * 订餐时间 (10-20)
	 */
	public static int[] orderTimes = new int[4];
	/**
	 * 送餐地址
	 */
	public static String[] orderAddresses = new String[4];
	/**
	 * 订单状态(0：已预订	1：已完成)
	 */
	public static int[] orderStatus = new int[4];
	/**
	 * 订单总价格
	 */
	public static double[] orderSumPrices = new double[4];

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
}
