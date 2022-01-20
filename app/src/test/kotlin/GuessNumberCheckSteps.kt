import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.assertj.core.api.Assertions.assertThat

class GuessNumberCheckSteps {
    private lateinit var result: String
    private lateinit var guessNumberGame: GuessNumberGame

    @Given("GuessNumberGame and init answer with {string}")
    fun guessNumberGameAndInitAnswerWith(arg0: String) {
        guessNumberGame = GuessNumberGame(arg0)
    }

    @When("Check {string}")
    fun check(arg0: String) {
        result = guessNumberGame.check(arg0)
    }

    @Then("Result should be {string}")
    fun resultShouldBe(arg0: String) {
        assertThat(result).isEqualTo(arg0)
    }
}