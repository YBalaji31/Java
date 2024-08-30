class Parent{
	public static void run(){
	System.out.println("Parent run");
	}

	final void play(){
	System.out.println("Parent play");
	}
	
	private void go(){
		System.out.println("Parent go");
	}
	
}

class Child extends Parent{

	public static void run(){
	System.out.println("child run");
	}

	/*final void play(){
	System.out.println("child play");
	}*/
	
	private void go(){
		System.out.println("child go");
	}
}

public class task{
	
	public static void main(String[] args){
	
	Parent child=new Child();
	child.run();
	//child.play();
	//child.go();
	}
}