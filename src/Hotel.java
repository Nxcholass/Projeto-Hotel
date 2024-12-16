import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Hotel {
	private int quartos;
	private String funcionarios;
	private double valorEstadia;
	private String hospedes;
	private double lucro;
	
	
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public int getQuartos() {
		return quartos;
	}
	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}
	public String getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(String funcionarios) {
		this.funcionarios = funcionarios;
	}
	public double getValorEstadia() {
		return valorEstadia;
	}
	public void setValorEstadia(double valorEstadia) {
		this.valorEstadia = valorEstadia;
	}
	public String getHospedes() {
		return hospedes;
	}
	public void setHospedes(String hospedes) {
		this.hospedes = hospedes;
	}
	
	public void inserirDados() {
		this.quartos = Integer.parseInt(JOptionPane.showInputDialog("Quartos"));
		this.funcionarios = JOptionPane.showInputDialog("Funcionarios");
		this.valorEstadia = Double.parseDouble(JOptionPane.showInputDialog("Valor estadia"));
		this.hospedes = JOptionPane.showInputDialog("Hospedes");
		this.lucro = Double.parseDouble(JOptionPane.showInputDialog("Lucro"));
	}
	
	public double atualizarValor(double imposto) {
		this.lucro += this.lucro * imposto / 5;
		return this.lucro;
	}
	
	public void mostrar() {
		String mensagem = "Objeto da classe Hotel\n";
		
		mensagem += "\nQuartos: " + this.quartos;
		mensagem += "\nFuncionarios: " + this.funcionarios;
		mensagem += "\nValor estadia: " + this.valorEstadia;
		mensagem += "\nHospedes: " + this.hospedes;
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		mensagem += "\nLucro: " + formatar.format(this.lucro);
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
