import java.util.Scanner;

public class Main {
	//global variable
	static String nama = "William";
	
	//declare scanner untuk terima input
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		
		// [datatype] [namaVariable]
		
//		//primitive variable
//		int num1 = 1; // angka desimal (32 bit)
//		short num2 = 2;// untuk angka 16bit
//		long num3 = 3; // untuk 64 bit
//		byte num4 = 127; // untuk mangka 8 bit 
//		float angka1 = 1.1234567f;
//		double angka2 = 1.1231313123;
//		boolean legal = false; // true/false
//		char a = 'a';
//		String b = "adsasd";
//		
//		//abstract / non-primitve variable
//		String nama = "Richard";
		
//		Integer number1 = 2;
//		
//		//typecasting
//		float numberFloat1 = (float) number1;
//		
//		Float angka = 12.5f;
//		System.out.println(angka);
//	
//		
//		int converted = (int) angka;
//		System.out.println(converted);
//		System.out.printf("Umur ku %f \nnama ku %s\n", angka, this.nama);
		
		//global & local variable
//		method2();
		
//		System.out.print("Masukkan nama kamu: ");
//		String nama = scan.nextLine();
//		System.out.print("Masukkan umur kamu: ");
//		int umur = scan.nextInt();
//		scan.nextLine();
//		System.out.print("Masukkan nomor rumah kamu: ");
//		String nomor = scan.nextLine();
//		System.out.println("Nama kamu adalah " + nama);
//		System.out.println("Umur kamu adalah " + umur + " tahun");
//		System.out.println("Nomor rumah kamu adalah " + nomor);
		
		// operator matematika
//		float a = 10;
//		float b = 21;
		
//		//addition
//		System.out.println(a + b);
//		
//		//substraction
//		System.out.println(a - b);
//		
//		//Miltiplication
//		System.out.println(10*21);
//		
//		//division
//		System.out.println("hasil pembagian: " + a/b);
//		
//		//modulo
//		System.out.println(a%b);
//		
//		//increment
//		System.out.println("Increment: " + ++a);
//		
//		//decrement
//		System.out.println("Decrement: " + --b);
		
		//relational operator
//		int a = 10;
//		int b = 21;
//		
//		//equation
//		System.out.println(a == b);
//		
//		b = 10;
//		System.out.println(a == b);
//		
//		//not equal
//		System.out.println(a!=b);
//		
//		b=21;
//		System.out.println(a!=b);
//		
//		System.out.println(a<b);
//		
//		a = 21;
//		boolean hasil = a>b;
//		System.out.println("hasil: " + hasil);
//		
//		System.out.println(a<=b);
//		System.out.println(a>=b);
		
		//bitwise operator
		// 1000 & 1100
		// 8421
//		int a = 8;
//		int b = 12;
//		
//		//and
//		System.out.println(a&b);
//		//or
//		System.out.println(a|b);
//		//XOR
//		System.out.println(a^b);
//		//not
//		System.out.println(~a);
//		//left shift
//		System.out.println(a << 2);
//		//right shift
//		System.out.println(a >>2);
		
		//logical operator
//		boolean a = true;
//		boolean b = false;
//		
//		System.out.println(a && b);
//		System.out.println(a || b);
//		System.out.println(!a);
		
		//selection
//		System.out.println("Masukkan umur kamu:");
//		int umur = scan.nextInt();
//		scan.nextLine();
		
//		if(umur > 18) {
//			System.out.println("kamu legal");
//		}else if (umur > 10) {
//			System.out.println("Kamu pelajar SD");
//		}else {
//			System.out.println("kamu tidak legal");
//		}
		
		
//		String bolehBawaMotor = umur > 21 ? "Kamu boleh bawa motor" : "Kamu tidak boleh bawa motor";
//		
//		System.out.println(bolehBawaMotor);
		
		//switch case operation
		
		System.out.println("Kamu kelas apa?");

		String kelas = scan.nextLine();
		
		switch(kelas) {
			case "A": 
				System.out.println("Pelajaran matematika");
			break;
			case "B": 
				System.out.println("Pelajaran b.indo");
			break;
			case "C": 
				System.out.println("Pelajaran b.ing");
			break;
			default:
				System.out.println("kamu tidak ada kelas");
		}
		//looping
	}
	
	public void method2() {
		System.out.println(nama);
	}
	
	public static void main(String[] args) {
		new Main();
//		new Sapi();
	}
}
