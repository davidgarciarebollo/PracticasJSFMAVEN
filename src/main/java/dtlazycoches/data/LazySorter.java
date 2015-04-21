package dtlazycoches.data;

import java.util.Comparator;

import org.primefaces.model.SortOrder;

import dtlazycoches.domain.Coche;
import dtlazycoches.view.LOGGER;

public class LazySorter implements Comparator<Coche> {
    private String sortField;
    private SortOrder sortOrder;

    public LazySorter(String sortField, SortOrder sortOrder) {
        super();
        this.setSortField(sortField);
        this.sortOrder = sortOrder;
    }

    @Override
    public int compare(Coche coche1, Coche coche2) {
        try {
            Object value1 = Coche.class.getField(this.getSortField()).get(
                    coche1);
            Object value2 = Coche.class.getField(this.getSortField()).get(
                    coche2);

            @SuppressWarnings("unchecked")
            int value = ((Comparable<Object>) value1).compareTo(value2);

            return SortOrder.ASCENDING.equals(sortOrder) ? value : (-1 * value);
        } catch (Exception e) {
            LOGGER.log();
        }
        return 0;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }
}