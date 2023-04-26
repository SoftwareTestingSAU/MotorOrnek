package pkt;

public class Program {

	public static void main(String[] args) {
		Tasit tasit = new Tasit(60);
		tasit.marsaBas();
		tasit.hizAyarla(140);
		tasit.sur(3);
		System.out.println("Kullanilan Tasit:");
		System.out.println(tasit);
        System.out.println("3 saatte alinan yol "+tasit.getYol()+" kilometredir.");
        System.out.println("Kalan yakit ile "+tasit.menzil()+" km yol gidilebilir.\n");
        
        Tasit tasit2 = new Tasit(60);
        if(tasit.equals(tasit2)) System.out.println("Tasitlar ayni");
        else System.out.println("Tasitlar farkli");
        
        System.out.println("\nFarkli bir karsilastirma");
        Tasit tasit3 = tasit;
        if(tasit.equals(tasit3)) System.out.println("Tasitlar ayni");
        else System.out.println("Tasitlar farkli");
	}

}
