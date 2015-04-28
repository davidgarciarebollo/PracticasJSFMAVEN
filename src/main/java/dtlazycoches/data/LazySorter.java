package dtlazycoches.data;

import java.util.Comparator;

import org.primefaces.model.SortOrder;

import dtlazycoches.domain.Coche;

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