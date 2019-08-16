/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190814.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月14日 下午3:26:02 
 */
package kh75.day190814.class_test;

import java.io.FileInputStream;
import java.io.InputStream;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Snippet.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月14日 下午3:26:02 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月14日     金聖聰           v1.0.0               修改原因
*/
public class FileInputStreamDemon {
	/**   
	* @Function: Snippet.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月14日 下午3:26:02 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月14日     金聖聰           v1.0.0               修改原因
	*/
	public static void main(String[] args) {
		try (InputStream fis = new FileInputStream("D:/金圣聪.java")){
			byte[] b = new byte[1024];
			int data = 0;
			while((data = fis.read(b)) != -1){
				String str = new String(b);
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

