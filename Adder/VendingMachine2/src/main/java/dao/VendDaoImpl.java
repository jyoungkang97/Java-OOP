/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Item;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jyoun
 */
public class VendDaoImpl implements VendDao{

    public static final String INVENTORY_FILE = "inventory.txt";
    public static final String DELIMITER = "::";
    private Map<String, Item> productMap = new HashMap<>();

    public VendDaoImpl() throws VendPersistence {
        loadInventory();
    }

    @Override
    public List<VendingProduct> getAllProducts() {
        List<VendingProduct> prodList = new ArrayList<>();
        for (Map.Entry<String, VendingProduct> entry : productMap.entrySet()) {
            prodList.add(entry.getValue());
        }
        return prodList;
    }

    public VendingProduct getProduct(String productNumber) {
        return productMap.get(productNumber);
    }

    @Override
    public void removeProduct(String productNumber) throws VendingPersistenceException {
        VendingProduct vendingProduct = productMap.get(productNumber);
        int inventory = Integer.valueOf(vendingProduct.getProductInventory());
        inventory = inventory - 1;
        vendingProduct.setProductInventory(Integer.parseInt(String.valueOf(inventory)));
        this.writeInventory();
    }

    private void loadInventory() throws VendingPersistenceException {
        Scanner scanner;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(INVENTORY_FILE)));
        } catch (FileNotFoundException e) {
            throw new VendingPersistenceException("Could not load inventory data into memory.", e);
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            VendingProduct currentProduct = new VendingProduct(currentTokens[0], currentTokens[1], currentTokens[2], Integer.parseInt(currentTokens[3]));

            this.productMap.put(currentProduct.getProductNumber(), currentProduct);
        }
        scanner.close();
    }

    private void writeInventory() throws VendingPersistenceException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(INVENTORY_FILE));
        } catch (IOException e) {
            throw new VendingPersistenceException("Could not save inventory data.", e);
        }

        List<VendingProduct> productList = this.getAllProducts();
        for (VendingProduct currentProduct : productList) {
            out.println(currentProduct.getProductNumber() + DELIMITER + currentProduct.getProductName() + DELIMITER + currentProduct.getProductPrice() + DELIMITER + currentProduct.getProductInventory());
            out.flush();
        }
        out.close();
    }
}
}
