package bruteforcee;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class brute {
	 public static void main(String[] args) {
                System.out.println("Bruteforce oluşturacak kelimeleri giriniz !!! :  ");
	        Scanner input = new Scanner(System.in);
	        String r = input.next();
	        String ç = "";
	        ArrayList<String> liste = new ArrayList<>();
	        int b = r.length();
	        for (int v = 0; v < 100; v++) {
	            for (int w = 0; w < 5; w++) {
	                Random rand = new Random();
	                int e = rand.nextInt(b);
	                String n = r.substring(e, e + 1);
	                System.out.print(n);
	                System.out.print("");
	                ç+=n;
	            }
	            liste.add(ç);
	            ç="";
	            System.out.println();
	        }
	        String dosyaYolu = "C:\\Users\\ömer faruk\\Desktop//testt.txt";

	        try {

	            //FileOutputStream fos = new FileOutputStream(dosyaYolu);

	            FileWriter fw = new FileWriter(dosyaYolu);
	            PrintWriter writer = new PrintWriter(fw);
	            for(int index=0;index<liste.size();index++){
	                writer.println(liste.get(index));
	            }
	            //String yazi = ç;
	            //fos.write(yazi.getBytes());
	            //fos.close();
	            writer.close();

	        } catch (FileNotFoundException ex) {
	            System.out.println("Dosya Bulunamadý Hatasý : " + ex);
	        } catch (IOException ioe) {
	            System.out.println("Giriþ Hatasý : " + ioe);
	        }
	    }
}
