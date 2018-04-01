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
 * �̲߳���ȫ������ʽ
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
 * �̰߳�ȫ������ʽ
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
 * ����ʽ
 */
class HungerSingleton {  
    private static HungerSingleton instance = new HungerSingleton();  
    private HungerSingleton (){}  
    public static HungerSingleton getInstance() {  
    	return instance;  
    }  
}  
