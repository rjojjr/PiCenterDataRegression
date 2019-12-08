package com.kirchnersolutions.picenter.DataRegression.csv.parsers;


import com.kirchnersolutions.picenter.DataRegression.entites.DBItem;

import java.util.List;

public interface CSVParser {

    public String parseToCSV(List<DBItem> items);

    public List<DBItem> parseToList(String CSV);

    public List<DBItem> parseToListWithoutId(String CSV);

}
