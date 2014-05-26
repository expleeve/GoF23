package gof.behaviour.templatemethod;

/**
 * 强制子类实现剩余逻辑
 * 
 * @author chenkund
 *
 */
public abstract class AbstractClass {

	public void TemplateMethod(){
		doOperation1();
		doOperation2();
		doOperation3();
	}

	private final void doOperation3() {
		// TODO Auto-generated method stub
		
	}

	protected abstract void doOperation2();

	protected abstract void doOperation1();
}
