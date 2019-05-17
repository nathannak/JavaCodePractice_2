public class Main {

    public static void main(String[] args) {
        A obj = new B();
        obj.provoke_me();
        System.out.println(obj.variable1);
        System.out.println();

        //casting doesn't work -> A object can't be cast to B: will compile but class cast exception
        //A obj_0 = new A();
        //obj_0.some_func(obj_0);
        //
        
        //casting doesn't work -> A object can't be cast to B: will compile but class cast exception
        A obj_1 = new B();
        obj_1.some_func(new A());
        //
        
        //casting works due to polymorphism
        //A obj_2 = new B();
        //A obj__ = new A();
        //obj__.some_func(obj_2); //obj_2 can be casted to B in runtime
        //

    }

}

class A {
	
	void provoke_me() {
		 System.out.println("in mom");
	}
	
	int variable1 = 1000000; 
	
	void some_func (A a) {
		
		((B)a).just_in_B();
	
	}
	
}

class B extends A {
	
	void provoke_me() {
		
		 System.out.println("in child");
	
	}
	
	void just_in_B () {

		System.out.println("printng from \"just in B\"");
		
	}
	
	int variabe1 = 0;
}