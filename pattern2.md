##### [1.简单工厂模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#1.简单工厂模式)
##### [2.策略模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#2.策略模式)
##### [3.装饰模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#3.装饰模式)
##### [4.代理模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#4.代理模式)

##### [5.工厂方法模式](#5.工厂方法模式)
##### [6.原型模式](#6.原型模式)
##### [7.模板方法模式](7.模板方法模式)
##### [8.外观模式](#8.外观模式)

##### [9.建造者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#9.建造者模式)
##### [10.观察者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#10.观察者模式)
##### [11.抽象工厂模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#11.抽象工厂模式)
##### [12.状态模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#12.状态模式)

##### [13.适配器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md#13.适配器模式)
##### [14.备忘录模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md#14.备忘录模式)
##### [15.组合模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md#15.组合模式)
##### [16.迭代器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern4.md#16.迭代器模式)

##### [17.单例模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#17.单例模式)
##### [18.桥接模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#18.桥接模式)
##### [19.命令模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#19.命令模式)
##### [20.责任链模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#20.责任链模式)

##### [21.中介者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#21.中介者模式)
##### [22.享元模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#22.享元模式)
##### [23.解释器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#23.解释器模式)
##### [24.访问者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#24.访问者模式)

<div id="5.工厂方法模式"></div>

## 5.工厂方法模式(Fractory Method)
		工厂方法模式（Fractory Method）：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化
		    延迟到其子类
		使用场景:在任何需要生成复杂对象的地方，都可以使用工厂方法模式，复杂对象适合使用工厂模式，用new就可以完成创建的对
		    象无需使用工厂模式。

![工厂方法模式](https://i.imgur.com/VICIkns.png)

##### 简单工厂与工厂方法的区别:
		简单工厂：工厂类包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类去除了具体产品的依赖。
		工厂方法：客户端需要决定去实现哪一个工厂类来实现功能类，选择判断的问题还存在，也就是说，工厂方法把简单工厂的
		    内部逻辑判断移动到了客户端代码来进行。添加功能本来是要修改工厂的，移到客户端修改。
		总结:工厂方法克服了简单工厂违背开闭原则的缺点，又保持了封装对象创建过程中的优点。这两者都是集中封装了对象的创
		   建，使得要更换对象时，不需要做大的改动就可实现，降低了客户程序与对象的耦合。工厂方法模式是简单工厂模式的进
		   一步抽象和推广。 由于使用了性，工厂方法保持了简单工厂的优点，而且克服了他的缺点。但缺点是由于每增加一个产
		   品，就需要增加一个产品工厂的类，增加了额外的开发量。

<div id="6.原型模式"></div>

## 6.原型模式(Prototype)
		原型模式（Prototype）用原型实例指定创建对象的种类，并通过copy这些原型创建新的对象。
			浅复制：被复制对象的所有变量都含有的对象相同的值，所有的copy对象的引用都指向原对象地址值。
			深复制：把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象。
		优点：原型模式是在内存中的二进copy，要比直接new一个对象效率高很多，特别是在一个循环体内产生大量对象的时，原型
		   模式可以更好的体现其优点。
		缺点：他的优点也就是他的缺点，直接在内存中copy,构造函数不会执行，在实际开发中应该注意这个潜在的问题。优就是减
		   少了约束，缺点也是减少了约束，需要大家在使用的时候考虑。
		注意：因为浅复制的明显指向同一个对象的缺点，实际开发中使用深复制，避免使用浅复制。
![原型模式](https://i.imgur.com/oHFCb0T.png)

<div id="7.模板方法模式"></div>

## 7.模板方法模式(TemplateMethod)
		模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法可使得子类在不改变
		   一个算法结构即可重定义该算法的某些特定步骤。

		使用场景：1.多个子类共有的方法，并且逻辑基本相同时。
			 2.重要、复杂的算法，可以把核心算法设计为模板方法，周边相关细节功能由各个子类去实现。
			 3.重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子
			 数约束行为。
		总结：模板方法简而言之“流程封装”，也就是把某个固定的流程封装到一个final函数中，并且让子类能
		      定制这个流程中的某些或者所有步骤，也就是父类提取公用的代码，提升代码的复用率，同时也
		      带来了更好的扩展行。
		
		      优点：1.封装不变的部分，扩展可变的部分。
			   2.提取公共的代码,便于维护。
		      缺点：模板方法会带来代码阅读的难度，会让用户觉得难以理解。

		
![模板方法模式](https://i.imgur.com/xNvTrwy.png)

<div id="8.外观模式"></div>

## 8.外观模式(Facade)
	外观模式：要求一个子系统的外部与其内部的通信必须统一一个统一的对象进行。门面模式提供一个高层次的接口，使子系统更易于使用。
	使用场景：
		1.Facade提供一个简单统一的接口，对外隐藏子系统的具体实现、隔离变化。
		2.需要构建一个层次的子系统时，只用外观模式定义子系统中每层的入口。如果子系统之间是相互依赖的，可以
		通过Facade接口进行通信，简化他们之间的依赖关系。
	总结：
	      优点：
		   1.可客户程序隐藏子系统细节，因而减少了客户对于子系统的耦合，能够拥抱变化。
		   2.外观类对于子系统接口封装，使得系统更易于使用。
	      缺点：
		   1.外观类接口膨胀。由于子系统的接口都有外观类统一对外暴露，使得外观类的API接口较多，在一定程度上增加
		   了用户的使用成本。
		   2.外观类没有遵循开闭原则，当业务出现变更是，有可能需要直接改变外观类在Android中的使用案例为Context和
		   ContextImple

![外观模式](https://i.imgur.com/2tJrDOl.png)
