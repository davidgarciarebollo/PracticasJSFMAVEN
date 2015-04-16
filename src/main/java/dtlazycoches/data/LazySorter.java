package dtlazycoches.data;

import java.util.Comparator;

import org.primefaces.model.SortOrder;

import dtlazycoches.domain.Coche;

public class LazySorter implements Comparator<Coche> {
	private String sortField;
	private SortOrder sortOrder;

	public LazySorter(String sortField, SortOrder sortOrder) {
		super();
		this.sortField = sortField;
		this.sortOrder = sortOrder;
	}

	@Override
	public int compare(Coche coche1, Coche coche2) {
		try {
			Object value1 = Coche.class.getField(this.sortField).get(coche1);
			Object value2 = Coche.class.getField(this.sortField).get(coche2);

			int value = ((Comparable) value1).compareTo(value2);

			return SortOrder.ASCENDING.equals(sortOrder) ? value : (-1 * value);
		} catch (Exception e) {
			throw new RuntimeException("context", e);
		}
	}
}