/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test4.ui 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午10:05:33 
 */
package kh75.day190809.exam.test4.ui;

import kh75.day190809.exam.test4.utils.MyUtils;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MainUI.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午10:05:33 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class MainUI {
	public void mains(){
		System.out.println("欢迎使用本系统");
		boolean flag=true;
		do {
			System.out.println("1.登录");
			System.out.println("2.注册");
			System.out.println("请选择项目(1~2)\n其他键退出:");
			int num = MyUtils.INSTANCE.selectNum();
			switch (num) {
			case 1:
				System.out.println("-----------------登录-----------------");
				new LoginUI().login();
				return;
			case 2:
				System.out.println("-----------------注册-----------------");
				new RegisterUI().register();
				System.out.println();
				break;
			default:
				System.out.println("谢谢使用,再见");
				flag = false;
				break;
			}
			
		} while (flag);
		
		
	}
}
