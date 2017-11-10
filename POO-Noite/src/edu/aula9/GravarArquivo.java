package edu.aula9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GravarArquivo {

	public static void main(String[] args) throws IOException {
		escrever();
		ler();
	}
	
	static File f = new File("C:/Paulo/Teste3.txt");
	
	public static void escrever() throws IOException {
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bfw = new BufferedWriter(fw);
		Scanner input = new Scanner(System.in);
		String texto = "Paulo";
		while (!texto.equals("sair")) {
			texto = input.nextLine();
			bfw.append(texto);
		}
		bfw.flush();
		bfw.close();
		fw.close();
	}

	public static void ler() throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		String texto = "";
		while (bfr.ready()) {
			texto += bfr.readLine();
		}
		System.out.println(texto);
		bfr.close();
		fr.close();
	}
}
