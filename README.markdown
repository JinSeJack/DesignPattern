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

####1.1抽象工厂
	即工厂的工厂，用来得到工厂的工厂，可以统一管理某一类具有相同属性的对象
	
###2.单例模式
	特点：
	1、单例类只能有一个实例。
	2、单例类必须自己创建自己的唯一实例。
	3、单例类必须给所有其他对象提供这一实例。
	实现方式：
	1、懒汉式（线程不安全）多线程下不可用
	public class Singleton {  
	    private static Singleton instance;  
	    private Singleton (){}  
	  
	    public static Singleton getInstance() {  
		    if (instance == null) {  
		        instance = new Singleton();  
		    }  
		    return instance;  
	    }  
	}  
	2、懒汉式（线程安全）多线程下可用 
		优点：第一次调用才初始化，避免内存浪费。
		缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
	public class Singleton {  
	    private static Singleton instance;  
	    private Singleton (){}  
	  
	    public static synchronized Singleton getInstance() {  
		    if (instance == null) {  
		        instance = new Singleton();  
		    }  
		    return instance;  
	    }  
	} 
	3、饿汉式
	public class Singleton {  
	    private static Singleton instance = new Singleton();  
	    private Singleton (){}  
	    public static Singleton getInstance() {  
	    	return instance;  
	    }  
	}  
###3.建造者模式
	定义：使用多个简单的对象一步一步构建成一个复杂的对象。例如：StringBuilder类
	
	



