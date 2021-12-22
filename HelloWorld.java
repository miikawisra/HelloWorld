import java .io.*;

class HelloWorld{
    public static void main(String[] args){
		int luku;
		int toinen_luku;
		int lukujen_summa;
    	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try{
			System.out.print("Anna ensimmäinen luku: ");
			luku = Integer.parseInt(in.readLine());
		
		
		
			System.out.print("Anna toinen luku: ");
			toinen_luku = Integer.parseInt(in.readLine());

			lukujen_summa = luku + toinen_luku;

			System.out.println("Antamiesi lukujen summa on "+ lukujen_summa);
		
		
		} catch(Exception e) {
			System.out.println("Antamasi syöte oli virheellinen...");
		}
		
		


	
	}	
		
}

/*Anna ensimmäinen luku:432432
Anna toinen luku:42
Antamiesi lukujen summa on 432474

import java.io.*;

public class LuvunNelio {
	public static void main(String[] args) {
		int luku;
		int luvun_nelio;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Syötä kokonaisluku: ");
			luku = Integer.parseInt(in.readLine());
   
			luvun_nelio = luku * luku;
			System.out.println("Antamasi luvun neliö: " + luvun_nelio);

		} catch(Exception e) {
			System.out.println("Antamasi syöte oli virheellinen...");
		}
	}
}*/