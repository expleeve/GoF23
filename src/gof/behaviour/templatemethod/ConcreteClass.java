package gof.behaviour.templatemethod;

public class ConcreteClass extends AbstractClass {
	
	public void doOperation1(){
		System.out.println("doOperation1()");
	}

	public void doOperation2(){
		//不能在此调用doOperation3();
		System.out.println("doOperation2()");
	}
}
