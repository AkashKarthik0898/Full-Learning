package com.learning.functionalInterfaces;


import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String[] args) {

	
		Supplier<LocalDateTime> supplier = new Supplier<LocalDateTime>() { // Accepts no input but returns a desired value

			@Override
			public LocalDateTime get() {
				return LocalDateTime.now();

			}
		};

		System.out.println(supplier.get());

		
		Supplier<LocalDateTime> supplierLambda = () -> LocalDateTime.now();
		System.out.println(supplierLambda.get());
	}

}
