package gof.structure.adapter;

/**
 * 适配器角色
 * 对象的适配器模式
 * @author chenkund
 *
 */
public class Adapter2 implements Target{
	
	Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee){
		super();
		this.adaptee = adaptee;
	}

	@Override
	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}

	@Override
	public void sampleOperation2() {
		//do something
	}

	
}
