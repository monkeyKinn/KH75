/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190814.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午5:39:06 
 */
package kh75.day190814.class_test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestAlls.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午5:39:06 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class TestAlls {
	public static void main(String[] args) {
		try (	
				FileInputStream fis = new FileInputStream("李知恩4.jpg");
				DataInputStream dis = new DataInputStream(fis);
				FileOutputStream fos = new FileOutputStream("李知恩4_new.jpg");
				DataOutputStream dos = new DataOutputStream(fos)) {
			byte[] b = new byte[1024];
			while ((dis.read(b)) != -1) {
				dos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
