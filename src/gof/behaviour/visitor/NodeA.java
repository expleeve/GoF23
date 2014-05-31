package gof.behaviour.visitor;

public class NodeA extends Node {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String operationA(){
		return "NodeA is visited";
	}
}
