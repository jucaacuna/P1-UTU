package UTU_Canelones;
import java.util.Scanner;

public class listar {
	public static void main(String args []){
		Scanner input = new Scanner( System.in);
	   	String a;
	   	Byte goles1;
	   	Byte goles2;
	   	System.out.println("Ingrese valor de a");
	   	a=input.next();
	   	System.out.println("Ingrese valor de goles1");
	   	goles1=input.nextByte();
	   	System.out.println("Ingrese valor de goles2");
	   	goles2=input.nextByte();

	   	System.out.println(" Nacional " + a + " Peñarol " + "con un resultado de "  + goles1 + " a " + goles2);

	 }

}
