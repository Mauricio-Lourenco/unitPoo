package LivrariaAssociacao;

public class Livro {
	private int idLivro;
	private String titulo;
	private String isbn;
	private int numeroPaginas;
	private Genero generoAtual;
	private Editora editora;
	
	
	public Livro(int idLivro, String titulo, Genero generoAtual, Editora editora) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.generoAtual = generoAtual;
		this.editora = editora;
	}
	public Genero getGeneroAtual() {
		return generoAtual;
	}
	public Editora getEditora() {
		return editora;
	}
	public Livro(String titulo) {
		this.titulo = titulo;
	}
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	
	

}
