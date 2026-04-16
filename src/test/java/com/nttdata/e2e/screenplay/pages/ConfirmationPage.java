package com.nttdata.e2e.screenplay.pages;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmationPage {

    public static final Target CONFIRMATION_HEADER =
            Target.the("confirmation header").locatedBy("#checkout_complete_container h2.complete-header");
}
