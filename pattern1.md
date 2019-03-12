##### [1.简单工厂模式](#1.简单工厂模式)
##### [2.策略模式](#1.简单工厂模式)
##### [3.装饰模式](#3.装饰模式)
##### [4.代理模式](#4.代理模式)

##### [5.工厂方法模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)
##### [6.原型模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)
##### [7.模板方法模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)
##### [8.外观模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md)

##### [9.建造者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md)
##### [10.观察者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md)
##### [11.抽象工厂模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md)
##### [12.状态模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md)

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
##### [24.访问者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md

<div id="1.简单工厂模式"></div>
## 1.简单工厂模式(SimpleFactory)

		简单工厂：提供一个创建对象的工厂（Factory）实例功能，而不需要具体实现，被创建的类型可以是接口、抽象类、也可以是具体的
			类。

		简单工厂参与者：
		* Product:抽象产品类，将具体的代码进行抽象和提取后封装在一个抽象产品中。
		* ConcreteProduct:具体产品类，将需要创建的各种不同产品对象的相关代码封装到具体的产品类中。
		* Factory：工厂配，提供一个工厂类用于创建各种产品，在工厂类中提供一个创建产品的工厂方法，该方法可以根据所传入的参数
		  的不同创建不同的具体产品对象。
		* Client：客户端类，只需要调用工厂类的工厂方法并传入想应的参数即可得到一个产品对象。
	
![简单工厂](https://i.imgur.com/66Fu5Yu.png)

	优点： 工厂类是整个模式的关键.包含了必要的逻辑判断,根据外界给定的信息,决定究竟应该创建哪个具体类的对象.通过使用工厂类,
	      外界可以从直接创建具体产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。而不必管这些对象究竟如何创建及如
	      何组织的．明确了各自的职责和权利，有利于整个软件体系结构的优化。

	缺点： 由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，将全部创建逻辑集中到了一个工厂类中；它所能创建的类
	      只能是事先考虑到的，如果需要添加新的类，则就需要改变工厂类了。当系统中的具体产品类不断增多时候，可能会出现要求工厂
	      类根据不同条件创建不同实例的需求．这种对条件的判断和对具体产品类型的判断交错在一起，很难避免模块功能的蔓延，对系
	      统的维护和扩展非常不利；

<div id="2.策略模式"></div>
## 2.策略模式（Strategy）
	策略模式：它定义了算法家族，分别封装起来，让他们之间互相替换,此模式让算法的变化，不会影响到使用它的客户。
	解释：从概念上看所有的这写算法完成的都是相同的工作，只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法与
	     使用算法尅之间的耦合。
	前言：当不同的行为堆砌在一个类中时，很难避免使用条件语句来选择合适的行为。将这些行为封装在一个个独立的Strategy类中，
	     可以在使用这些行为的类中消除条件语句。
	     优点：1.Strategy类层次未Context定义了一系列的可重用的算法和行为。继承有助于析取出这些算法中的公共功能。
		  2.简化了单元测试，因为每个算法都有自己的类，可以通过自己的接口单独测试
		PS：策略模式使用用来封装算法的，但是在实践中，可以用它来封装几乎任何类型的规则，只要是在分析过程中需要在不同的时间应
		    不同的业务规则，就可以使用。
		* 在基本策略模式中，选择所用具体实现的职责由客户端对象承担，并转给策略模式的Context对象。
![策略设计模式](https://i.imgur.com/BSU5jD8.png)

<div id="3.装饰模式"></div>
## 3.装饰模式(Decorator)
	装饰设计模式：动态的给对象添加一些额外的职责或者功能，装饰设计模式比生成子类更为灵活。


![装饰模式](https://i.imgur.com/sTdgLI3.png)

		Commponent是定义一个对象接口，可以给这些对象动态地添加职责。ConreteConponent(Person)[人]是定义的一个具体的对象，
	也可以给对象添加一些职责,Decorator装饰抽象类，集成了Component,从而扩展Component的功能，对于Component来说无需知道
	Decorator的存在。所以具体的的装饰对象是ConcreteDocoratorA(GreenHeadgear)[绿帽子]，ConcreteDoceoratorB(YellowTShorts)
	[黄T恤]就是具体的装饰对象，实现给Compomnent添加职责的功能。
	
		PS: 1.其实装饰设计模式就是利用一个方法（函数）来对对象进行包装。被装饰对象的实现和使用这个对象的使用分离开来，每
		个对象只关心自己的功能，不需要关心如何被添加进对象链当中。
		    2.如果只有一个ConcreteComponent类而没有抽象的Component类，那么Decorator类可以是一个ConcreteComponent
		的一个子类。同样，如果只有一个ConcreteDecorator类，那么可以把Decorator类和ConcreteDecorator的责任和成一个类。

<div id="4.代理模式"></div>
## 4.代理模式(Proxy)

	代理模式（Proxy）：未其他对象提供一种代理以控制这个对象的访问。

![代理模式](https://i.imgur.com/TsRnPPe.png)

	理解：由上可知代理模式就是通过Proxy对象去实现另一对象引用。本质上其实很类似商品 —— 中间商 —— 生产厂家这种关系。如果消费者
	     想要买到商品先通过中间商去买生产厂家的商品。
	
	应用：1.远程代理:为一个对象在不同的地址空间提供局部的代表。这样可以隐藏一个对象存在于不同地址空间的事实。
	      2.虚拟代理；根据需要创建开销很大的对象。通过他实例化需要很长时间的真实对象。
	      3.安全代理：用来控制真实对象访问时的权限。
	      4.智能指引:当调用真实的对象时，代理处理另外一些事。
	      PS:虽然代理模式有很多种应用本质上都是为其他对象提供一种代理对象用于控制这个对象的访问。
		
	      Android中代理模式应用有Binder机制和ActivityManager等

   Android中远程代理的使用[https://www.jianshu.com/p/7e7e08ad0236](https://www.jianshu.com/p/7e7e08ad0236 "Android中远程代理的使用")

   Android中动态代理和代理模式[https://www.2cto.com/kf/201804/739987.html](https://www.2cto.com/kf/201804/739987.html "动态代理和代理模式")
	

#####	代理模式与装饰模式的区别：
	      装饰模式：是在不使用继承，不改变原有对象的情况下增加和扩展对象的行为，但是不会禁用这个对象的行为。强调
	          功能的扩展。
	      代理模式：是控制这个对象的访问，限制对象的行为。也可以扩展功能，但是更偏向于对对象的控制。
