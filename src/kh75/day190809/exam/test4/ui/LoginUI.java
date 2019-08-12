/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test4.ui 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午10:01:19 
 */
package kh75.day190809.exam.test4.ui;

import kh75.day190809.exam.test4.user.Users;
import kh75.day190809.exam.test4.utils.MyUtils;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: LoginUI.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午10:01:19 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class LoginUI {
	public void login() {
		System.out.print("请输入用户名:");
		String uName = MyUtils.INSTANCE.getString();
		System.out.print("请输入密码:");
		String uPworld = MyUtils.INSTANCE.getString();
		boolean flag = false;
		for (int i = 0; i < Users.users.length; i++) {
			if (Users.users[i][0].equals(uName) && Users.users[i][1].equals(uPworld)) {
				flag = true;
				break;
			} else {
				continue;
			}
		}
		if (flag) {
			System.out.println("登录成功~");
			new SuccessUI().success();
			return;
		}else {
			System.out.println("登录失败~");
		}
	}
}
