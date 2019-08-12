/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test4.ui 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午10:49:52 
 */
package kh75.day190809.exam.test4.ui;

import kh75.day190809.exam.test4.user.Users;
import kh75.day190809.exam.test4.utils.MyUtils;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: SuccessUI.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午10:49:52 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class SuccessUI {
	public void success() {
		boolean flag = true;
		do {
			
			System.out.println("-------主界面--------");
			System.out.println("1.查看所有用户信息");
			System.out.println("2.修改密码");
			System.out.print("请输入序号:(除1.2外退出系统)");
			int num = MyUtils.INSTANCE.selectNum();
			switch (num) {
			case 1:
				System.out.println("----------------用户信息-----------------");
				System.out.println("用户名\t密码");
				for (int i = 0; i < Users.users.length; i++) {
					for (int j = 0; j < Users.users[i].length; j++) {
						System.out.print(Users.users[i][j] + "\t");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("----------------密码修改-----------------");
				System.out.print("输入要修改的用户名:");
				String name = MyUtils.INSTANCE.getString();
				System.out.print("输入原始密码:");
				String pwd = MyUtils.INSTANCE.getString();
				boolean flags = false;
				for (int i = 0; i < Users.users.length; i++) {
					if (Users.users[i][0].equals(name) && Users.users[i][1].equals(pwd)) {
						flags = true;
						break;
					} else {
						continue;
					}
				}
				if (flags) {
					System.out.println("请输入要改的密码:");
					String newPwd = MyUtils.INSTANCE.getString();
					for (int i = 0; i < Users.users.length; i++) {
						if (Users.users[i][0].equals(name)) {
							Users.users[i][1] = newPwd;
							break;
						} 
					}
					System.out.println("修改成功~");
				}else {
					System.out.println("信息错误~");
				}
				break;
			default:
				System.out.println("谢谢使用,再见");
				flag = false;
			}
		} while (flag);
	}
}
