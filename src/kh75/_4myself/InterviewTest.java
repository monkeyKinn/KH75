/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75._4myself 
 * @author: 金聖聰   
 * @date: 2019年9月21日 上午11:48:59 
 */
package kh75._4myself;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import static org.junit.Assert.*;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: InterviewTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年9月21日 上午11:48:59 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年9月21日     金聖聰           v1.0.0               修改原因
*/
public class InterviewTest {
	@Test
	public void testPaoPao() throws Exception {
		int[] arr = new int[] {1,9,8,7,6,5,20,10};
		//冒泡,从大到小
		for (int i = 0;i < arr.length-1; i++){
			for (int j = 0;j < arr.length-1-i;j++){
				if(arr[j]<arr[j+1]){
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
		print(arr);
		System.out.println("----------------------------");
		//从小到大
		for (int i = 0;i < arr.length-1;i++){
			for (int j = 0;j <arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
		print(arr);
	}
	private void print(int[] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		String s = new String("456");
	}
	
	@Test
	public void testIOCopy() throws Exception {
		try(
			InputStream in = new FileInputStream("E:金圣聪.java");
			OutputStream out = new FileOutputStream("E:金圣聪_java");
				){
			byte[] buff = new byte[1024];
			int len = -1;
			while((len = in.read(buff))!=-1){
				out.write(buff, 0, len);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
