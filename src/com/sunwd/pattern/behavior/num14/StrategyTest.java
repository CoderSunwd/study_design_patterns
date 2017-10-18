package com.sunwd.pattern.behavior.num14;

public class StrategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String exp = "2+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}

}
