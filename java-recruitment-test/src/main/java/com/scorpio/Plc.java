package com.scorpio;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Plc {

    /**
     * main function of the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Plc plc = new Plc();
        Category category = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");
        category.searchByName("Piece-counter");
        category.searchByDataType(DataType.BOOLEAN);
    }

    /**
     * Load the data tree of the Plc from a json file
     *
     * @param filePath - the tree file path
     * @return the root category of the tree
     */
    Category loadPlcTree(String filePath) {
       // TODO
        return null;
    }
}
