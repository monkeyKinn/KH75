/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：工具包
 * @Package: kh75.day1908010.soso.utils 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午7:16:16 
 */
package kh75.day1908010.soso.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import kh75.day1908010.soso.entity.ConsumInfo;
import kh75.day1908010.soso.entity.MobileCard;
import kh75.day1908010.soso.entity.Scene;
import kh75.day1908010.soso.service.ICallService;
import kh75.day1908010.soso.service.INetService;
import kh75.day1908010.soso.service.ISendService;
import kh75.day1908010.soso.service.ServicePackage;
import kh75.day1908010.soso.service.impl.NetPackage;
import kh75.day1908010.soso.service.impl.SuperPackage;
import kh75.day1908010.soso.service.impl.TalkPackage;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: CardUtil.java
* @Description: 手机卡工具类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午7:16:16 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public enum CardUtil {
	INSTANCE;
	Scanner in = new Scanner(System.in);
	List<ConsumInfo> listadd = new ArrayList<>();
	/**
	 * [定义所有手机卡的列表] 
	 * 今天在使用iterator.hasNext()操作迭代器的时候，当迭代的对象发生改变，比如插入了新数据，或者有数据被删除。
	 *编译器报出了以下异常：
	 *			Exception in thread "main" java.util.ConcurrentModificationException
	 *分析原因：
	 *Iterator做遍历的时候，HashMap被修改(aa.remove(ele), size-1)，
	 *							Iterator(Object ele=it.next())会检查HashMap的size，size发生变化，
	 *							抛出错误ConcurrentModificationException。
	 *解决办法：
	 *
	 *	1) 通过Iterator修改Hashtable
	 *	while(it.hasNext()) {
	 *		Map.Entry entry = (Map.Entry) it.next();
	 *      it.remove();
	 *	}
	 *
	 *	2) 根据实际程序，您自己手动给Iterator遍历的那段程序加锁，给修改HashMap的那段程序加锁。
	 *	
	 *	3) 使用“ConcurrentHashMap”替换HashMap，ConcurrentHashMap会自己检查修改操作，对其加锁，也可针对插入操作。
	 */
	static Map<String, MobileCard> cards = new ConcurrentHashMap<>();

	/**
	 * [定义所有手机卡消费记录的列表]
	 */
	static Map<String, List<ConsumInfo>> consumInfos = new HashMap<>();

	/**
	 * [定义手机使用场景列表]
	 */
	static List<Scene> scenes = new ArrayList<>();

	static {// 静态代码块初始化数据
		// [初始化手机用户]
		MobileCard mc1 = new MobileCard("13915208895", "金海霞", "890807", new TalkPackage(), new TalkPackage().getPrice(), 10, 100, 0, 0);
		MobileCard mc2 = new MobileCard("13915302596", "金树国", "890807", new TalkPackage(), new TalkPackage().getPrice(), 10, 100, 0, 0);
		cards.put("13915208895", mc1);
		cards.put("13915302596", mc2);
		// [初始化消费信息表]
		List<ConsumInfo> l1 = new ArrayList<>();
		l1.add(new ConsumInfo("13915208895", "通话", 100));

		List<ConsumInfo> l2 = new ArrayList<>();
		l2.add(new ConsumInfo("13915302596", "通话", 100));

		consumInfos.put("13915208895", l1);
		consumInfos.put("13915302596", l2);
		// [初始化场景信息]
		Scene scene0 = new Scene("通话", 90, "问候客户,谁知如此难缠,通话90分钟");
		Scene scene1 = new Scene("通话", 30, "询问妈妈身体状况,本地通话30分钟");
		Scene scene2 = new Scene("短信", 5, "参与环境保护实施方案问卷调查,发送短信5条");
		Scene scene3 = new Scene("短信", 50, "同志朋友换手机号,发送短信50条");
		Scene scene4 = new Scene("上网", 1024, "和对象视频,使用流量1GB");
		Scene scene5 = new Scene("上网", 1024 * 2, "晚上手机在线看韩剧,不留神睡着了!使用流量2GB");
		scenes.add(scene0);
		scenes.add(scene1);
		scenes.add(scene2);
		scenes.add(scene3);
		scenes.add(scene4);
		scenes.add(scene5);
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [添加指定卡的消费记录]
	*
	* @param: moblieNumber 消费记录的对应卡号,consumInfo 消费信息
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:29:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void addConsumInfo(String moblieNumber, ConsumInfo consumInfo) {
		
		listadd.add(consumInfo);
		
		consumInfos.put(moblieNumber, listadd);
		
	}
	// /**
	// *
	// * @Function: CardUtil.java
	// * @Description: [初始化手机用户]
	// *
	// * @param: null
	// * @return：void
	// * @throws：null
	// *
	// * @version: v1.0.0
	// * @author: 金聖聰
	// * @date: 2019年8月10日 下午7:22:34
	// *
	// * Modification History:
	// * Date Author Version Description
	// *---------------------------------------------------------*
	// * 2019年8月10日 金聖聰 v1.0.0 修改原因
	// */
	// public void init() {
	// MobileCard mc1 = new MobileCard("13915208895", "金海霞", "890807" , new
	// TalkPackage(500, 100, 30), 15.0, 100, 250, 99, 0);
	// MobileCard mc2 = new MobileCard("13915302596", "金树国", "890807" , new
	// TalkPackage(500, 100, 30), 15.0, 100, 250, 99, 0);
	// cards.put("13915208895", mc1);
	// cards.put("13915302596", mc2);
	// }

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [判断是否存在此卡用户] 根据卡号和密码判断 是否注册
	*				
	* @param: number 卡号,passWord 密码
	* @return：true 存在,false 不存在
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:23:01 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public boolean isExistCard(String number, String passWord) {
		// 返回键的集合
		Set<String> numbers = cards.keySet();
		Iterator<String> it = numbers.iterator();
		while (it.hasNext()) {// 有key
			// 得到下一个key
			String searchNum = it.next();
			if (number.equals(searchNum)) {
				if (passWord.equals((cards.get(searchNum)).getPassWord())) {

					return true;
				} else {
					System.out.println("密码输入错误!");
					break;
				}
			}
		}
		return false;
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [指定随机生成几个手机号列表]:
	*
	* @param: count 手机号个数
	* @return：String[] 生成几个手机号列表
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:23:58 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public String[] getNewNumbers(int count) {
		String[] newNumbers = new String[count];
		for (int i = 0; i < count; i++) {
			newNumbers[i] = this.createNumber();
		}
		return newNumbers;
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description:  [生成以 139 开头 的随机手机卡号] 生成随机卡号
	*
	* @param: null
	* @return：String 卡号
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:24:38 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public String createNumber() {
		Random random = new Random();
		// 记录现有用户中是否存在此卡号,true 是,false 否(默认)
		boolean isExitNum = false;
		String number = "";
		int temp = 0;
		do {
			// 标志位重置为false,用于控制外层循环
			isExitNum = false;
			// 生成的随机数不能小于8位(1000_0000),否则重新生成
			while (temp < 1000_0000) {
				temp = random.nextInt(1_0000_0000);
			}
			// 生成之后,手机号前面添加139
			number = "139" + temp;
			// 和现有的用户的卡号比较,不能有重复
			Set<String> cardNumbers = cards.keySet();
			for (String cn : cardNumbers) {
				if (number.equals(cn)) {
					isExitNum = true;
					break;
				}
			}
		} while (isExitNum);
		return number;
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [使用多态获取套餐类型的方法] 根据用户选择的套餐序号返回套餐对象
	*
	* @param: packageId 套餐序号
	* @return： ServicePackage 返回套餐对象
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:25:02 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public ServicePackage createPack(int packageId) {
		ServicePackage sp = null;

		switch (packageId) {
		case 1:
			sp = new TalkPackage();
			break;
		case 2:
			sp = new NetPackage();
			break;
		case 3:
			sp = new SuperPackage();
			break;
		default:
			System.out.println("输入错误");
		}

		return sp;
	}

	/**
	 *
	* @Function: CardUtil.java
	* @Description: [注册新卡]
	*
	* @param: card 搜搜移动卡 对象
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:25:35 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void addCard(MobileCard card) {
		// TODO 不明白为何要写 直接put不行吗?
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [本月账单查询]
	*
	* @param: moblieNumber 要查询的手机号
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:26:02 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void showAmountDetail(String moblieNumber) {
		MobileCard mc;
		StringBuffer sb = new StringBuffer();
		mc = cards.get(moblieNumber);// 获取集合中的一个元素
		sb.append("您的卡号:" + mc.getCardNumber() + ",当月账单:\n");
		sb.append("套餐资费:" + mc.getServicePackage().getPrice() + "元\n");
		sb.append("合计:" + dataFormart(mc.getConsumAmount()) + "元\n");
		sb.append("账户余额:" + dataFormart(mc.getMoney())+ "元\n");
		System.out.println(sb);
	}

	/**
	  * 
	 * @Function: CardUtil.java
	 * @Description: [套餐余量查询]
	 *
	 * @param: moblieNumber 要查询的手机号
	 * @return：void
	 * @throws：null
	 *
	 * @version: v1.0.0
	 * @author: 金聖聰
	 * @date: 2019年8月10日 下午7:26:29 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2019年8月10日     金聖聰           v1.0.0               修改原因
	  */
	public void showRemainDetail(String moblieNumber) {
		MobileCard mc;// 要查询的卡
		// 剩余的通话时长
		int remainTalkTime;
		// 剩余的短信条数
		int remainSmsCount;
		// 剩余的上网流量
		int remainFlow;
		StringBuffer sb = new StringBuffer();
		mc = cards.get(moblieNumber);
		sb.append("您的卡号是" + moblieNumber + ",套餐内剩余: \n");
		ServicePackage pack = mc.getServicePackage();
		if (pack instanceof TalkPackage) {
			// 向下转型为话痨套餐
			TalkPackage tp = (TalkPackage) pack;
			// 话痨套餐,查询套餐内剩余的通通话时长和短信条数
			remainTalkTime = tp.getTalkTime() > mc.getRealTalkTime() ? tp.getTalkTime() - mc.getRealTalkTime() : 0;
			sb.append("通话时长:" + remainTalkTime + "分钟\n");
			remainSmsCount = tp.getSmsCount() > mc.getRealSMSCount() ? tp.getSmsCount() - mc.getRealSMSCount() : 0;
			sb.append("短信条数:" + remainSmsCount + "条");
		} else if (pack instanceof NetPackage) {// 网虫套餐
			// 向下转型为网虫套餐
			NetPackage tp = (NetPackage) pack;
			// 话痨套餐,查询套餐内剩余的上网流量
			remainFlow = tp.getFlow() > mc.getRealFlow() ? tp.getFlow() - mc.getRealFlow() : 0;
			sb.append("上网流量:" + remainFlow / 1024 + "GB\n");
		} else {// 超人套餐
			// 向下转型为超人套餐
			SuperPackage tp = (SuperPackage) pack;
			// 话痨套餐,查询套餐内剩余的通通话时长和短信条数
			remainTalkTime = tp.getTalkTime() > mc.getRealTalkTime() ? tp.getTalkTime() - mc.getRealTalkTime() : 0;
			sb.append("通话时长:" + remainTalkTime + "分钟\n");
			remainSmsCount = tp.getSmsCount() > mc.getRealSMSCount() ? tp.getSmsCount() - mc.getRealSMSCount() : 0;
			sb.append("短信条数:" + remainSmsCount + "条");
			remainFlow = tp.getFlow() > mc.getRealFlow() ? tp.getFlow() - mc.getRealFlow() : 0;
			sb.append("上网流量:" + remainFlow / 1024 + "GB\n");
		}
		System.out.println(sb);
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [初始化消费信息表]
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:26:45 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void initConsumInfos() {

	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [打印消费详单]
	*
	* @param: moblieNumber 消费的手机号
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:27:08 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void printAmountDetail(String moblieNumber) {
		try (Writer fileWriter = new FileWriter(moblieNumber + "消费记录.txt")) {
			List<ConsumInfo> infos = new ArrayList<ConsumInfo>();
			// 存储指定卡的所有消费记录
			// 现有消费列表中是否存在此卡号的消费记录,是 true 否 false
			boolean isExit = false;
			// TODO 从consumInfos中查找是否存在消费记录的代码...
			List<ConsumInfo> list = consumInfos.get(moblieNumber);
			if (list != null) {
				infos.addAll(consumInfos.get(moblieNumber));
				isExit = true;
			}
			
			if (isExit) {// 有
				StringBuffer sb = new StringBuffer("******" + moblieNumber + "消费记录*****\n");
				sb.append("序号\t类型\t数据(通话(分钟)/上网(MB)/短信(条))\n");
				for (int i = 0; i < infos.size(); i++) {
					ConsumInfo info = infos.get(i);
					sb.append((i + 1) + "." + "\t\t" + info.getType() + "\t" + info.getConsumData() + "\n");
				}
				fileWriter.write(sb.toString());
				fileWriter.flush();
				System.out.println("消费记录打印完毕!");
			} else {// 没有
				System.out.println("对不起,不存在此号码的消费记录,不能打印!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	  * 
	 * @Function: CardUtil.java
	 * @Description: [套餐变更的方法]
	 *
	 * @param:moblieNumber 需要变更的手机号,packNum 套餐序号
	 * @return：void
	 * @throws：null
	 *
	 * @version: v1.0.0
	 * @author: 金聖聰
	 * @date: 2019年8月10日 下午7:27:33 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2019年8月10日     金聖聰           v1.0.0               修改原因
	  */
	public void changingPack(String moblieNumber, String packNum) {
		// 1.得到当前卡号套餐
		MobileCard mobileCard = cards.get(moblieNumber);
		ServicePackage servicePackage = mobileCard.getServicePackage();
		// swtich分支判断套餐是否相等
		ServicePackage sp;
		switch (packNum) {
		case "1":
			if (servicePackage instanceof TalkPackage) {// 已经是了
				System.out.print("对不起,您已经是该套餐用户,无需更换套餐");
				break;
			}
			sp = new TalkPackage();
			// 判断余额是否足以支付一个月的套餐资费,不足,提示错误信息
			if (mobileCard.getMoney() < sp.getPrice()) {
				System.out.println("对不起,您的余额不足以支付新套餐月资费,请充值后在办理更换套餐业务");
				break;
			}
			// 可以换套餐
			mobileCard.setRealTalkTime(0);
			mobileCard.setRealSMSCount(0);
			mobileCard.setRealFlow(0);
			mobileCard.setServicePackage(sp);
			mobileCard.setMoney(mobileCard.getMoney() - sp.getPrice());
			mobileCard.setConsumAmount(sp.getPrice());
			System.out.println("更换套餐成功!" + new TalkPackage().toString());
			break;
		case "2":
			if (servicePackage instanceof NetPackage) {// 已经是了
				System.out.print("对不起,您已经是该套餐用户,无需更换套餐");
				break;
			}
			sp = new NetPackage();
			// 判断余额是否足以支付一个月的套餐资费,不足,提示错误信息
			if (mobileCard.getMoney() < sp.getPrice()) {
				System.out.println("对不起,您的余额不足以支付新套餐月资费,请充值后在办理更换套餐业务");
				break;
			}
			// 可以换套餐
			mobileCard.setRealTalkTime(0);
			mobileCard.setRealSMSCount(0);
			mobileCard.setRealFlow(0);
			mobileCard.setServicePackage(sp);
			mobileCard.setMoney(mobileCard.getMoney() - sp.getPrice());
			mobileCard.setConsumAmount(sp.getPrice());
			System.out.println("更换套餐成功!" + new NetPackage().toString());
			break;
		case "3":
			if (servicePackage instanceof SuperPackage) {// 已经是了
				System.out.print("对不起,您已经是该套餐用户,无需更换套餐");
				break;
			}
			sp = new SuperPackage();
			// 判断余额是否足以支付一个月的套餐资费,不足,提示错误信息
			if (mobileCard.getMoney() < sp.getPrice()) {
				System.out.println("对不起,您的余额不足以支付新套餐月资费,请充值后在办理更换套餐业务");
				break;
			}
			// 可以换套餐
			mobileCard.setRealTalkTime(0);
			mobileCard.setRealSMSCount(0);
			mobileCard.setRealFlow(0);
			mobileCard.setServicePackage(sp);
			mobileCard.setMoney(mobileCard.getMoney() - sp.getPrice());
			mobileCard.setConsumAmount(sp.getPrice());
			System.out.println("更换套餐成功!" + new SuperPackage().toString());
			break;
		}

	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [指定卡号办理退网]
	*
	* @param: moblieNumber 办理退网的卡号
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:28:03 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void delCard(String moblieNumber) {
		// 遍历cards 找到对应的手机号 remove
		Set<String> keySet = cards.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			// 有值
			String number = it.next();
			if (number.equals(moblieNumber)) {
				cards.remove(number);
			}
		}
		// System.out.println("删除后的cards元素为:"+cards);
		System.out.println("卡号" + moblieNumber + "办理退网成功!\n谢谢使用,再见~");

	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [判断该手机卡号是否已经注册]
	*
	* @param: number 需要验证是否注册的卡号
	* @return：true 注册了,false 没有注册
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:28:31 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public boolean isExistCard(String number) {
		// 返回键的集合
		Set<String> numbers = cards.keySet();
		Iterator<String> it = numbers.iterator();
		while (it.hasNext()) {// 有key
			// 得到下一个key
			String searchNum = it.next();
			if (number.equals(searchNum)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [初始化使用场景的信息]:
	*
	* @param: void
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:28:55 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void ininScene() {
		// Scene scene0 = new Scene("通话", 90, "问候客户,谁知如此难缠,通话90分钟");
		// Scene scene1 = new Scene("通话", 30, "询问妈妈身体状况,本地通话30分钟");
		// Scene scene2 = new Scene("短信", 5, "参与环境保护实施方案问卷调查,发送短信5条");
		// Scene scene3 = new Scene("短信", 50, "同志朋友换手机号,发送短信50条");
		// Scene scene4 = new Scene("上网", 1024, "和对象视频,使用流量1GB");
		// Scene scene5 = new Scene("上网", 1024*2, "晚上手机在线看韩剧,不留神睡着了!使用流量2GB");
		// scenes.add(scene0);
		// scenes.add(scene1);
		// scenes.add(scene2);
		// scenes.add(scene3);
		// scenes.add(scene4);
		// scenes.add(scene5);

	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [使用嗖嗖]
	*
	* @param: moblieNumber 使用的手机号
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:29:15 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void useSoso(String moblieNumber) {
		// 获取卡对象
		MobileCard card = cards.get(moblieNumber);
		// 获取此卡的套餐
		ServicePackage pack = card.getServicePackage();
		Random random = new Random();
		int ranNum = 0;
		// 记录个场景中的实际消费数据
		int temp = 0;
		do {
			ranNum = random.nextInt(6);// 0-5随机
			Scene scene = scenes.get(ranNum);// 取出对应index的元素
			switch (ranNum) {
			case 0:
			case 1:
				if (pack instanceof ICallService) {// 判断是否实现了该功能
					// 执行通话方法
					System.out.println(scene.getDescription());
					ICallService callService = (ICallService) pack;
					try {
						temp = callService.call(scene.getData(), card);
					} catch (Exception e) {
						e.printStackTrace();
					}
					// 添加一条消费记录
					addConsumInfo(moblieNumber, new ConsumInfo(moblieNumber, scene.getType(), temp));
					break;
				}else {
					System.out.println("想发打电话,该套餐没有打电话套餐~");
				}
				break;
			case 2:
			case 3:
				if (pack instanceof ISendService) {// 判断是否实现了该功能
					// 执行发短信方法
					System.out.println(scene.getDescription());
					ISendService sendService = (ISendService) pack;
					try {
						temp = sendService.send(scene.getData(), card);
					} catch (Exception e) {
						e.printStackTrace();
					}
					// 添加一条消费记录
					addConsumInfo(moblieNumber, new ConsumInfo(moblieNumber, scene.getType(), temp));
					break;
				}else {
					System.out.println("想发短信,但是该套餐没有发短信套餐~");
				}

				break;
			case 4:
			case 5:
				if (pack instanceof INetService) {// 判断是否实现了该功能
					// 执行上网方法
					System.out.println(scene.getDescription());
					INetService netService = (INetService) pack;
					try {
						temp = netService.netPlay(scene.getData(), card);
					} catch (Exception e) {
						e.printStackTrace();
					}
					// 添加一条消费记录
					addConsumInfo(moblieNumber, new ConsumInfo(moblieNumber, scene.getType(), temp));
					break;
				}else {
					System.out.println("想上网,该套餐没有上网功能~");
				}
				break;
			}
			break;
		} while (true);
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [为指定手机卡号充值]
	*
	* @param: moblieNumber 需要充值的手机号,recharge 充值的钱
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:30:19 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void chargeMoney(String moblieNumber, double recharge) {
		MobileCard mobileCard = cards.get(moblieNumber);
		mobileCard.setMoney(mobileCard.getMoney() + recharge);
		// 测试充值成功与否
		System.out.println("充值成功~当前话费为:" + mobileCard.getMoney() + "元");
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: [显示资费说明的方法]
	*
	* @param: void
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月10日 下午7:30:58 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月10日     金聖聰           v1.0.0               修改原因
	 */
	public void showDescription() {
		// 将文本文件显示到控制台
		try (// 创建一个FileReader对象
				FileReader fr = new FileReader("D:\\Backup\\Workspaces\\Eclipse4zb\\KH75\\PricePacket.txt");
				// 创建一个BufferedReader对象
				BufferedReader br = new BufferedReader(fr)) {
			// 读取一行数据
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件不存在!");
		}
		System.out.print("输入任意键返回主菜单:");
		in.next();
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: 用户注册流程
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月11日 下午8:04:35 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月11日     金聖聰           v1.0.0               修改原因
	 */
	public void registCard() {
		System.out.println("****可选择的卡号******");
		// 存随机产生的9个电话号码数组
		String[] selectedRandomNumbers = new String[9];
		for (int i = 0; i < getNewNumbers(9).length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();
			}
			selectedRandomNumbers[i] = getNewNumbers(9)[i];
			System.out.print((i + 1) + "." + selectedRandomNumbers[i] + "\t");
		}
		System.out.println();
		System.out.print("请选择卡号(输入1-9的序号):");
		int selectNum = CardUtil.INSTANCE.selectNum();
		if (selectNum < 1 || selectNum > 9) {
			System.out.print("输入错误请重新输入:");
			selectNum = CardUtil.INSTANCE.selectNum();
		}
		String selectedMobileNumber = selectedRandomNumbers[selectNum - 1];
		System.out.print("1.话痨套餐\t2.网虫套餐\t3.超人套餐,请选择套餐(输入序号):");
		ServicePackage sp = null;
		boolean flag = true;
		do {
			int packageId = selectNum();
			if (packageId >= 1 && packageId <= 3) {
				sp = createPack(packageId);
				flag = false;
			} else {
				System.out.print("输入错误,请重新输入:");
			}
		} while (flag);

		System.out.print("请输入姓名:");
		String name = getString();
		System.out.print("请输入密码:");
		String pwd = getString();
		System.out.print("请输入预存话费金额:");
		int depositMoney = selectNum();
		while (depositMoney < sp.getPrice()) {
			System.out.print("亲,您存的话费不足以扣当月资费,请重新充值:");
			depositMoney = selectNum();
		}
		MobileCard mc = new MobileCard(selectedMobileNumber, name, pwd, sp, sp.getPrice(), depositMoney-sp.getPrice(), 0, 0, 0);

		cards.put(selectedMobileNumber, mc);

		System.out.println("注册成功!");
		mc.showMeg();

	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: 选择功能
	*
	* @param:voidf
	* @return：返回选择的数字
	* @throws：输入的不是数字换行,吃回车
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月11日 下午8:12:32 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月11日     金聖聰           v1.0.0               修改原因
	 */
	public int selectNum() {
		int num = 0;
		try {
			num = in.nextInt();
			return num;
		} catch (Exception e) {
			in.next();
			return num;
		} finally {
			num = 0;
		}
	}

	/**
	 * 
	* @Function: CardUtil.java
	* @Description: 得到输入的字符串
	*
	* @param: void
	* @return：String  输入的字符串
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月11日 下午8:46:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月11日     金聖聰           v1.0.0               修改原因
	 */
	public String getString() {
		return in.next();
	}

	public String dataFormart(double data) {
		DecimalFormat df = new DecimalFormat("#.0");
		return df.format(data);
	}

	public double sub(double a, double b) {
		return  Double.parseDouble(dataFormart((a - b)));
	}
}
