# 中博Java混淆知识点总结

## Day00--安装相关

### 1. JDK,JRE与JVM关系

​	<font color = "red"> JRE</font>(Java Runtime Environment)：Java运行环境，如果要运行Java程序，就需要JRE的支持，JRE里包含JVM。

​	<font color="red"> JDK</font>(Java Development Kit)：Java开发工具，包含开发Java程序的所有工具,如javac和java等，JDK里包含JRE。

​	<font color="red"> Java虚拟机</font>（Java Virtual Machine），简称JVM，它是运行所有Java程序的虚拟计算机，好比是街机游戏的模拟器。

​	JVM是Java语言的运行环境，也是Java 最具吸引力的特性之一。JVM用于读取并处理编译过的与平台无关的字节码(class)文件，从而实现Java的可移植性。但是值得注意的是Java虚拟机是不跨平台的。也就是说在Win下得装Win版的JVM，在Linux下装Linux版的JVM。

​	JVM是Java程序的解释和执行器。

### 2. 环境变量设置

#### 	2.1 系统变量新建

​	name: ``JAVA_HOME``

​	value: ``java版本所在根目录``

#### 	2.2 再建

​	name: ``CLASSPATH`` ``//jdk1.5之后不需要配置``

​	value:  `` . ``

#### 	2.3 在name为`` Path ``的(用户或者系统)环境变量中添加(最好在最前面)

​	``%JAVA_HOME%\bin;``

<font color="red"> 控制台输入  ``java,java -version,javac,javac -version`` 若出现对应版本信息为配置成功</font>

## Day01 -- 预习工作

### 1. Eclipse常用快捷键

```txt
代码助手:Alt+/
快速修正：Ctrl+1
删除选中的行：Ctrl+D
组织导入：Ctrl+Shift+O
格式化代码：Ctrl+Shift+F

查看某个类的源代码：Ctrl+点进去
快速Outline：Ctrl+O
打开继承体系：Ctrl+T

打开资源：Ctrl+Shift+R
打开类型：Ctrl+Shift+T
上下移动选中的行：Alt+Up/Down
上下复制选中的行：Ctrl+Alt+Up/Down 

单行注释：Ctrl+/
多行注释：Ctrl+Shift+/
取消多行注释: Ctrl+Shift+\
变为大/小写：Ctrl+Shift+X/Y

Alt+Shift+R：重命名

如何查看快捷键

断点调试
F5：Step Into/进入
F6：Step over/跳过
F7：Step return/返回
F8：Resume/继续

```

## Day02--变量与数据类型

### 1.Java数据类型结构:





