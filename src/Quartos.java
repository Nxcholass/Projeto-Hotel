
public class Quartos extends Hotel {
	private int identificacao;
	private int banheiros;
	private int comodos;
	private boolean suite;
	private boolean refeicaoInclusa;
	
	public int getComodos() {
		return comodos;
	}
	public void setComodos(int comodos) {
		this.comodos = comodos;
	}
	public boolean isRefeicaoInclusa() {
		return refeicaoInclusa;
	}
	public void setRefeicaoInclusa(boolean refeicaoInclusa) {
		this.refeicaoInclusa = refeicaoInclusa;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public int getBanheiros() {
		return banheiros;
	}
	public void setBanheiros(int banheiros) {
		this.banheiros = banheiros;
	}
	public boolean isSuite() {
		return suite;
	}
	public void setSuite(boolean suite) {
		this.suite = suite;
	}
	
}
