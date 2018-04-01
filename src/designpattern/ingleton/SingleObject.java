package designpattern.ingleton;

public class SingleObject {

	private static SingleObject o = new SingleObject();
	
	private SingleObject(){
		
	}
	
	public static SingleObject getObject(){
		return o;
	}
	
	public void someDeal(){
		System.out.println("do something here");
	}
}
/*
 * 线程不安全的懒汉式
 */
class Singleton {  
    private static Singleton instance;  
    private Singleton (){}  
  
    public static Singleton getInstance() {  
	    if (instance == null) {  
	        instance = new Singleton();  
	    }  
	    return instance;  
    }  
}
/*
 * 线程安全的懒汉式
 */
class LazySingleton {  
    private static LazySingleton instance;  
    private LazySingleton (){}  
  
    public static synchronized LazySingleton getInstance() {  
	    if (instance == null) {  
	        instance = new LazySingleton();  
	    }  
	    return instance;  
    }  
} 
/*
 * 饿汉式
 */
class HungerSingleton {  
    private static HungerSingleton instance = new HungerSingleton();  
    private HungerSingleton (){}  
    public static HungerSingleton getInstance() {  
    	return instance;  
    }  
}  
