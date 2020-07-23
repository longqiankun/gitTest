package com.longqiankun.javalib;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
	public int aa=0;

	public MyClass(int aa) {
		this.aa = aa;
	}

	public static void main(String[] args) {
		System.out.println("test111");
		Map<Integer,MyClass> aa=new HashMap<>();
		Map<Integer,MyClass> bb=new HashMap<>();
		aa.put(0,new MyClass(3));
		aa.put(2,new MyClass(5));

		bb.put(0,aa.get(0));
		bb.put(2,aa.get(2));
		bb.get(2).aa=8;
		bb.put(3,new MyClass(9));

		for (Map.Entry<Integer,MyClass> entry:aa.entrySet()){
			System.out.println("testa"+entry.getValue().aa);
		}
		for (Map.Entry<Integer,MyClass> entry:bb.entrySet()){
			System.out.println("testb"+entry.getValue().aa);
		}
	}
}
