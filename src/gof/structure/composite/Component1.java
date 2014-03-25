package gof.structure.composite;

import java.util.Enumeration;

/**
 * Í¸Ã÷Ê½
 * @author CK
 *
 */
public interface Component1 {
	
	void sampleOperation();
	
	Composite1 getComposite();
	
	void add(Component1 component);
	
	void remove(Component1 component);
	
	Enumeration components();
}
