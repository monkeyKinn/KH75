/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test4.ui 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午11:06:43 
 */
package kh75.day190809.exam.test4.ui;

import java.util.Arrays;

import kh75.day190809.exam.test4.user.Users;
import kh75.day190809.exam.test4.utils.MyUtils;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: RegisterUI.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午11:06:43 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class RegisterUI {
	public void register() {

		System.out.print("请输入用户名:");
		String uName = MyUtils.INSTANCE.getString();
		boolean flag = true;
		for (int i = 0; i < Users.users.length; i++) {
			// 用户名存在
			if (Users.users[i][0].equals(uName)) {
				flag = false;
				break;
			} else {
				continue;
			}
		}
		if (flag) {
			System.out.print("请输入用户密码:");
			String uPwd = MyUtils.INSTANCE.getString();
			Users.users = Arrays.copyOf(Users.users, Users.users.length+1);
			Users.users[Users.users.length - 1] = new String[]{uName,uPwd};
			System.out.println("注册成功!");
		} else {
			System.out.println("失败,用户名存在~");
		}
	}

}
