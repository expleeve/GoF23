package gof.structure.facade;

/**
 * 在调用时，直接调用Facade中的activate和deactivate就可以了，不 需要Client知晓内部个对象的存在
 * 
 * @author CK
 *
 */
public class Facade {

	public void activate(){
		//内部各个对象激活
	}
	
	public void deactivate(){
		//内部各个对象停止
	}
}
