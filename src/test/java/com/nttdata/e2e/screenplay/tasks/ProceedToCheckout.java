package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.pages.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ProceedToCheckout implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CartPage.CHECKOUT_BUTTON));
    }

    public static ProceedToCheckout now() {
        return new ProceedToCheckout();
    }
}
