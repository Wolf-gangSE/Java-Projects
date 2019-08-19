
public class Pessoa {
	private String nome;
	private int idade;
	private float altura;
	private String profissao;
	private String genero;
	private String cor;
	
	public static void main(String[] args) {
		Pessoa h = new Pessoa();
		h.nome = "Homer";
		h.idade = 40;
		h.altura = 1.60f;
		h.profissao = "Operário";
		h.genero = "masculino";
		h.cor = "amarelo";
		
		h.informacoes();
		h.comer();
		h.espacamento();
		
		
		Pessoa r = new Pessoa();
		r.nome = "Rocky Balboa";
		r.idade = 50;
		r.altura = 1.80f;
		r.profissao = "Boxeador";
		r.genero = "masculino";
		r.cor = "branco";
		
		r.informacoes();
		r.socar();
		r.espacamento();
		
		
		Pessoa l = new Pessoa();
		l.nome = "Lara Croft";
		l.idade = 30;
		l.altura = 1.70f;
		l.profissao = "Arqueóloga";
		l.genero = "feminino";
		l.cor = "branca";
		
		l.informacoes();
		l.atirar();
		l.espacamento();
		
		
		
		Pessoa v = new Pessoa();
		v.nome = "Viúva Negra";
		v.idade = 34;
		v.altura = 1.60f;
		v.profissao = "Agente";
		v.genero = "feminino";
		v.cor = "branca";
		
		v.informacoes();
		v.lutar();
		v.espacamento();
		
		
		
		Pessoa p = new Pessoa();
		p.nome = "Arthur";
		p.idade = 7;
		p.altura = 1.20f;
		p.profissao = "Professor";
		p.genero = "masculino";
		p.cor = "branco";
		
		p.informacoes();
		p.lecionar();
		p.espacamento();
		
		
		Pessoa a = new Pessoa();
		a.nome = "Leonardo";
		a.idade = 9;
		a.altura = 1.35f;
		a.profissao = "Aluno";
		a.genero = "masculino";
		a.cor = "branco";
		
		a.informacoes();
		a.desenhar();
		a.espacamento();

	}
	
	private void socar() {
		System.out.println("Neste momento, o " + nome + " está socando...");
	}
	
	private void comer() {
		System.out.println("Neste momento, o " + nome + " está comendo rosquinhas...");
	}
	
	private void lutar() {
		System.out.println("Neste momento, a " + nome + " está lutando...");
	}
	
	private void atirar() {
		System.out.println("Neste momento, a " + nome + " está atirando...");
	}
	
	private void lecionar() {
		System.out.println("Nesse momento, o " + nome + " está lecionando...");
	}
	
	private void desenhar() {
		System.out.println("Nesse momento, o " + nome + " está desenhando...");
	}
	
	private void informacoes() {
		System.out.println("Este(a) é o(a) " + nome + "!");
		System.out.println("É " + cor + ", tem " + idade + " anos e possui " + altura + "m de altura.");
		System.out.println("Atua como " + profissao + " e se identifica com o gênero " + genero + ".");
		
	}
	
	private void espacamento() {
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
