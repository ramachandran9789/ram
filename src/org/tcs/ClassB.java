package org.tcs;


	public class ClassB implements A {

		@Override
		public void test() {
			System.out.println("interface method Implemented");
			}
		
		public static void main(String args[]) {
			ClassB p = new ClassB();
			p.test();
					
		}
		
	}