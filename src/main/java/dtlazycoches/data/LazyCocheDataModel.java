package dtlazycoches.data;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedProperty;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import dtlazycoches.domain.Coche;
import dtlazycoches.services.CocheService;
import dtlazycoches.view.LOGGER;

public class LazyCocheDataModel extends LazyDataModel<Coche> {
    @ManagedProperty("#{cocheService}")
    private CocheService cocheservice;
    private static final long serialVersionUID = -997887227816790728L;
    private List<Coche> datasource;

    public LazyCocheDataModel() {
        super();
    }

    public LazyCocheDataModel(List<Coche> coches) {
        this.datasource = coches;
    }

    @Override
    public Coche getRowData(String rowKey) {
        for (Coche coche : datasource) {
            if (coche.getCocheid().equals(rowKey)) {
                return coche;
            }
        }
        return null;
    }

    @Override
    public Object getRowKey(Coche coche) {
        return coche.getCocheid();
    }

    @Override
    public List<Coche> load(int first, int pageSize, String sortField,
            SortOrder sortOrder, Map<String, Object> filters) {

        try {
            datasource = cocheservice.paginar(first, pageSize);
        } catch (IOException e) {
            LOGGER.log();
        }
        return datasource;
    }
}