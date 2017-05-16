package com.ehnois.objectcreation.staticfactory;

public class StaticFactoryExample {

	/**
	 * Static instance that is used 
	 */
	public static final StaticFactoryExample STATIC_FACTORY_EXAMPLE = new StaticFactoryExample(5);
	
	/**
	 * Attribute that keeps the size of the factory
	 */
	private int factorySize;
	
	/**
	 * The constructor, when used to provide instances of the class has some disavantages like: It can't have a meaninful name that describes
	 * it 's logic, it creates a new object every time even if a    
	 * @param factorySize
	 */
	public StaticFactoryExample(int factorySize) {
		this.factorySize = factorySize;
	}
	
	/**
	 * With this 
	 * @return
	 */
	public static StaticFactoryExample createObjectsWithSize5() {
		return (STATIC_FACTORY_EXAMPLE.factorySize == 5) ? STATIC_FACTORY_EXAMPLE : new StaticFactoryExample(5);
	}
}
