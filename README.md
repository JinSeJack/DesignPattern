# DesignPattern

	设计模式基于面向对象的原则：
	1.对接口编程而不是对实现编程。
	2.优先使用对象组合而不是继承。
			----By Erich Gamma、Richard Helm、Ralph Johnson 和 John Vlissides 

# 设计模式分类
<img src="http://www.runoob.com/wp-content/uploads/2014/08/the-relationship-between-design-patterns.jpg">

## 一、创建型模式：
	这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

### 1.工厂模式
	定义：创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象
	认识：用于创建复杂对象时统一创建对象，简单对象则不需要工厂类，否则增加系统的复杂程度。————>ShapeFactory

#### 1.1抽象工厂
	即工厂的工厂，用来得到工厂的工厂，可以统一管理某一类具有相同属性的对象
	
### 2.单例模式
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
	
### 3.建造者模式
	定义：使用多个简单的对象一步一步构建成一个复杂的对象。例如：StringBuilder类
	
### 4.原型模式
	定义：用于创建重复对象，同时保证性能的模式。
	应用场景：一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。

## 二、结构型模式
	这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。

### 2.1适配器模式
	定义：作为两个不兼容的接口之间的桥梁，结合了两个独立接口的功能。
	注意事项： 适配器不是在详细设计时添加的，而是解决正在服役的项目的问题
	使用场景：1、系统需要使用现有的类，而此类的接口不符合系统的需要。
			 2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。 
			 3、通过接口转换，将一个类插入另一个类系中。（比如老虎和飞禽，现在多了一个飞虎，在不增加实体的需求下，增加一个适配器，在里面包容一个虎对象，实现飞的接口。）
			 
### 2.2桥接模式
	定义：提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
	使用场景：实现系统可能有多个角度分类，每一种角度都可能变化。把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
	应用实例： 
	1、猪八戒从天蓬元帅转世投胎到猪，转世投胎的机制将尘世划分为两个等级，即：灵魂和肉体，前者相当于抽象化，后者相当于实现化。生灵通过功能的委派，调用肉体对象的功能，使得生灵可以动态地选择。 
	2、墙上的开关，可以看到的开关是抽象的，不用管里面具体怎么实现的。
	
### 2.3过滤器模式
	定义：使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
	比较简单不加代码：过滤器即实现过滤效果，对于传入的一组对象或者条件，留下符合条件的对象或结果。过滤器定义过滤方法，通过传入的参数，根据过滤标准进行过滤，返回结果。在web后台中使用十分广泛，请求可以进行很好的过滤，实现统一控制。

