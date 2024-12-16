
public class valorEstadia extends Hotel {
	private double valorQuarto;

	
	public double getValorQuarto() {
		return valorQuarto;
	}

	public void setValorQuarto(double valorQuarto) {
		this.valorQuarto = valorQuarto;
	}

	@Override
	public double atualizarValor(double imposto) {
		
		return super.atualizarValor(imposto * 0.5);
	}
	
	
}
