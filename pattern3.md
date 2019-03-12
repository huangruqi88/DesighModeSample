##### [1.简单工厂模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)
##### [2.策略模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)
##### [3.装饰模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)
##### [4.代理模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)

##### [5.工厂方法模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)
##### [6.原型模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)
##### [7.模板方法模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)
##### [8.外观模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)

##### [9.建造者模式](#9.建造者模式)
##### [10.观察者模式](#10.观察者模式)
##### [11.抽象工厂模式](#11.抽象工厂模式)
##### [12.状态模式](#12.状态模式)

##### [13.适配器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md)
##### [14.备忘录模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md)
##### [15.组合模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md)
##### [16.迭代器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md)

##### [17.单例模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md)
##### [18.桥接模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md)
##### [19.命令模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md)
##### [20.责任链模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md)

##### [21.中介者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)
##### [22.享元模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)
##### [23.解释器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)
##### [24.访问者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)

<div id="9.建造者模式"></div>
## 9.建造者模式(Builder)
	建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
	使用场景：
		1.相同的方法，不同的执行顺序，产生不同的事件结果时。
		2.多个部件或者零件，都可以装配到一个对象中，但是产生的运行结果又不相同时。
		3.产品类非常复杂，或者产品类中的调用顺序不同产生了不同的作用，这个时候建造者模式非常合适。
		4.当初始化一个对象特别复杂时，如参数多，且参数都具有默认值时。
	PS：在实际开发中Director觉得经常被省略。而直接使用Builder来进行对象组装，这个Builder通常委链式调用，具体实现以
	setter方法 return this。
	
	总结：
	     优点：
		  1.良好的封装性，使用构建者模式可以使客户端不必知道产品内部的组成细节。
		  2.建造者独立，容易扩展。
	     缺点：会产生多于的Builder对象以及Director对象，消耗内存。

![建造者模式](https://i.imgur.com/PVfECmR.png)

<div id="10.观察者模式"></div>
## 10.观察者模式(Observer)
	观察者模式：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖他的对象都会得到通知并被自动更新。
	使用场景：
		1.关联行为场景，需要注意的是，关联行为是可拆分的，而不是“组合”关系。
		2.事件多级出发场景。
		3.跨系统的消息交换场景
	总结：
		 观察者模式主要作用就是对象解耦，将观察者与被观察者完全隔离，只依赖于Observer和Observable抽象。（eg:Android
	  中有ListView就是运用了适配器和观察者模式，广播也是同过观察者实现注册、反注册、更新数据。）
		优点：  
		   1.观察者和被观察者之间是抽象耦合，应对业务变化。
		   2.增强系统灵活性、可扩展性。
		缺点：应用是需要考虑开发效率和运行效率问题，程序中包括一个被观察者、观察者、开发和调试等内容会比较复杂，而且在Java
	       中消息的通知默认是顺序执行，一个观察卡顿，会影响整体的执行效率，在这种情况下，一般考虑使用异步的方式。

![观察者模式](https://i.imgur.com/IvoIxIb.png)

<div id="11.抽象工厂模式"></div>
## 11.抽象工厂模式(Abstract Factory)
	抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
	使用场景：一个对象族有相同的约束是可以使用抽象工厂模式。例：Android、iOS下都有短信软件和拨号软件，两者都属于软件范畴，
	   但是他所在的操作系统平台不一样，即使同一家公司出品的软件，其代码的实现逻辑也是不同的，这时候就可以考虑使用抽象工
	   厂方法模式来生产AndroidiOS下的短信软件和拨号软件。
	总结：
	    优点：分离接口与实现，客户端使用抽象工厂来创建需要的对象，而客户端根本就不知道具体的实现是谁，客户端只是面向产品
	       的接口编程而已，使其总具体的产品实现中进行解耦，同时给予接口与实现的分离，使抽象工厂方法模式在切换产品类时，
	       更加灵活、容易
	    缺点：
		    1.类文件的爆炸性增加
		    2.不太容易扩展新的产品类，每增加一个产品类就需要修改抽象工厂，那么所有的具体工厂类均会被修改。
			
![抽象工厂模式](https://i.imgur.com/9Oi56vE.png)

<div id="12.状态模式"></div>
## 12.状态模式(State)
	状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
	使用场景：
	    1.一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为。
	    2.代码中包含了大量与对象状态有关的条件语句（例如：代码逻辑中有大量的if-else或switch-case）,且这些分支依赖于该
	      对象的状态。
	    PS:状态模式将每一条件分支放入一个独立的类中，这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可
	      以不依赖于其他对象而独立变化，这样通过多态来去除过多的、重复的if-else等分支语句。
	总结：
	    优点：State，模式将所有与一个特定的状态相关的行为都放入一个状态对象中，它提供一个更好的方法来组织与特定状态相关
	         的代码，将繁琐的状态判断转换成结构清晰的状态类族，在避免代码膨胀的同事也保证了可扩展性与可维护性。
	    缺点：状态模式的使用必然会增加系统类和对象的个数。


![状态模式](https://i.imgur.com/HQDblgk.png)
