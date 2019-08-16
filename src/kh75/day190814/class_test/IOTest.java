/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190814.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午2:16:36 
 */
package kh75.day190814.class_test;

import java.io.File;
import java.io.IOException;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: IOTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午2:16:36 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class IOTest {
	public void add(File file) {
		try {
			if (file.exists()) {
				System.out.println("文件已存在");
				return;
			}
			boolean createNewFile = file.createNewFile();
			if (createNewFile) {
				System.out.println("Success~");
			} else {
				System.out.println("Default");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void find(File file) {
		String name = file.getName();
		String path = file.getPath();
		String absolutePath = file.getAbsolutePath();
		System.out.println(name + "\n" + path + "\n" + absolutePath);
	}

	public void delete(File file){
		if (file.exists()) {
			 boolean flag = file.delete();
			 if (flag) {
				System.out.println("Success");
				return;
			 }
			 System.out.println("Default");
		}else {
			System.out.println("文件不存在");
		}
	}
	public static void main(String[] args) {
		File file = new File("金圣聪.java");
		new IOTest().add(file);
		new IOTest().find(file);
//		new IOTest().delete(file);
	}
}
