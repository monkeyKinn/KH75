/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190814.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午4:19:59 
 */
package kh75.day190814.class_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestAllIO.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午4:19:59 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class TestAllIO {
	public static void main(String[] args) {
		try (InputStream fis = new FileInputStream("E:/金圣聪.java");
				OutputStream fos = new FileOutputStream("E:/金圣聪_new.java")) {
			int data = 0;
			byte[] b = new byte[1024];
			while ((data = fis.read(b)) != -1) {
				fos.write(b, 0, data);
			}
			System.out.println("复制成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
