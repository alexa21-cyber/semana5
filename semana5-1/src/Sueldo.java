import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
	double sue,nsue;
	int cate;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Ingrese la categoria");
	  cate=scan.nextInt();
	  System.out.println("Ingrese sueldo");
	  sue=scan.nextDouble();
	  switch (cate) {
	case 1:nsue=sue*1.15;
	   System.out.println("categoria: "+cate);
	   System.out.println("sueldo: "+nsue);break;
	case 2:nsue=sue*1.10; 
	   System.out.println("categoria: "+cate);
	   System.out.println("sueldo: "+nsue);break;
	case 3:nsue=sue*1.08; 
	   System.out.println("categoria: "+cate);
	   System.out.println("sueldo: "+nsue);break;
	case 4:nsue=sue*1.07; 
	   System.out.println("categoria: "+cate);
	   System.out.println("sueldo: "+nsue);break;
	  
	}
	 
	   
	}

}
