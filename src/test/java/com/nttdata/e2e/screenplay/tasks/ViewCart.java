package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.pages.InventoryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ViewCart {

    public static Performable page() {
        return Task.where("{0} views the cart",
                Click.on(InventoryPage.CART_LINK));
    }
}
