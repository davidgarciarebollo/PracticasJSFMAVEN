package dtlazy.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import dtlazy.domain.Atleta;

public class LazyAtletaDataModel extends LazyDataModel<Atleta> {

	private static final long serialVersionUID = -997887227816790728L;

	private List<Atleta> datasource;

	public LazyAtletaDataModel(List<Atleta> atletas) {
		this.datasource = atletas;
	}

	@Override
	public Atleta getRowData(String rowKey) {
		for (Atleta atleta : datasource) {
			if (atleta.getAtlId().equals(rowKey)){
				return atleta;
			}
		}
		return null;
	}

	@Override
	public Object getRowKey(Atleta atleta) {
		return atleta.getAtlId();
	}

	@Override
	public List<Atleta> load(int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Object> filters) {
		List<Atleta> data = new ArrayList<Atleta>();

		for (Atleta atleta : datasource) {
			boolean match = true;
			if (filters != null) {
				for (Iterator<String> it = filters.keySet().iterator(); it
						.hasNext();) {
					try {
						String filterProperty = it.next();
						Object filterValue = filters.get(filterProperty);
						String fieldValue = String.valueOf(atleta.getClass()
								.getField(filterProperty).get(atleta));

						if (filterValue == null
								|| fieldValue
										.startsWith(filterValue.toString())) {
							match = true;
						} else {
							match = false;
							break;
						}
					} catch (Exception e) {
						match = false;
					
					}
				}
			}

			if (match) {
				data.add(atleta);
			}
		}

		if (sortField != null) {
			Collections.sort(data, new LazySorter(sortField, sortOrder));

		}

		int dataSize = data.size();
		this.setRowCount(dataSize);

		if (dataSize > pageSize) {
			try {
				return data.subList(first, first + pageSize);
			} catch (IndexOutOfBoundsException e) {
				return data.subList(first, first + (dataSize % pageSize));
			}
		} else {
			return data;
		}
	}
}
