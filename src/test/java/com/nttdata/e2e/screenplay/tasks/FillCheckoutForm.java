package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.model.BuyerInfo;
import com.nttdata.e2e.screenplay.pages.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillCheckoutForm implements Task {

    private final BuyerInfo buyerInfo;

    private FillCheckoutForm(BuyerInfo buyerInfo) {
        this.buyerInfo = buyerInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(buyerInfo.getFirstName()).into(CheckoutPage.FIRST_NAME_FIELD),
                Enter.theValue(buyerInfo.getLastName()).into(CheckoutPage.LAST_NAME_FIELD),
                Enter.theValue(buyerInfo.getZipCode()).into(CheckoutPage.ZIP_CODE_FIELD),
                Click.on(CheckoutPage.CONTINUE_BUTTON)
        );
    }

    public static FillCheckoutForm with(BuyerInfo buyerInfo) {
        return new FillCheckoutForm(buyerInfo);
    }
}