![图片](http://blog-cc.nos-eastchina1.126.net/80a38213-8b9b-41f9-b345-959043d5d2f3)

#### 1.1八大数据类型所占字节(1B,1B=8b)

![图片](http://blog-cc.nos-eastchina1.126.net/724727c0-1455-4e0b-9b5f-23577ddeebf4)



### 2.交换两个变量的值

#### 2.1常规

```java
		int a = 6;// 0011
		int b = 9;// 0101
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a+","+b);
```

#### 2.2 位操作(避免申请额外变量,运行速度快)

```java
		int a = 6;// 0011
		int b = 9;// 0101
		a = a ^ b;// 0110  6
		System.out.println(a);
		b = b ^ a;// 0011  3
		a = a ^ b;// 0101  5
		System.out.println(a + "," + b);
```

### 3.循环显示菜单

在用循环显示菜单时,输入错误重新输入时,可使用``in.nextLine()``吃掉回车,避免回车后进入死循环.

### 4.nextLine()和next()区别

> Scanner是一个扫描器，我们录取到键盘的数据，先存到缓存区等待读取，它判断读取结束的标示是  空白符:
>
> 比如空格，回车，tab 等等。
>
>
>
> next()方法读取到空白符就结束；
>
> nextLine()读取到回车结束也就是“\r”；

## Day03--选择结构

### 基本掌握,关于switch结构做说明,加强记忆!

> switch的使用细节和使用注意:
>
> switch语句适用于对多个整型值进行匹配判断，从而实现条件的分支控制。
>
> 和if语句不同的是：if语句后面是根据boolean表达式判断的，所以表达式的结构可以任意写，而switch只是相当于做“表达式 == 数值”的boolean表达式判断。,推出:其实if语句更强大,switch仅仅只是对整数类型的判断而已,使用更简单.
>
> 这里的数值的类型是除long之外的整型类型，也就是说switch支持的类型是byte，short，char，int。
>
> 本质:switch仅仅只能支持int类型.(byte,short,char,会自动提升为int类型,枚举和String也只是语法糖,其底层依旧使用hashCode(),本质也是int)
>
> \--------------------------------------------------------------
>
> switch语句选择的基本数据类型只有四种：byte、short、char、int，没有long。支持的引用类型是以上四个基本数据类型的包装类（后讲），依次是Byte、Short、Character、Integer以及从Java5开始支持的枚举和Java7开始支持的String类。
>
>
>
> case只是用来为switch选择一个执行代码的入口，如果一旦进入某个入口之后，后面的case实际上已经失去了判断的意义，也就是说代码在进入switch执行的时会把入口case之后的case统统忽略，会一直往下执行，直到遇到<font color="red">break </font>或<font color="red">return </font>。(穿透)
>
> 所以大家可以发现，每一个case后面没有{}这个符号来表示一个代码块。
>
> \------------------------
>
> default表示,所有的case的值都不正确,一般放在switch的最后,也不需要使用break语句,

## Day04--循环结构

> 循环语句:
>
>  1):while语句
>
>  2):do while语句
>
>  3):for语句
>
> \------------------------------------------------------
>
> 三种,可以完成相同的功能.
>
> 仅仅只是语法上有差异.

### 1.具体三大循环

#### 1.1 while循环:

格式：

```java
while(boolean表达式)
{
        //循环体s
}
```

<font color="red"> while循环特点</font>：先判断表达式，若为true就执行循环体，否则，跳过循环体。

