package com;

public class Test {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		t.add(44, 55);
	}

	void show(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		Test t = new Test();
		t.show(55, 55);
	}
	
}
