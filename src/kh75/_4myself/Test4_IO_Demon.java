/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75._4myself 
 * @author: 金聖聰   
 * @date: 2019年8月16日 上午10:08:02 
 */
package kh75._4myself;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Test4_IO_Demon.java
* @Description: 列出指定目录中所有的文件,包括子文件夹中的所有文件(使用递归算法(recursion)).
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月16日 上午10:08:02 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月16日     金聖聰           v1.0.0               修改原因
*/
public class Test4_IO_Demon {
	@Test
	public void test01() {
		File f = new File("F:/BaiduNetdiskDownload");
		listAllFiles(f);
	}

	/**   
	* @Function: Test4_IO_Demon.java
	* @Description: 列出指定目录中所有的文件,包括子文件夹中的所有文件(使用递归算法(recursion)).
	*
	* @param: void
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月16日 上午10:09:01 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月16日     金聖聰           v1.0.0               修改原因
	*/
	private static void listAllFiles(File f) {
		// 第一级子文件
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
			// 如果是文件夹
			if (file.isDirectory()) {
				// 继续操作自己
				listAllFiles(file);
			}
		}
	}

	@Test
	public void test02() {// 批量修改文件名称案例
		File fir = new File("D:/Backup/桌面/123");
		if (fir.isDirectory()) {
			// System.out.println("找到了");
			// 获取当前目录下所有文件
			File[] fs = fir.listFiles();
			// 需要删除的文字
			String deleteName = "一本道-";
			for (File file : fs) {
				// System.out.println(file.getName());
				// 判断是否包含删除文字
				if (file.getName().contains(deleteName)) {
					// System.out.println("包含");
					String newName = file.getName().replace(deleteName, "");
					file.renameTo(new File(fir, newName));
				}
			}
		}
	}

	@Test
	public void test03() {// 过滤文件
		File dir = new File("D:/Backup/桌面/123");
		if (dir.isDirectory()) {// 是文件夹
			File[] listFiles = dir.listFiles(new FilenameFilter() {// 匿名内部类
				public boolean accept(File dir, String name) {
					return new File(dir, name).isFile() && name.endsWith(".avi");// 是文件,并且以.avi结尾
				}
			});
			for (File file : listFiles) {
				System.out.println(file.getName());
			}
		}
	}

	@Test
	public void test04() {// 使用字节流完成文件的拷贝
		// 1.创建源
		File srcFile = new File("./file/1.txt");
		// 1.1创建目标
		File destFile = new File("./file/1_copy.txt");
		try (// java 1.7的新特性,资源自动关闭
				// 2.创建输入管道(对象)
				InputStream fis = new FileInputStream(srcFile);
				// 2.1创建输出管道
				OutputStream fos = new FileOutputStream(destFile);) {
			// 3.读出操作
			// 创建缓冲区 byte类型的数组,1024长度
			byte[] buffer = new byte[1024];
			// 已经读取的字节数,-1表示最后
			int len = -1;
			while ((len = fis.read(buffer)) != -1) {
				// 打印一下读取的数据
				System.out.print(new String(buffer, 0, len));
				// 3.1写入操作
				fos.write(buffer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	@Test
	public void test05() throws Exception {
		//1.创建源
		File fis = new File("./file/2.txt");
		//1.1创建目标
		File fos = new File("./file/2_copy.txt");
		try (
				//2.创建输入管道
				Reader in = new FileReader(fis);
				//2.1创建输出管道
				Writer out = new FileWriter(fos);
			){
			//3.读出操作和写入操作
			char[] buffer = new char[1024];
			int len = 0;
			while ((len=in.read(buffer))!=-1) {
				System.out.println(new String(buffer, 0, len));
				out.write(buffer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
