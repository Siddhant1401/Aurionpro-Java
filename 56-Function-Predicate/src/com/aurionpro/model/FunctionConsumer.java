package com.aurionpro.model;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionConsumer {

	public static void main(String[] args) {

		Consumer<String> obj = (name) -> {
			System.out.println("Welcome " + name);
		};
		obj.accept("Sid");

		Function<String, Integer> funObj = (name) -> {
			return name.length();
		};
		System.out.println(funObj.apply("Siddhant"));

		Function<String, String> funObj1 = (name) -> {
			return name.toLowerCase();
		};
		System.out.println(funObj1.apply("SEAWAVES"));

		Predicate<String> predicateObj = (string) -> {
			return string.length() <= 5;
		};
		System.out.println(predicateObj.test("Siddhant"));

		Predicate<Integer> predicateObj2 = (num) -> {
			return num % 2 == 0;
		};
		System.out.println(predicateObj2.test(10));

		BiFunction<Integer, Integer, Integer> biObj = (num1, num2) -> {
			return num1 + num2;
		};
		System.out.println(biObj.apply(20, 30));

		BiConsumer<String, Integer> biConsumerObj = (name, age) -> {
			System.out.println("Heyyyy I m " + name + " and my age is " + age);
		};
		biConsumerObj.accept("Siddhant", 22);

		BiPredicate<String, String> check = (pass1, pass2) -> {
			return pass1.equals(pass2);
		};
		System.out.println(check.test("ABC", "BAC"));
	}

}
