public class StrukturKontrolIf {
	public static void main (String[] args){
		//if (saja)	
		boolean hujan = true;
		if(hujan == true){	
			System.out.println("Bawa payung");
		}
			System.out.println();
		
			
			//if-else
			int nilai = 90;
			if (nilai > 75){
				System.out.println("Selamat, Anda LULUS!");
			}
			else{
				System.out.println("Mohon Maaf, Anda TIDAK LULUS");
			}
				System.out.println();
		
			
			//if-else-if
				boolean Hujan = false;
				boolean adapayung = true;
				if(Hujan == true && adapayung == true){	
					System.out.println("Boleh keluar rumah");
				}
				else if (Hujan == true && adapayung == false){
					System.out.println("Tidak boleh keluar rumah");
				}
				else if (Hujan == false && adapayung == true){
					System.out.println("Boleh keluar rumah tapi payungnya tidak terpakai");
				}
				else{
					System.out.println("Boleh keluar rumah meski payung tidak ada");
				}
					System.out.println();
					System.out.println();
	}	
}