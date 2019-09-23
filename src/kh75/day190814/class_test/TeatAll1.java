/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午5:20:40 
 */
package kh75.day190814.class_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TeatAll1.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午5:20:40 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class TeatAll1 {
	public static void main(String[] args) {
		try (// 创建文件读入流
				Reader reader = new FileReader("李知恩4.jpg");
				// 创建缓冲读入流
				BufferedReader bufferedReader = new BufferedReader(reader);
				// 创建文件写出流
				Writer writer = new FileWriter("李知恩4_new.jpg");
				// 创建缓冲写出流
				BufferedWriter b = new BufferedWriter(writer);) {

			String data = "";
			while ((data = bufferedReader.readLine()) != null) {
				b.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
