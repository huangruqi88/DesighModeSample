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

##### [17.单例模式](17.单例模式)
##### [18.桥接模式](#18.桥接模式)
##### [19.命令模式](#19.命令模式)
##### [20.责任链模式](#20.责任链模式)

##### [21.中介者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)
##### [22.享元模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)
##### [23.解释器模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)
##### [24.访问者模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern6.md)

<div id="17.单例模式"></div>
## 17.单例模式(Singleton)
	单例模式：确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
	使用场景：
	    确保某个类只有一个对象的场景，避免产生多个对象消耗过多的资源，或者某种类型的对象只应该有并且只有一个。
	单例的几种方式：
	    1.饿汉式：在声明静态对象时就已经被初始化，因此不存在多线程并发的问题
		优点：写起来简单，代码量少，线程安全。
	        缺点：典型的时间换空间，资源利用率高，但是，每次都调用getInstence()方法都要同步，并发效率低。
	    2.懒汉式：声明一个静态对象，并且在用户第一次调用getInstance时进行初始化
	        优点：单例只有在使用时才会被初始化在一定程度上节约资源。
	        缺点：第一次加载时需要及时进行实例化，反应稍慢，但是每次调用getInstance()时都进行同步，造成不必要的同步开销，不建议
		使用懒汉式。
	    3.双重校验锁：在赖汉式的getInstance()加上两次非空判断
	        优点：资源利用率高，第一次执行getInstance时单例对象才会被实例化效率高。
	        缺点：第一次加载反应稍慢，也由于Java的内存模型偶尔会失败，有极小概率不能保证线程安全和对象的唯一性。
	    4.静态内部类单例：定义一个静态的内部类，并在内部类中进行实例化单例。
		    优点：第一次加载Singleton类时并不会初始化实例，只有在第一次调用getInstance方法时才会mInstance被实例化,因此，
		    第一次调用getInstance（）方法会导致JVM加SingletonHolder类，这种方式不仅能够保证线程安全，也能够保证单例对象
		    的唯一性，同时也延迟了单例的实例化，推荐使用者中方式。
	    5.枚举单例：
	        优点：写法简单，线程安全，默认枚举实例的创建时线程安全的，并且任何情况下它都是一个单例。
		    PS:上述四种单例在反序列化的情况下会出现重新创建对象的情况。
	            通过序列化可以将一个单例的实例对象写到磁盘，然后再读回来，从而有效的获得一个实例。即使构造函数是私有的，反序列化
		    时依然可以通过特殊途径去创建类的一个新的实例，相当于调用该类的构造函数。反序列化提供类一个很特别的钩子函数，类中
		    具有一个私有的、被实例化的方法readResolve(),这个方法可以让开发人员控制对象的反序列化。
	    6.容器单例模式：在程序初始化的时候，将多种单例类型注入到一个统一管理类中，在使用时根据key获取对象对应类型的对象。
	        优点：可以管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，降低用户的使用成本，也对用户隐藏了具体实现，
		降低耦合度，每一个key对用一个实例同时又保证了线程的安全。
	    PS:Android中的使用见LayoutInflater.from(mContext).infalte(layoutID,null)from(Context)函数内部调用的是Context类的
	    getSystemService(String key)方法实现的单例
	总结：
	    优点：
	        1.由于单例模式在内存中只有一个实例，减少了内存开支，特别是一个对象需要频繁的创建、销毁时，而且创建或者销毁时性能又无
		法优化。
	        2.由于单例模式只生成一个实例，所以，减少了系统性能的开销，当一个对象的产生需要比较多的资源时，如读取配置、产生其他依
		赖对象时，则可以通过在应用启动时直接产生一个单例对象，然后永久驻留内存的方式来解决。
	        3.单例模式可以避免对资源的多重占用，例如写一个文件操作，由于只有一个实例在内存中，避免对一个资源文件的同时写操作。
	        4.单例模式乐意在系统设施全局访问点，优化和共享资源访问，例如，可以设计一个到单例，负责所有数据表的映射处理。
	    缺点：
	        1.单例模式一般没有接口，扩展困难，若要扩展，除了修改代码基本上没有第二种途径可以实现。
	        2.单例对象如果持有Context，那么很容易引发内存泄漏，此时需要注意传递给单例对象的Context最好是Application Context.
