package com.nttdata.e2e.screenplay.questions;

import com.nttdata.e2e.screenplay.pages.ConfirmationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmationMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ConfirmationPage.CONFIRMATION_HEADER).answeredBy(actor);
    }

    public static Question<String> displayed() {
        return new ConfirmationMessage();
    }
}
