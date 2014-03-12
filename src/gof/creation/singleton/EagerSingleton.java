package gof.creation.singleton;

/**
 * ����
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
