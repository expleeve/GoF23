package gof.structure.bridge;

public abstract class Abstraction {
	
	protected Implementor imp;
	
	public void operation(){
		imp.operationImp();
	}

}
