package br.com.casadocodigo.loja.models;

<<<<<<< HEAD

public class Produto {
	
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
>>>>>>> 24c894f8d36b4cb7674ec43582b4945986d63ed9
	private String titulo;
	private String descricao;
	private int paginas;

	public String getTitulo() {
		return titulo;
	}
<<<<<<< HEAD

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPaginas() {
		return paginas;
	}

=======
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPaginas() {
		return paginas;
	}
>>>>>>> 24c894f8d36b4cb7674ec43582b4945986d63ed9
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	}
<<<<<<< HEAD
	
	
=======
>>>>>>> 24c894f8d36b4cb7674ec43582b4945986d63ed9

}
