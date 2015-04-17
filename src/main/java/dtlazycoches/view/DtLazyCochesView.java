package dtlazycoches.view;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import dtlazycoches.domain.Coche;
import dtlazycoches.services.CocheService;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class DtLazyCochesView implements Serializable {
    private List<Coche> coches;

    private LazyDataModel<Coche> cocheLazyModel;

    private Coche selectedCoche;

    @ManagedProperty("#{cocheService}")
    private CocheService cocheService;

    private Coche coche;

    public static final int NUMBER = 3;

    @PostConstruct
    public void init() {

        coche = new Coche();

        setCocheLazyModel(new LazyDataModel<Coche>() {
            private List<Coche> coches;

            @Override
            public List<Coche> load(int first, int pageSize, String sortField,
                    SortOrder sortOrder, Map<String, Object> filters) {
                int tamano = NUMBER;

                try {
                    coches = cocheService.paginar(first, pageSize);
                } catch (IOException e) {
                    LOGGER.log("context", e);
                }
                this.setRowCount(tamano);
                return coches;

            }

        });
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Coche getSelectedCoche() {
        return selectedCoche;
    }

    public void setCocheService(CocheService cocheService) {
        this.cocheService = cocheService;
    }

    public void setSelectedCoche(Coche selectedCoche) {
        this.selectedCoche = selectedCoche;
    }

    public LazyDataModel<Coche> getCocheLazyModel() {
        return cocheLazyModel;
    }

    public CocheService getCocheService() {
        return cocheService;
    }

    public void setCocheLazyModel(LazyDataModel<Coche> cocheLazyModel) {
        this.cocheLazyModel = cocheLazyModel;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    public String insertCoche() {

        return "dtLazyCoches";
    }

}