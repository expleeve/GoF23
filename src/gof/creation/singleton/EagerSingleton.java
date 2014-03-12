package gof.creation.singleton;

/**
 * ถ๖บบ
 * @author chenkund
 *
 */
public class EagerSingleton {

	private static final EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		return singleton;
	}
}
