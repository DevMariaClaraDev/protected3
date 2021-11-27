package numero3;

public class Mouse {
	
	private String marca;
	private String tipo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.length() > 0)
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if (tipo.length() > 0)
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mouse [marca=");
		builder.append(marca);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
