package model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date entrada;
	private Date saida;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reserva() {

	}


	public Reserva(Integer numeroQuarto, Date entrada, Date saida) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}


	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}


	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}


	public Date getEntrada() {
		return entrada;
	}




	public Date getSaida() {
		return saida;
	}
	
	public long duracao() {
		long diferenca=saida.getTime()-entrada.getTime();
		//converter valor long para data
	return TimeUnit.DAYS.convert(diferenca, TimeUnit.MICROSECONDS);
		
	}
	
	public void atualizarDatas( Date entrada, Date saida) {
		Date now = new Date();
		
		if(entrada.before(now)||saida.before(now)) {
			throw new IllegalArgumentException("Insira datas futuras");
		}
		if(!saida.after(entrada)){
			throw new IllegalArgumentException("A data de entrada deve ser depois da saida");
			
		}
		this.entrada=entrada;
		this.saida=saida;
	
	}
@Override
public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append("Numero do quarto: "+getNumeroQuarto()+"\n");
	 sb.append("Data de Entrada: "+sdf.format(getEntrada()) +"\n");
	 sb.append("Data de Saida: "+sdf.format(getSaida()) +"\n");
	 
	 return sb.toString();
	
}





	

}
