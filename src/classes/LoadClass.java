package classes;

public class LoadClass {
	private String resource;
	
	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public Class<?> load() {
		try {
			Class<?> classT = Class.forName(resource);
			return classT;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
