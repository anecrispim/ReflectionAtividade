package classes.produto;

public class ProdutoController {
	private String descricao;
	private int id;

	@SuppressWarnings("unused")
	private ProdutoController(String descricao) {
		setDescricao(descricao);
	}
	
	public ProdutoController() {
		
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoController [descricao=");
		builder.append(descricao);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
}
