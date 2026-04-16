package com.nttdata.e2e.screenplay.questions;

import com.nttdata.e2e.screenplay.pages.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CartItemCount implements Question<Integer> {

    @Override
    public Integer answeredBy(Actor actor) {
        return Integer.parseInt(Text.of(InventoryPage.CART_BADGE).answeredBy(actor));
    }

    public static Question<Integer> displayed() {
        return new CartItemCount();
    }
}
