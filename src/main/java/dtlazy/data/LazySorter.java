package dtlazy.data;

import java.util.Comparator;

import org.primefaces.model.SortOrder;

import dtlazy.domain.Atleta;

public class LazySorter implements Comparator<Atleta> {
	private String sortField;
	private SortOrder sortOrder;

	public LazySorter(String sortField, SortOrder sortOrder) {
		super();
		this.sortField = sortField;
		this.sortOrder = sortOrder;
	}

	@Override
	public int compare(Atleta atleta1, Atleta atleta2) {
		try {
			Object value1 = Atleta.class.getField(this.sortField).get(atleta1);
			Object value2 = Atleta.class.getField(this.sortField).get(atleta2);

			int value = ((Comparable) value1).compareTo(value2);

			return SortOrder.ASCENDING.equals(sortOrder) ? value : (-1 * value);
		} catch(Exception e) {
			throw new RuntimeException("error");
			
		}
	}
}