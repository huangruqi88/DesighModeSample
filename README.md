# 设计模式六大设计原则
##### [二十三种设计模式](https://github.com/huangruqi88/DesighModeSample/blob/master/pattern1.md)

Github .md文件编辑语法格式https://blog.csdn.net/u012067966/article/details/50736647
本文主要参考自《大话设计模式》和网上博客（注：博客忘了链接地址了）如有侵权请主动联系作者
</br>参考链接：https://github.com/chenxkang/DesignPatternDemo

## 1.单一职责原则（SRP）
</br>单一职责：一个类中有且仅有一个引起他变化的原因。
</br>解释：  
　　如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类的其他能力。这种耦合会导致脆弱的设置，当变化发生时，设计会遭到意向不到的破坏。软件设计真正要做的许多内容，就是发现职责并把那些职责互相分离。如果在一个类中需要于一种动机，就需要职责分离
</br>举例：学生只负责学习，医生只负责看病，其他的吃喝拉撒不需要负责。
</br>人可以是医生，农民工，程序员。多以人就针对不同的职业有不同的职责，这种情况下一个人的职责就要过多了，而且一个人的力量是有限做这么多东西显然是很难兼顾。代码中也是一样一个类（方法等）只能行使单一的职责，这样代码的耦合性。
</br>　　1.医生的职责是看病。
</br>　　2.农民工的职责是打工种地。
</br>　　3.程序员的职责是写代码。

![单一职责](https://i.imgur.com/lxKek0o.png)

  
  
## 2.开放-封闭原则（简称开闭原则OCP）
</br>开闭原则：　软件实体（类、模块、函数等等）可以扩展，但是不可以修改。
</br>特征：  
　　1.对于扩展是开放的（Open for extension）
</br>　　2.对于修改是关闭的（Closed for modification）  
</br> 解释：
</br>　　软件系统构架是一个不断重构的过程。一个合格的架构是需要模块模块之间的功能和抽象清晰，面对需求的改变迭代需要保持其相对稳定。无论模块多么多么`封闭`，都存在一些无法对之封闭的变化，所以就需要应对变化构造抽象来隔离变化。  
</br>PS:面对需求是需要通过增加代码进行，而不是修改现有的代码（比如对于一些架构设计不够清晰，耦合度比较高的`谨慎修改`）。
![开闭原则](https://i.imgur.com/SyKzWtc.png)

## 3.依赖倒转原则（DIP）
</br> 解释：
</br>　　　A.高层模块不应该依赖底低模块。两个都应该依赖抽象（Android依赖抽象通常Abstract关键字或者实现接口的方式进行）。
</br>　　　B.抽象不应该依赖细节。细节应该依赖抽象。   
</br>　　　　PS:高层模块 --> Android中通常会抽取BaseActivity或者BaseFragment（比如:公共的标题或者底部导航按钮）。但是这样往往是不够的，这样只是抽象的所有模块的公共属性。
  </br>　　低层模块 --> 有些模块只存在仅有的几个类中（比如：这几个类都用到了蓝牙或者其他的功能），而不是所有的类中，我们通常会对这个类的公共部分进行抽象并继承BaseActivity或者BaseFragment。
</br>　　倒转 --> 是在面向过程中为了是代码可以复用一般会将常用的封装，这样就和低层数据进行绑定，当我们需要再次使用的这些高层封装的时候很难去服用。
![依赖倒转原则](https://i.imgur.com/RXRWbKk.png)
## 4. 里氏替换原则（LSP）
</br>里氏替换原则（LSP）:　子类型必须能够替换掉他的父类型（一个软件实体如果使用的是一个父类的话，那么一定适用于其子类，而且它觉察不出父类对象和子类对象的区别。也就是说在软件里面把父类都替换成它的子类，程序的行为没有任何变化）。

</br> 解释：
</br>　　　只有当子类可以完全替换掉父类，软件单位的功能不受影响时，父类才能真正被复用，而子类也能在父类的基础上增加新的行为。比如：老师（Teacher）有吃、走、运动 ，学生（Student）也有有吃、走、运动 ，原则上需要学生和老师继承或者实现一个共同的类(或者)Person（`注：Android中通常以BaseXXX或者实现公共接口方式实现 `）
</br>　　　```Person person = new Teacher(); Person person = new Student();```
</br>　　　依赖倒置原则就是面向对象的设计，即所有的依赖设计都是依赖于抽象类和接口。
</br>　　　由下图可以知士兵通过BaseGun基类对象可以随时切换使用手枪，步枪，和机关枪
![里氏替换原则](https://i.imgur.com/TLhVuSK.png)

## 5.迪米特法则（也叫最少知识原则{LOD}）
</br>　　迪米特法则：如果两个类不必彼此之间直接通信，那么这连个类就不必直接的相互作用。如果一个类调用另外一个类的某一个方法的话，则可以通过第三者转发调用这个调用。 
</br>　　　前提：在类的结构设计上，每一个类都尽量降低成员的访问权限。
</br>　　　基本思想：迪米特法则强调了类之间的松耦合。类之间的耦合越弱，越利于复用，一个处在弱耦合的类被修改，不会对有关系的类造成波及。
![迪米特法则](https://i.imgur.com/jZywA7w.png)

## 6.接口隔离原则（ISP）
</br>　　接口隔离职责：多个专门的接口，每一个接口负责相对少的职责，而不是使用一个接口实现所有。
</br>　　　解释：接口隔离强调的是接口职责的单一性，和单一职责由异曲同工之处，设计上减少接口污染，接触实现类的对于不需要的实现方法强制实现的依赖。
![接口隔离原则](https://i.imgur.com/GipSYXQ.png)

![接口隔离原则](https://i.imgur.com/FH1sCb6.png)

#### 聚合/组合复用原则（CRP）
</br>　　合成/聚合复用原则：在一个新的对象里使用一些已有的对象,使之成为新对象的一部分。新的对象通过向这些对象的委派达到复用已有功能的目的。
</br>　　　解释：要尽量使用组合/聚合，尽量不要使用类继承。
</br>　　　　聚合（`has-a`）：是关联关联关系的一种，是一种强关联关系。聚合关系是整体和个体/部分之间的关系，关联关系的两个类是处于同一个层次上；而聚合关系上的两个类处于不同层次上，一个是整体，一个是个体/部分。在聚合关系中代表个体/部分的对象可能会被多个代表整体的对象所共享。
</br>　　　　组合（`like-a`）：也是关联关系的一种，但他是比聚合关系更强的关系。聚合关系中代表整体的对象要负责代表个体/部分对象的整个生命周期，组合关系不能共享。在组合关系中，如果代表整体的对象被破坏，那么代表个体/部分的对象呢也一定会被销毁或破坏（`典型代表就是一个类中如果有匿名内部类，那个这个类被销毁，那么这个匿名内部类也会被销毁`）；而在聚合关系中，代表个体/部分的对象则有可能会被多个代表整体的对象所共享，而不一定会随着某个代表整体的对象被销毁或者破坏而被销毁或者破坏。
</br>　　　  `组合体现Java中，组合关系是通过成员变量来实现的。`
</br>　　　  聚合和组合的区别：`处于聚合关系的两个类生命周期不同步。处于组合关系的两个类生命周期同步。`

![聚合复用原则](https://i.imgur.com/2CiFkNN.png)
