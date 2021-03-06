package com.ehnois.objectcreation.staticfactory;

/**
 * Item 1: Consider Static Factory Methods Instead of Constructors
 * 
 * @author rafaelcfreire
 */
public class StaticFactoryExample {

	/**
	 * Static instance that is returned by our static method in case of recurrent calls.
	 */
	public static final StaticFactoryExample STATIC_FACTORY_EXAMPLE = new StaticFactoryExample(5);
	
	/**
	 * Attribute that keeps the size of the factory
	 */
	private int factorySize;
	
	/**
	 * The constructor, when used to provide instances of the class has some disavantages like: 
	 * It can't have a meaninful name that describes
	 * it 's logic, it creates a new object every time even if a new one is not necessary.
	 *     
	 * @param factorySize
	 */
	public StaticFactoryExample(int factorySize) {
		this.factorySize = factorySize;
	}
	
	/**
	 * With this approach, it is clear that object created will have factorySize = 5.
	 * @return An object with size 5 or an object with size 0
	 */
	public static StaticFactoryExample getObjectsWithSize5DefaultOrZero() {
		return (STATIC_FACTORY_EXAMPLE.factorySize == 5) ? STATIC_FACTORY_EXAMPLE : new StaticFactoryExample(0);
	}
}
