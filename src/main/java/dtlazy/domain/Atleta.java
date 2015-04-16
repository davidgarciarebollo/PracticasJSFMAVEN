package dtlazy.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Atleta implements Serializable {
	private Integer atlId;
	private String name;
	private Date fnac;
	private String nacionalidad;

	public Integer getAtlId() {
		return atlId;
	}

	public void setAtlId(Integer atlId) {
		this.atlId = atlId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFnac() {
		return fnac;
	}

	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
}