![图片](http://blog-cc.nos-eastchina1.126.net/eadab15b-8ed8-4344-a17b-2ffbf3317d56)

#### 1.2 do-while循环:

格式：

```java
do
{
      //循环体语句
}
while(boolean表达式);
```

<font color="red"> do while循环特点</font>：先执行一次循环体，再判断表达式，若为true就执行循环体，否则，跳过循环体。

<font color="blue"> 也就是说do while是先执行后判断，即使判断条件为false，该循环至少会执行一次。</font>

![图片](http://blog-cc.nos-eastchina1.126.net/9829ca83-9cb8-47a2-bf6e-35fe13536fad)



#### 1.3 for循环:

格式：

```java
for(初始化语句;boolean表达式;循环后操作语句)
{
	//循环体语句
}

```

1. 初始化语句：		表示对循环进行初始化，只在循环开始时执行一次,定义一个变量,并赋值。
2. boolean表达式：	表达式为false时，循环终止,为true,才执行循环体。
3. 循环后操作语句：	循环每次迭代之后会调用该语句，一般的该语句都是递增或递减操作。

![图片](http://blog-cc.nos-eastchina1.126.net/82377bf7-0e1a-47dc-b137-ff97c26ba75d)

### 2.三个循环对比与选择

> 循环语句都一样,仅仅只是语法结构上不一样而已.
>
> 提示：
>
> 三大循环，是可以互换的，一般情况下，要是指定次数的循环，选用for循环要方便点。
>
> 一般的，习惯上选择i、j、k作为循环变量。
>
> \---------------------------------------
>
> 从性能上分析:for循环性能更高.
>
> ​     因为:变量定义在for循环里面,for循环执行完毕,就会释放该变量的存储空间.

### 3.嵌套循环

> 循环解决的是:某一个操作重复执行.
>
>
>
> <font color="red"> 如果一个重复的操作需要做N次,此时得使用嵌套循环. </font>
>
>   可以把内层循环看成是一个整体.

![图片](http://blog-cc.nos-eastchina1.126.net/c8e80f70-8991-4ffd-b3ee-4393c09fb0c3)

### 4.九九乘法表

![图片](http://blog-cc.nos-eastchina1.126.net/139f514f-564e-4843-9bd9-1ee652403642)

### 5. 控制循环结构语句

#### 5.1 break

> break:终止当前所在的循环. stop
>
> break之后的语句执行不了,所以不能编写.

![图片](http://blog-cc.nos-eastchina1.126.net/12e0d11a-043f-4d78-bfd5-9c0535242567)

![图片](http://blog-cc.nos-eastchina1.126.net/e4c65d7f-7a24-4600-bf56-d39049f0be64)

#### 5.2 continue: 

> continue语句: 继续的意思. skip.
>
> 跳过当前的循环,进入下一次循环操作.
>
> continue之后的语句执行不了,所以不能编写.

![图片](http://blog-cc.nos-eastchina1.126.net/b61eb47f-b208-4a3d-a5d4-ba02e3cb2c8e)

#### 5.3 return:

> 表示结束循环所在的方法，方法都结束了，循环结构自然也就结束了。
>
> 注意:
>
> break、continue、return后面的语句永远没有机会执行，所以不能再跟任何语句，否则编译失败。
>
> \-------------------------------------------------------
>
> break和return都能结束当前循环:
>
> 如果循环之后的操作还得执行: break;

![图片](http://blog-cc.nos-eastchina1.126.net/f205aaf3-4817-4874-ad4b-9c2dc602d810 "java")

### 6. 控制外层循环:

> 此时就得使用标签了，标签就是给某个循环起的别名，不过该别名得满足标识符的规范。
>
> 若要控制外层循环,就在break或continue后面跟上循环的别名就OK了
>
>    如: 
>
> ​	break  <标签名>; 
>
> ​	continue <标签名>;

![图片](http://blog-cc.nos-eastchina1.126.net/c9a6f497-e4af-4e3d-9666-6a7a1e8e9be6)

## Day07---Git使用笔记

### 1.Eclipse 上更换编码和换行符

Preference-->General-->Workspace-->右边  改成utf-8和Unix

项目右键Resource 直接改utf-8和Unix

### 2.IDEA上更换编码和换行符

Setting--->Editor-->Code Style--> 第二项换行符  Unix

​				File Encodings-->utf-8

### 3.做基本配置

#### 1.配置提交作者：

``git config --global user.name "username"``	配置姓名
``git config --global user.email "email"``		配置email地址

#### 2.禁用换行符自动转换：

``git config --global core.autocrlf false``

### 4.从零开发,先创建远程库，然后克隆远程库：

``git clone url [本地库名]``

``url``:克隆地址

``[本地库名]`` :没有[],直接命名

#### 4.1检查本地仓库文件状态：

``git status``

#### 4.2 gitignore文件创建与编辑

创建

``touch .gitignore``

文件编辑

``.gitignore``

```ignore
# Compiled class file
*.class

# Log file
*.log

# BlueJ files
*.ctxt

# Mobile Tools for Java (J2ME)
.mtj.tmp/

# Package Files #
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar

# virtual machine crash logs, see http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*

/bin/
.classpath
.project
*.bak
*~
/.settings/

```

#### 4.3暂存文件，建立跟踪：

``git add 具体文件``
``git add .``  //所有添加跟踪

#### 4.4提交一个版本到本地仓库：

``git commit -m "commit info"``

``commit info`` :注释信息

#### 4.5将本地仓库的提交推送到远程仓库：

``git push origin master``

``origin`` :远程仓库

``master`` :远程分支

#### 4.6解决版本冲突，拉取远程库的版本，合并到本地库

``git pull origin master``

``origin`` :远程仓库

``master`` :远程分支

### 5.对于本地已有的代码，初始化库:

``git init``

#### 5.1在github上创建远程库(略)

#### 5.2添加远程库：

``git remote add origin 远程库的url``

``git pull origin master``

拷贝gitignore文件

``git status`` :查看状态

``git add 文件 ``：建立追踪
``git commit -m "注释信息"``
``git push -u origin master ``

``-u``: 关联远程库

### 6.邀请成员

在设置里,很简单,进去就会,实在不会开翻译



