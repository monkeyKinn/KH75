/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190730.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年7月30日 上午11:28:22 
 */
package kh75.day190730.class_test.test;

import java.util.Scanner;
import kh75.day190730.class_test.entity.Client;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ClientTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 上午11:28:22 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class ClientTest {
	static Scanner in = new Scanner(System.in);
	Client[] clients = new Client[5];

	private void addClient() {
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new Client();
			System.out.print("Input name:");
			String name = in.next();
			clients[i].setName(name);;
		}
		System.out.println("*******************************");
	}

	private void showClient() {
		System.out.println("The Client's Name List");
		System.out.println("*******************************");
		for (int i = 0; i < clients.length; i++) {
			System.out.print(clients[i]+"\t");
		}
		System.out.println();
	}
	
	private void modifyName(String oldName){
		boolean flag = false;
		for (Client client : clients) {
			if (client.getName().equals(oldName)){
				System.out.print("Input The New Name Which Wanna Change:");
				String newName = in.next();
				client.setName(newName);
				flag = true;
			}
		}
		System.out.println("****修改结果****");
		if (flag) {
			System.out.println("找到并修改成功");
			showClient();
		}else {
			System.out.println("修改失败!");
		}
	}

	public static void main(String[] args) {
		ClientTest clientTest = new ClientTest();
		clientTest.addClient();
		clientTest.showClient();
		System.out.print("Input The Old Name Which Wanna Change:");
		String oldName = in.next();
		clientTest.modifyName(oldName);
	}
}
