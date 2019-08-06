/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.control 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:31:36 
 */
package kh75.day190806.afterschool_exercises.no11.control;

import kh75.day190806.afterschool_exercises.no11.service.IMediaPlayerable;
import kh75.day190806.afterschool_exercises.no11.service.impl.CDPlayer;
import kh75.day190806.afterschool_exercises.no11.service.impl.DVDPlayer;
import kh75.day190806.afterschool_exercises.no11.service.impl.TapePlayer;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Controller.java
* @Description: 遥控器
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:31:36 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class Controller {
	private IMediaPlayerable[] players;  
	public Controller(){  
	//构造函数中初始化players 数组  
		players = new IMediaPlayerable[3];
		players[0] = new DVDPlayer();
		players[1] = new CDPlayer();
		players[2] = new TapePlayer();
	}  
	//对相应的设备调用play 方法  
	public void play(int i){  
	players[i].play();  
	}  
	//对相应的设备调用play 方法  
	public void stop(int i){  
		players[i].stop();  
	}  
	//对相应的设备调用play 方法  
	public void open(int i){  
		players[i].open();  
	}  
	
}
