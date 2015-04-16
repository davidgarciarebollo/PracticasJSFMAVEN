package dtlazy.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;


import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;

import dtlazy.data.LazyAtletaDataModel;
import dtlazy.domain.Atleta;
import dtlazy.services.AtletaService;

@ManagedBean
@ViewScoped
public class DtLazyView implements Serializable {
	private static final long serialVersionUID = -2041698421853862778L;

	private LazyDataModel<Atleta> atletaLazyModel;
	private Atleta selectedAtleta;

	@ManagedProperty("#{atletaService}")
	private AtletaService atletaService;

	@PostConstruct
	public void init() {

		atletaLazyModel = new LazyAtletaDataModel(
				atletaService.findAllAtletas());
	}

	public Atleta getSelectedAtleta() {
		return selectedAtleta;
	}

	public void setAtletaService(AtletaService atletaService) {
		this.atletaService = atletaService;
	}

	public void setSelectedAtleta(Atleta selectedAtleta) {
		this.selectedAtleta = selectedAtleta;
	}

	public LazyDataModel<Atleta> getAtletaLazyModel() {
		return atletaLazyModel;
	}

	public AtletaService getAtletaService() {
		return atletaService;
	}


}