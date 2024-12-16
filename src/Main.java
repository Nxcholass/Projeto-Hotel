
public class Main {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.setValorEstadia(2000);
		hotel.setLucro(1000);
		
		Quartos quartos = new Quartos();
		quartos.setRefeicaoInclusa(true);
		quartos.setIdentificacao(12);
		quartos.setComodos(4);
		quartos.setSuite(true);
		quartos.setBanheiros(3);
		
		
		
		
		System.out.println("Valor da estadia: " + hotel.getValorEstadia());
		System.out.println("Refeição inclusa? " + quartos.isRefeicaoInclusa());
		System.out.println("Identificação do quarto: " + quartos.getIdentificacao());
		System.out.println("Comodos: " + quartos.getComodos());
		System.out.println("Suite: " + quartos.isSuite());
		System.out.println("Banheiros: " + quartos.getBanheiros());
		System.out.println("Lucro: " + hotel.getLucro());
		}
}
