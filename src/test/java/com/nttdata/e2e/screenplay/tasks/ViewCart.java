package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.pages.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ViewCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(InventoryPage.CART_LINK));
    }

    public static ViewCart page() {
        return new ViewCart();
    }
}
