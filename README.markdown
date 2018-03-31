# DesignPattern

设计模式基于面向对象的原则：
1.对接口编程而不是对实现编程。
2.优先使用对象组合而不是继承。
			----By Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides 

#设计模式分类
<img src="http://www.runoob.com/wp-content/uploads/2014/08/the-relationship-between-design-patterns.jpg">

##一、创建型模式：
这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

###1.工厂模式
定义：创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象
认识：用于创建复杂对象时统一创建对象，简单对象则不需要工厂类，否则增加系统的复杂程度。————>ShapeFactory





