import org.junit.jupiter.api.Test;
import qaguru.page.GitPage;
import qaguru.state.BaseState;

public class TestGitHub extends BaseState {

    GitPage gitPage = new GitPage();

    @Test
    void testGitHubSelenide() {

        gitPage.openPageGitHub();
        gitPage.setSearchFieldValueAndPressEnter("selenide");
        gitPage.clickListSearch();
        gitPage.clickWikiTab();
        gitPage.setFindFieldAndPressEnter("SoftAssertions");
        gitPage.wikiSelenide.click();
        gitPage.checkResult("Using JUnit5 extend test class:");
        gitPage.checkResult("" +
                "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "}");
    }
}