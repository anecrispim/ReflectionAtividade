package classes;

public class LoadResource {
	
	public Object loadResource(String recurso) throws Exception {
		if (recurso.startsWith("/")) {
			String resource;
			recurso = recurso.toLowerCase();
			switch (recurso) {
				case "/produto":
					resource = "classes.produto.ProdutoController";
					break;
				case "/pessoa":
					resource = "classes.pessoa.Pessoa";
					break;
				default:
					 throw new Exception("Recurso não encontrado!");
			}
			LoadClass lc = new LoadClass();
			
			lc.setResource(resource);
			
			BuildObject bc = new BuildObject();
			
			return bc.buildObject(lc.load());
			
		} else {
			throw new Exception("O recurso informado está fora do padrão, tente informar um valor como o Ex.: /recurso");
		}
	}
}
