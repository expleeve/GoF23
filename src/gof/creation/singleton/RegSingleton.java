package gof.creation.singleton;

import java.util.HashMap;

/**
 * µÇ¼Ç
 * 
 * @author chenkund
 * 
 */
public class RegSingleton {

	private static HashMap m_registry = new HashMap();
	static {
		RegSingleton singleton = new RegSingleton();
		m_registry.put(singleton.getClass().getName(), singleton);
	}

	protected RegSingleton() {

	}

	public static RegSingleton getInstance(String name) {
		if (name == null || name.length() == 0) {
			name = "gof.creation.singleton.RegSingleton";
		}
		if (m_registry.get(name) == null) {
			try {
				m_registry.put(name, Class.forName(name).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (RegSingleton) m_registry.get(name);
	}
}

class RegSingletonChild extends RegSingleton {

	public RegSingletonChild() {

	}

	public static RegSingletonChild getInstance() {
		return (RegSingletonChild) RegSingleton
				.getInstance("gof.creation.singleton.RegSingletonChild");
	}
}
