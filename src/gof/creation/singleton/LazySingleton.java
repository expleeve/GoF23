package gof.creation.singleton;

/**
 * ¿¡∫∫
 * @author chenkund
 *
 */
public class LazySingleton {
	
	private static LazySingleton singleton = null;
	
	private LazySingleton(){
		
	}
	
	/**
	 * synchronized
	 * 
	 * @return
	 */
	synchronized public static LazySingleton getInstance(){
		if(singleton == null){
			singleton = new LazySingleton();
		}
		return singleton;
	}

}
