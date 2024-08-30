import java.util.*;

class q1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int wheels=sc.nextInt();
int vehicle=sc.nextInt();

int fw=(wheels-(2*vehicle))/2;
int tw=vehicle-fw;
System.out.println("The four wheelers is "+fw+" and two wheeler is "+tw);

}
}