/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190814.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午5:02:31 
 */
package kh75.day190814.class_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: BufferReaderDemon.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午5:02:31 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class BufferReaderDemon {
	public static void main(String[] args) {
		try (Reader reader = new FileReader("D:/金圣聪.java");
				BufferedReader bufferedReader = new BufferedReader(reader)) {
			int data = 0;
			char[] c = new char[1024];
			while ((data = bufferedReader.read(c)) != -1) {
				System.out.println(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
