package com.scorpio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/***
 * This class represents a category into a plc data tree
 */
@Slf4j
@Data
@NoArgsConstructor
public class Category {
    private long id;

    private String name;

    private List<Category> categories;

    private List<Measure> measures;

    /**
     *
     * @param searchingString - string to search into measure names
     */
    public void searchByName(String searchingString) {
        // TODO
    }

    /**
     *
     * @param dataType - dataType to search all measure which matching dataType
     */
    public void searchByDataType(DataType dataType) {
        // TODO
    }
}
