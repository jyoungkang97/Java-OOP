/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author jyoun
 */
public class Controller {

    private View view;
    private Service service;

    public VendingController(VendingService service, VendingView view) {
        this.service = service;
        this.view = view;
    }

    public void run() throws VendingPersistenceException {
        boolean keepGoing = true;
        int menuSelection;
        while (keepGoing) {
            List<VendingProduct> currentProducts = service.getProducts();
            menuSelection = getMenuSelection(currentProducts);

            if (menuSelection == currentProducts.size() + 1) {
                keepGoing = false;
            } else {
                VendingProduct vendingProduct = null;

                try {
                    vendingProduct = service.getAvailableProduct(String.valueOf(menuSelection));
                } catch (VendingNoItemInventoryException e) {
                    view.displayInventoryErrorMessage();
                    continue;
                }

                selectProduct(vendingProduct);
                BigDecimal money = view.askForMoney();

                try {
                    String change = service.purchase(vendingProduct, money);
                    printChange(change);
                } catch (VendingInsufficientFundsException e) {
                    view.displayFundsErrorMessage();
                } catch (VendingNoItemInventoryException e) {
                    view.displayErrorMessage();
                }
            }
        }
        exitMessage();
    }

    private int getMenuSelection(List<VendingProduct> productList) {
        return view.printMenuAndGetSelection(productList);
    }

    private void selectProduct(VendingProduct vendingProduct) throws VendingPersistenceException {
        view.displayProductBanner();
        view.displayProduct(vendingProduct);
    }

    private boolean checkIfInStock(VendingProduct vendingProduct) throws VendingPersistenceException {
        return Integer.valueOf(vendingProduct.getProductInventory()) > 0;
    }

    private void printChange(String change) {
        view.displayChangeBanner();
        view.displayChange(change);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
}
