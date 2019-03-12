##### [1.简单工厂模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#1.简单工厂模式)
##### [2.策略模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#2.策略模式)
##### [3.装饰模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#3.装饰模式)
##### [4.代理模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md#4.代理模式)

##### [5.工厂方法模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md#5.工厂方法模式)
##### [6.原型模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md#6.原型模式)
##### [7.模板方法模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md#7.模板方法模式)
##### [8.外观模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern2.md#8.外观模式)

##### [9.建造者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#9.建造者模式)
##### [10.观察者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#10.观察者模式)
##### [11.抽象工厂模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#11.抽象工厂模式)
##### [12.状态模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern3.md#12.状态模式)

##### [13.适配器模式](#13.适配器模式)
##### [14.备忘录模式](#14.备忘录模式)
##### [15.组合模式](#15.组合模式)
##### [16.迭代器模式](#16.迭代器模式)

##### [17.单例模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#17.单例模式)
##### [18.桥接模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#18.桥接模式)
##### [19.命令模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#19.命令模式)
##### [20.责任链模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern5.md#20.责任链模式)

##### [21.中介者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#21.中介者模式)
##### [22.享元模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#22.享元模式)
##### [23.解释器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#23.解释器模式)
##### [24.访问者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md#24.访问者模式)

<div id="13.适配器模式"></div>

## 13.适配器模式
	适配器模式：将一个类的接口变换成客户端的所期待的另一种接口，从而使原本因接口不匹配而无法再一起工作的两个类能够在一起工作。
	使用场景：
	    1.系统需要使用现有的类，而此类的接口不符合系统的需要，即接口不兼容。
	    2.想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。
	    3.需要一个统一的输出接口，而输入端的类型不可预知。
	
	总结：
	    优点：
	        1.更好的复用性，系统需要使用现有的类，而此类的接口不符合系统的需要。那么通过适配器就可以让这些功能得到更好的复用。
	        2.更好的扩展性，在实现适配器功能的时候，可以调用自己开发的功能，从而自然地扩展系统的功能。
	    缺点：
	        过多地使用适配器，会让系统非常零乱，不易整体把握。（例：明明看到调用的A接口，其实内部被适配成了B接口的实现。）


![适配器模式](https://i.imgur.com/cagQtLe.png)

<div id="14.备忘模式"></div>

## 14.备忘模式(Memento)
	备忘录模式：在不破坏封闭的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态，这样就可以将对象恢复到原先保存的状态。
	使用场景：
	    1.需要保存一个对象在某一个时刻的状态或部分状态。
	    2.如果用一个接口来让其他对象得到这些状态，将会暴露对象的实现细节并破坏对象的封装性，一个对象不希望外界直接访问内部状
	    态，通过中间对象可以直接访问内部状态。

	总结：
	    优点：
	        1.给用户提供了一种可以恢复状态的机制，可以使用用户能够比较方便的回到某个历史的状态。
	        2.实现了信息的封装，使用户不用关心状态的保存细节。
	    缺点：消耗资源多，如果成员变量过多，势必会占用比较大的资源，而每一次保存都会消耗一定的内存。

![备忘录模式](https://i.imgur.com/3i6hFtM.png)

<div id="15.组合模式"></div>

## 15.组合模式(Composite)
	组合模式：将对象组合成树形结构以表示“部分——整体”的层次结构。组合模式使得用户对单个对象和组合对象
	的使用具有一致性。
	使用场景：
	    1.表示对象的部分——整体层次结构时。
	    2.从一个整体中能够独立出部分模块或功能场景。
	总结：
	    优点：
	        1.可以清楚的定义层次的复杂对象，表示对象全部或部分层次，它让高层模块忽略了层次的差异，
	      方便对整个层次结构进行控制。
	        2.高层模块可以一致地使用一个组合结构或其中单个兑现个，不必关心处理的是单个对象还是整
	      个组合结构，简化了高层模块的代码。
	        3.增加新的枝干构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
	        4.为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和枝干对象的递归组合，
	      可以形成复杂的树形结构，但对树形结构的控制却非常简单。
	    缺点：
	        在新增构建是不好对枝干中的构件类型进行限制，不能依赖类型系统来施加这些约束，因为在大多数
	      情况下，它们都来自于相同的抽象层，此时，必须进行类型检查来实现，这个实现过程较为复杂。

![组合模式](https://i.imgur.com/zZOY0NV.png)

<div id="16.迭代器模式"></div>

## 16.迭代器模式(Iterator)
	迭代器模式：提供一种方法顺序访问一个容器对象中的各个元素，而不又不需要暴露该对象的内部表示。
	使用场景：遍历一个容器对象时。
	总结：
	    优点：支持不同的方式去遍历一个容器对象，也可以有多个遍历，弱化了容器类与遍历算法之间的关系。
	    缺点：类文件增加
    

	PS:高级语言中都有相对应的迭代器支持，例如：List,Map和Android中的Cursor。
![迭代器模式](https://i.imgur.com/gmiVjSu.png)
