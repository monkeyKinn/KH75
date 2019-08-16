/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190814.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午4:38:23 
 */
package kh75.day190814.class_test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: FileReaderDemon.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午4:38:23 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class FileReaderDemon {
	public static void main(String[] args) {
		try (Reader r = new FileReader("D:/金圣聪.java")){
			int data = 0;
			char[] c = new char[1024];
			while((data = r.read(c)) != -1){
				String str = new String(c);
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
