package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.pages.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddProductToCart implements Task {

    private final int quantity;

    private AddProductToCart(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Collection<String> productCollection = actor.asksFor(Text.ofEach(InventoryPage.PRODUCT_NAMES));
        List<String> allProducts = new ArrayList<>(productCollection);
        Collections.shuffle(allProducts);
        List<String> selected = allProducts.subList(0, Math.min(quantity, allProducts.size()));

        for (String product : selected) {
            actor.attemptsTo(Click.on(InventoryPage.ADD_TO_CART_BUTTON.of(product)));
        }
    }

    public static AddProductToCart randomProducts(int quantity) {
        return new AddProductToCart(quantity);
    }
}
