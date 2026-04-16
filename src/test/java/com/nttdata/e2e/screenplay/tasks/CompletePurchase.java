package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.pages.SummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CompletePurchase implements Task {

    private CompletePurchase() {}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SummaryPage.FINISH_BUTTON));
    }

    public static CompletePurchase order() {
        return new CompletePurchase();
    }
}
