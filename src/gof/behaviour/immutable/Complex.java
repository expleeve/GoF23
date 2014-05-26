package gof.behaviour.immutable;

import java.io.Serializable;

public class Complex extends Number implements Serializable, Cloneable, Comparable{

	/**
	 * 对象创建后，所有运算都不会改变对象本身
	 */
	private static final long serialVersionUID = 1L;

	static final public Complex i = new Complex(0.0, 1.0);
	
	private double re;
	private double im;
	
	public Complex(Complex z){
		this.re = z.re;
		this.im = z.im;
	}
	
	public Complex(double d, double e) {
		this.re = d;
		this.im = e;
	}
	
	public Complex(double re){
		this.re = re;
		this.im = 0.0;
	}
	
	public Complex(){
		this.re = 0.0;
		this.im = 0.0;
	}
	
	public boolean equals(Complex z){
		return (this.re == z.re && this.im == z.im);
	}
	
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else if(obj instanceof Complex){
			return equals((Complex) obj);
		}else{
			return false;
		}
	}

	public int hashCode(){
		long re_bits = Double.doubleToLongBits(this.re);
		long im_bits = Double.doubleToLongBits(this.im);
		return (int)((re_bits ^ im_bits) ^ ((re_bits ^ im_bits) >> 32));
	}
	
	public static Complex add(Complex x, Complex y){
		return new Complex(x.re + y.re, x.im + y.im);
	}
	
	//... ...
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
