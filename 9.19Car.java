import java.util.Scanner;
import java.io.*; 
public class Car{
	public String model;  
	public int tank;  
    	public int oilConsumption; 
	public void gas(){
		System.out.println();
	} 
	public void run(){
		System.out.println();
	}

	public static void main(String[] args){
	int n;
	System.out.println("Please input the number of car:");
	Scanner cin=new Scanner(System.in);
	int a = cin.nextInt();
	n=a;
	//Scanner cin=new Scanner(System.in);
 	Car[] car=new Car[n];
	for(int i=0;i<car.length;i++)  
		car[i]=new Car(); 
	for(int m=0;m<car.length;m++)
	{
		System.out.println("Please input the model of car:");
		String l = cin.next();
		car[m].model=l;
		System.out.println("Please input the tank of car:");
		int b = cin.nextInt();
		car[m].tank=b;
		System.out.println("Please input the oilConsumption of car:");
		int c = cin.nextInt();
		car[m].oilConsumption=c;
	}
	System.out.println("The nature of car");
	for(int x=0;x<car.length;x++)
	{
		System.out.println("No."+(x+1)+"car:");
		System.out.println(car[x].model);
		System.out.println(car[x].tank);
		System.out.println(car[x].oilConsumption);
		car[x].gas();
		car[x].run();
	}
       }  
}