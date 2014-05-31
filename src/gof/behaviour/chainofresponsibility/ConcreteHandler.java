package gof.behaviour.chainofresponsibility;

public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {
		if(getSuccessor() != null){
			System.out.println(getSuccessor());
			getSuccessor().handleRequest();
		}else{
			System.out.println("here");
		}
	}

}
