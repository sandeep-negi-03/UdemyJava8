package com.functionalinterface.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Supplier to supply system date
 * @author sannegi6
 */

public class SupplierGetDemo {

	public static void main(String[] args) {
		
		Supplier<Date> supplier = ()->new Date();
		System.out.println(supplier.get());

		Supplier<String> supplier2 = ()->{ String[] array = { "A", "B","C", "D"};
											int x= (int) (Math.random()*4);
											return array[x];
									};
		System.out.println("Random String : " + supplier2.get());
									
	}
	
}
