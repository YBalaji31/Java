import java.util.Calendar;



public class Main extends Thread
{
    public void run(){
        System.out.println("hi");
    }
	public static void main(String[] args) {
		Main m1=new Main();
		m1.start();
		m1.stop();
		//m1.start();
	}
}