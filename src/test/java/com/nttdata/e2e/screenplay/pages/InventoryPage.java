package com.nttdata.e2e.screenplay.pages;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {

    public static final Target PRODUCT_NAMES =
            Target.the("product names").locatedBy(".inventory_item_name");

    public static final Target ADD_TO_CART_BUTTON =
            Target.the("add to cart button for '{0}'")
                    .locatedBy("//div[contains(@class,'inventory_item')]"
                            + "[.//div[contains(@class,'inventory_item_name') and normalize-space(text())='{0}']]"
                            + "//button[contains(@class,'btn_inventory')]");

    public static final Target CART_LINK =
            Target.the("shopping cart link").locatedBy("#shopping_cart_container .shopping_cart_link");
}
