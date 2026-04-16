package com.nttdata.e2e.screenplay.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target CHECKOUT_BUTTON =
            Target.the("checkout button").locatedBy("#checkout");
}
