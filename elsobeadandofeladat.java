package elsobeadando;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class elsobeadandofeladat {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new FileReader("input\\inputtext.txt"));
		FileWriter fw = new FileWriter("output\\outputtext.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		String sor =br.readLine();
		
		char oldValue = 'a';
		String newValue = Character.toString(oldValue);
		
		
		 while(sor!=null) {
			 for (char kis = 'a'; kis < 'z'; kis++) {
		            System.out.print(kis ++);
					pw.println(kis++);
					sor = br.readLine(); 
			 }
				
				
		pw.flush();
		pw.close();
		br.close();
		 }}}
	


