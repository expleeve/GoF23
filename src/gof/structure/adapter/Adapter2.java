package gof.structure.adapter;

/**
 * ��������ɫ
 * �����������ģʽ
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
