package com.ibm.event;

class EventImpl implements Event {

	@Override
	public void perform() {
		System.out.println("First performance");
	}

}

public class EventDemo{
	//inner class
	class InnerEventImpl implements Event{
		@Override
		public void perform() {
			System.out.println("Second performance");
		}
	}
	//static innerclass
	static class StaticInnerEventImpl implements Event{
		@Override
		public void perform() {
			System.out.println("Third performance");
		}
	}
	
	public void anotherEvent() {
		class NestedEventImpl implements Event {

			@Override
			public void perform() {
				System.out.println("Fourth performance.");
			}
		}
		;
		new NestedEventImpl().perform();
	}
	
	public void oneLastEvent() {
		Event e=()->System.out.println("Sixth performance");    //lambda expression
		e.perform(); 
	}
	
	public void oneMoreEvent() {
		Event e=new Event() {
			@Override
			public void perform() {
				System.out.println("Fifth performance");
			}
		};
		e.perform();
	}
	
	//main class
	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.perform();
		
		//instantiating the inner class
		EventDemo ed = new EventDemo();
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.perform();
		
		//instantiating static innerclasses
		EventDemo.StaticInnerEventImpl se = new StaticInnerEventImpl();
		se.perform();
	}
}