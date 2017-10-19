
import java.util.Scanner;
import java.util.*;




class Insects extends Oviparous 
{
	void Canmov(int ...a)
	{
		System.out.print("This is inside the Insects class: .");
		System.out.println("Insects can fly in the sky: ");
	}
}

    
public class Amit {

	public static void main(String[] args) {
		Animal ob=new Birds();
		ob.Canmov(6,10);
		
		System.out.println(" ");
		
		ob=new Insects();
		ob.Canmov(1,2,3,4,5);
		System.out.println(" ");
		
		ob=new Mammal();
		ob.Canmov(1);
		
		System.out.println(" ");
		
		ob=new Land();
		ob.Canmov(0,0,0);
		
		System.out.println(" ");
		
		ob=new Water();
		ob.Canmov(9,9,9,9,9,9,9,9,9);
		
		System.out.println(" ");
		
		
		do_something(ob);
	}
	
	public static void do_something(Animal T)
	{
		T.Canmov(6,6,6,6,6);
		System.out.println("");
		T. tin();
	}

}
