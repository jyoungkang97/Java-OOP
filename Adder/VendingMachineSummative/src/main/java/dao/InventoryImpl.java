/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Service.ExceptionsDAO;
import Service.InsufficientQuantity;
import dto.Item;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
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

    public void updateItem(Item item) throws ExceptionsDAO {
        writeLibrary();
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
            currentItem.setItemPrice(BigDecimal(currentTokens[2]));
            currentItem.setQuantity(Integer.parseInt(currentTokens[3]));

            items.put(currentItem.getItemId(), currentItem);
        }
        sc.close();
    }

    private void writeLibrary() throws ExceptionsDAO {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(TEXT_FILE));
        } catch (IOException e) {
            throw new ExceptionsDAO("Could not save item data.", e);
        }

        List<Item> itemList = this.getAllItems();
        for (Item currentItem : itemList) {
            out.println(currentItem.getItemId() + DELIMITER
                    + currentItem.getItemName() + DELIMITER
                    + currentItem.getItemPrice() + DELIMITER
                    + currentItem.getQuantity());
            out.flush();
        }
        out.close();
    }

    @Override
    public Item getItem(String itemId) throws ExceptionsDAO, InsufficientQuantity {
        loadFile();
        Item currentItem = items.get(itemId);
        int checkQuantity = currentItem.getQuantity();
        if (checkQuantity > 0) {
        return items.get(itemId);
        }else {
            throw new InsufficientQuantity("Error: Not enough items in stock, please make another selection");
        }

    }

    @Override
    public void update(Item item) throws ExceptionsDAO {
        writeLibrary();
    }

    @Override
    public BigDecimal BigDecimal(String currentToken) throws ExceptionsDAO {
        BigDecimal bd = new BigDecimal(currentToken);
        return bd;
    }

}
