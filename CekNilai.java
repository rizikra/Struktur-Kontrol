//Latihan Struktur Kontrol
public class CekNilai {
	public static void main (String[] args){
		
	try {int input = Integer.parseInt(args[0]);
		int nilai = input;
		
		if (nilai >= 85 &&  nilai <= 100){
			System.out.println("A");
		}
		else if (nilai >= 75 && nilai <= 84){
			System.out.println("B");
		}
		else if (nilai >= 65 && nilai <= 74){ 
			System.out.println("C");
		}
		else if (nilai >= 45 && nilai <= 64){
			System.out.println("D");
		}
		else if (nilai <= 44){
			System.out.println("E");
		}
		else{
			System.out.println("Nilai Salah, Silakan Cek Kembali !");	
		}
	}	
		catch (Exception e){
			System.out.println(e.getMessage());	
			System.out.println("Nilai Tidak Valid, Silakan Cek Kembali !");	
		}
	}
}