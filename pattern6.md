##### [1.简单工厂模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)
##### [2.策略模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)
##### [3.装饰模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)
##### [4.代理模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)

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

##### [21.中介者模式](#21.中介者模式)
##### [22.享元模式](#22.享元模式)
##### [23.解释器模式](#23.解释器模式)
##### [24.访问者模式](#24.访问者模式)

<div id="21.中介者模式"></div>
## 21.中介者模式(Mediator)
	中介者模式：用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式的相互引用，从而使其耦合
	    松散，而且可以独立的改变他们之间的额交互。	
	使用场景：当对象之间的交互操作很多且每个对象的行为操作彼此依赖时，为防止在修改一个对象的行为时，同事设计修改很多其他的对象
	的行为，可采用此模式来进行解耦合。
	
	总结：
	    适当的使用中介者模式类之间的依赖进行解耦使逻辑结构清晰，但是如果几个类间的依赖关系并不复杂，使用中介者模式反而会使原本
	不复杂的逻辑结构变得复杂。使用时要多方考虑、权衡利弊。

	PS:该模式将对象的多对多的关系变成一对多的关系，中介者对象将系统从网状结构变成以调停者为中心的心形
	机构，达到降低系统的复杂性，可提高扩展作用。

![中介者模式](https://i.imgur.com/j9zvuhv.png)

<div id="22.享元模式"></div>
## 22.享元模式(Flyweight)
	定义：使用共享对象可有效的支持大量粗粒度的对象
	使用场景：
	    1.系统中存在大量的相似对象。
	    2.细粒度的对象都具备较接近的外部状态，而且内部状态与环境无关，也就是说对象没有特定身份。
	    3.需要缓冲池的场景。
	
	总结：
	    优点：大幅度地降低内存中对象的数量，降低程序内存的占用。增强程序的性能。
	    缺点：
	       1.使得系统更为复杂。为了使对象可以共存，需要将一些状态外部化，使程序逻辑复杂化。	
	       2.将亨元对象的状态外部化，而读取外部状态使得运行时间稍微变长。


![享元模式](https://i.imgur.com/xZI9tq3.png)

<div id="23.解释器模式"></div>
## 23.解释器模式(interpreter)
	解释器模式：给定一个语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子
	使用场景：
	     1.如果某个简单的语言需要解释执行而且可以将该语言中的语句表示为一个抽象语法树。
	     2.在某些特定的领域出现不断重复的问题时，可以将该领域的问题转化为一种语法规则下的语句，然后构建解释器来解释该语句。
	总结：
	    优点：拥有灵活的扩展性，当需要对文法进行扩展时只需要增加相应的非终结符解释器，并在构件相应的语法树时，使用到新增的解释
	器对象进行具体的解释。
	    缺点：
	        1.由于每一条文法至少对应一个解释器，其会生成大量的类，导致后期维护困难。
	        2.对于复杂的文法，构建其抽象语法树会异常繁琐甚至有可能会出现构架多棵抽象语法树的情况，所以对于复杂的文法并不推荐使用。


	PS:解释器模式更像是构建一种简单的编程语言，比如Android中AndroidMainfest.xml中，每一行标签对应一条语法，本质上是xml文件，区
	别就在于重新定义了标签。

![解释器模式](https://i.imgur.com/aGAJvWS.png)
	
<div id="24.访问者模式"></div>
## 24.访问者模式(Visitor)
	访问者模式：表示一个作用于某对象结构中的革元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新
		操作。
	使用场景：
	    1.对象结构比较稳定，几乎不怎么改变，但是由需要经常在此对象结构上定义新的操作行为。
	    2.需要对一个对象结构中的对象进行很多不同的并且不相关的操作，它可以在不改变这个数据结构的前提下定义这些元素
	      的新的操作。
	
	总结：
	    优点：
	        1.各种角色各司其职，符合单一职责
	        2.在原有的类上新增操作只需实现一个访问者，不必修改整个类的层次，符合开闭原则。
	        3.数据操作和数据结构的解耦。
	        4.良好的扩展性，新增访问操作变得简单。
	    缺点：
	        1.具体元素对访问者公布了实现细节，破坏了类的封装性，违反了迪米特原则。
	        2.违反了依赖倒置原则，为了到达区别对待依赖了具体而不是抽象。
	        3.新增元素困难，修改成本太大，需要在抽象访问者角色中增加一个新的抽象操作，违反了开闭原则。

	
![访问者模式](https://i.imgur.com/zrshYAc.png)
