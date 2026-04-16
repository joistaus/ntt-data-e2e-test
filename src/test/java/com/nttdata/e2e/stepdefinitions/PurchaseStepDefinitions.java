package com.nttdata.e2e.stepdefinitions;

import com.nttdata.e2e.screenplay.model.BuyerInfo;
import com.nttdata.e2e.screenplay.model.User;
import com.nttdata.e2e.screenplay.pages.CartPage;
import com.nttdata.e2e.screenplay.questions.ConfirmationMessage;
import com.nttdata.e2e.screenplay.tasks.AddProductToCart;
import com.nttdata.e2e.screenplay.tasks.CompletePurchase;
import com.nttdata.e2e.screenplay.tasks.FillCheckoutForm;
import com.nttdata.e2e.screenplay.tasks.Login;
import com.nttdata.e2e.screenplay.tasks.ViewCart;
import com.nttdata.e2e.testdata.TestDataLoader;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

public class PurchaseStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user is logged in with valid credentials")
    public void theUserIsLoggedInWithValidCredentials() {
        User user = TestDataLoader.load().getUser();
        OnStage.theActorCalled("buyer").attemptsTo(
                Login.withCredentials(user)
        );
    }

    @When("they add 2 random products to the cart")
    public void theyAdd2RandomProductsToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductToCart.randomProducts(2)
        );
    }

    @And("they proceed to the cart")
    public void theyProceedToTheCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ViewCart.page()
        );
    }

    @And("they proceed to checkout")
    public void theyProceedToCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }

    @And("they fill in the checkout form")
    public void theyFillInTheCheckoutForm() {
        BuyerInfo buyerInfo = TestDataLoader.load().getBuyerInfo();
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillCheckoutForm.with(buyerInfo)
        );
    }

    @And("they complete the purchase")
    public void theyCompleteThePurchase() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompletePurchase.order()
        );
    }

    @Then("the order confirmation message should be displayed")
    public void theOrderConfirmationMessageShouldBeDisplayed() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ConfirmationMessage.displayed())
                        .isEqualTo("Thank you for your order!")
        );
    }
}
