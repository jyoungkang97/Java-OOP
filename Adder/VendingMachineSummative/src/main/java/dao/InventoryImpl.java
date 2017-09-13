/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Item;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class InventoryImpl implements Inventory {

    private final String TEXT_FILE = "Snacks.txt";
    private final String DELIMITER = "::";
    private final Map<String, Item> items = new HashMap<>();

    @Override
    public List<Item> getAllItems() throws ExceptionsDAO {
        loadFile();
        return new ArrayList<Item>(items.values());

    }

    private void loadFile() throws ExceptionsDAO {
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader(TEXT_FILE)));
        } catch (FileNotFoundException e) {
            throw new ExceptionsDAO("Could not load data into memory.", e);
        }
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Item currentItem = new Item(currentTokens[0]);

            currentItem.setItemName(currentTokens[1]);
            currentItem.setItemPrice(Double.parseDouble(currentTokens[2]));

            items.put(currentItem.getItemId(), currentItem);
        }
        sc.close();
    }

    private void writeRoster() throws ExceptionsDAO {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(TEXT_FILE));
        } catch (IOException e) {
            throw new ExceptionsDAO(
                    "Could not save item Data.");
        }

        List<Item> itemList = this.getAllItems();
        for (Item currentItem : itemList) {
            out.println(currentItem.getItemId() + DELIMITER
                    + currentItem.getItemName() + DELIMITER
                    + currentItem.getItemPrice());
            out.flush();
        }
        out.close();
    }

    

    @Override
    public Item getItemCost(String itemId) throws ExceptionsDAO {
         loadFile();
         return items.get(itemId);
         
    }

    @Override
    public double buy(String itemId, double money) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
