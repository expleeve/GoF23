package gof.behaviour.strategy;

/**
 * @author chenkund
 *
 */
public class Context {
	
	private Strategy strategy;
	
	public void contextInterface(){
		strategy.strategyInterface();
	}
}
