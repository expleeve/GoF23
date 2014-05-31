package gof.behaviour.visitor;

public class NodeB extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public String operationB(){
		return "NodeB is visited";
	}

}
