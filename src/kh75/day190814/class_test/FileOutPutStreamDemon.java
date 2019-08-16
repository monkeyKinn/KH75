/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190814.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午3:57:27 
 */
package kh75.day190814.class_test;

import java.io.OutputStream;
import java.io.FileOutputStream;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: FileOutPutStreamDemon.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午3:57:27 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class FileOutPutStreamDemon {
	public static void main(String[] args) {
		try (OutputStream fos = new FileOutputStream("D:/金圣聪.java")){
			String s = "jinshengcong,come back 4 me";
			fos.write(s.getBytes());
			System.out.println("成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
