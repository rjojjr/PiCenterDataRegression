package com.kirchnersolutions.picenter.DataRegression.entites;

public interface DBItem {

    public String getCSVHeader();

    public String toCSV();

    public void fromCSV(String csv, boolean withId);

    public String getType();

}
