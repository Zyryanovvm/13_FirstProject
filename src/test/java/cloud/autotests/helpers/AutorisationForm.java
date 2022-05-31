package cloud.autotests.helpers;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class AutorisationForm {

    public AutorisationForm openStartPage() {
        step("Open Start page", () -> {
            Selenide.open("https://yandex.ru/");
            DriverSettings.configure();
        });
        return this;
    }

    public AutorisationForm openAutorisationForm() {
        step("click login", () -> {
            $$(".desk-notif-card__login-new-item-title").findBy(text("Войти")).click();
        });
        return this;
    }

    public AutorisationForm clickLoginForEmail() {
        step("click Login for email", () -> {
        String switchData = $(".Button2_view_default").text();
        if (switchData.equals("Телефон")) {
                $(".Button2_view_default").click();
            }
        });
        return this;

    }

    public AutorisationForm setEmail(String value) {
        step("set empty field email", () -> {
            $("#passp-field-login").setValue(value);
        });
        return this;
    }

    public AutorisationForm clickEnter(){
        step("click enter", () -> {
            $(".Button2_type_submit").click();
        });
        return this;
    }

    public AutorisationForm assertAlertEmail(String expectedValue) {
        step("Assert alert", () -> {
            String actualAlert = $(".Textinput-Hint.Textinput-Hint_state_error").text();
            assertThat(actualAlert).isEqualTo(expectedValue);
        });
        return this;
    }

    public AutorisationForm assertAlertPassword(String expectedValue) {
                step("Asser alert", () -> {
                    String actualAlert = $(".Textinput-Hint.Textinput-Hint_state_error").text();
                    assertThat(actualAlert).isEqualTo(expectedValue);
                });
        return this;
            }

    public AutorisationForm setPassword(String password) {
        step("set password", () -> {
            $("#passp-field-passwd").setValue(password);
        });
        return this;
    }



}
