package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.pages.SummaryPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CompletePurchase {

    public static Performable order() {
        return Task.where("{0} completes the purchase",
                Click.on(SummaryPage.FINISH_BUTTON));
    }
}
