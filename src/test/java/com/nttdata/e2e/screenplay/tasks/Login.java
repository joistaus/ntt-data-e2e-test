package com.nttdata.e2e.screenplay.tasks;

import com.nttdata.e2e.screenplay.model.User;
import com.nttdata.e2e.screenplay.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.core.environment.WebDriverConfiguredEnvironment;

public class Login implements Task {

    private final User user;

    private Login(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String baseUrl = WebDriverConfiguredEnvironment.getEnvironmentVariables().getProperty("webdriver.base.url");
        actor.attemptsTo(
                Open.url(baseUrl),
                Enter.theValue(user.getUsername()).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(user.getPassword()).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static Login withCredentials(User user) {
        return new Login(user);
    }
}
