package org.qaguru.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitPage {

    public final SelenideElement
            searchField = $("[placeholder='Search GitHub']"),
            tabWiki = $("#wiki-tab"),
            wikiPageFilter = $("#wiki-pages-filter"),
            wikiSelenide = $("[href='/selenide/selenide/wiki/SoftAssertions']"),
            textPage = $(".markdown-body");

    public final ElementsCollection listSearch = $$("ul.repo-list li");

    public void openPageGitHub() {
        open("https://github.com/");
    }

    public void setSearchFieldValueAndPressEnter(String value) {
        searchField.setValue(value).pressEnter();
    }

    public void clickListSearch() {
        listSearch.first().$("a").click();
    }

    public void clickWikiTab() {
        tabWiki.click();
    }

    public void setFindFieldAndPressEnter(String text) {
        wikiPageFilter.setValue(text).pressEnter();
    }

    public void checkResult(String value) {
        textPage.shouldHave(text(value));
    }
}
