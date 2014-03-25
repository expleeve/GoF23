package gof.structure.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Í¸Ã÷Ê½
 * @author CK
 *
 */
public class Composite1 implements Component1 {

	private Vector componentVector = new Vector();
	
	@Override
	public void sampleOperation() {
		Enumeration enumeration = components();
		while(enumeration.hasMoreElements()){
			((Component1)enumeration.nextElement()).sampleOperation();
		}
	}

	@Override
	public Composite1 getComposite() {
		return this;
	}

	@Override
	public void add(Component1 component) {
		this.componentVector.addElement(component);
	}

	@Override
	public void remove(Component1 component) {
		this.componentVector.removeElement(component);
	}

	@Override
	public Enumeration components() {
		return this.componentVector.elements();
	}

}
