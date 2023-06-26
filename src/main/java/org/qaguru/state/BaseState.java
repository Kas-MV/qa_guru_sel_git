package org.qaguru.state;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;


public abstract class BaseState {

    @BeforeEach
    public void init() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadStrategy = "eager";
    }
}
