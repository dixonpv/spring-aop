/**
 * 
 */
package com.dixon.spring.springaop;

/**
 * @author dixon
 *
 */
public class ProductServiceImpl implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		return num1*num2;
	}

}
