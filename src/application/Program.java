package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entites.Reserva;

public class Program {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Informe o numero do quarto");
			int numeroQuarto = sc.nextInt();
			System.out.println("Informe a data de entrada");
			Date entrada =sdf.parse(sc.next());
			
			System.out.println("Informe a data de saida");
			Date saida = sdf.parse(sc.next());
			
			Reserva reserva = new Reserva(numeroQuarto, entrada,saida);
			System.out.println();
			System.out.println("Informe as datas para atualizar a reserva");
			System.out.println("Entrada: ");
			entrada = sdf.parse(sc.next());
			System.out.println("Saida: ");
			saida = sdf.parse(sc.next());
			reserva.atualizarDatas(entrada,saida);
		System.out.println(reserva.toString()+reserva.duracao());	
			
		}catch(ParseException e) {
			System.out.println("Data invalida");
			
		}
		catch(IllegalArgumentException e) {
			
			System.out.println("Erro na reserva: "+e);
		}
		
		
	
		
		

	}

}
