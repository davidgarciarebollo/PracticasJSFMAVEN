package dtlazycoches.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Coche implements Serializable {
	private Integer cocheid;
	private  String modelo;
	
	private  Date ffab;
	private String marca;
	
	public Integer getCocheid() {
		return cocheid;
	}
	public void setCocheid(Integer cocheid) {
		this.cocheid = cocheid;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getFfab() {
		return ffab;
	}
	public void setFfab(Date ffab) {
		this.ffab = ffab;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