![单例模式](https://i.imgur.com/INba7RO.png)


<div id="18.桥接模式"></div>
## 18.桥接模式(Bridge)
	桥接模式：桥接模式也称桥梁模式没，将抽象部分与实现部分分离，使它都可以独立的进行变化。
	使用场景:
	    1.“桥梁的作用”其实就是连接“抽象部分”与“实现部分”，但是事实上。任何多维度变化类，或者树状类之间的耦合都可以使用桥接模式来
	    实现解耦。
	    2.如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，使他们在抽象
	    层建立一个关联关系。

	    3.不希望继承或因为多层次继承导致系统类的个数急剧增加的系统，
	    4.一个类存在两个独立变化的维度，且两个维度都需要进行扩展。
	
	总结：
	    优点：分离抽象与实现、灵活扩展以及对客户来说透明的实现等。
	    缺点：不容易设计，对开发者要有一定的经验要求，因此此模式理解简单，设计却不容易
	PS:因为桥接模式对于抽象与伤心爱你的分离不容易把握，所以实际看法中很好使用。
	
	Android中桥接模式应用非常广泛，比如在View的视图层级中，CheckBox、CompoundButton、Button、TextView和View之间构成一个
	继承关系的视图层级，每一层视图都仅仅是对一种类型控件的描述，其定义了该类控件所拥有的基本属性和行为，但是将他们真正绘制带
	屏幕的部分是由于View相关的功能实现类DisplayList、HardwareLayer和Canvas负责。这两部分之间的关系可以看做是对桥接模式的应
	用。还有就是Adapter于AdapterView之间也可以看做是对桥接模式的应用。还有就是framework层的AMS和WMS等不作详细阐述。

![桥接模式](https://i.imgur.com/PNRXGMj.png)

<div id="19.命令模式"></div>
## 19.命令模式(Command)
	命令模式：将一个请求封装成对象，从而让用户使用不同的请求把客户端参数化；对请求排队或者记录请求日志，以及支持可撤销模式。
	
	使用场景：
	    1.需要抽象出执行的动作，然后以参数的形式提供出来——类似于过程中的回调机制，而命令模式正式回调机制的一个面向对象的替代品。
	    2.在不同的时刻指定、排列和执行请求。一个命令对象可以有与初始请求无关的生存期。
	    3.需要支持取消操作
	    4.支持修改日志功能，这样当系统崩溃时，这些修改可以重做一遍。
	    5.需要支持事物操作。
	
	总结：
	    优点：更弱的耦合性、更灵活的控制性以及更好的扩展性。
	    缺点：拥有几乎所有设计模式的通病——类文件的膨胀，大量衍生类的创，由于存在此问题所以实际开发中是否需要使用命令模式。
	Andoroid在对应用程序包管理PackageManagerService也是Android系统的Service之一，其主要功能在于实现对应包的解析、管理、
	卸载等操作使用的就是命令模式的体现。
![命令模式](https://i.imgur.com/R3DIyt6.png)

<div id="20.责任链模式"></div>
## 20.责任链模式(Chain of Responsibility)
	责任链模式：使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连城一条链，并沿着这条
	链传递该请求，只到有对象处理它为止。
	使用场景：
	    1.多个对象可以处理同一请求，但具体由哪个对象则在运行时动态决定。
	    2.在请求处理这不明确的情况下向多个对象中的一个提交一个请求。
	    3.需要动态指定一组对象处理请求。

![责任链模式](https://i.imgur.com/CCzfbZl.png)
