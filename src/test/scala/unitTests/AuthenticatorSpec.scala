package unitTests
//import add.Authenticator.{contactAuthenticator, validateSubscriber}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper
import add.{Authenticator, ContactDetails, IndividualsDetail}






class AuthenticatorSpec extends AnyFlatSpec {

  val auth = new Authenticator
  "Authenticator" must "return an error if any of the individual's name is missing" in {

    val missingAddress = IndividualsDetail("", "kouh", List(ContactDetails("123231", "asldls", "asdasd")))
    val exception = intercept[RuntimeException] {auth.validateSubscriber(missingAddress)}
      assert(exception.getMessage == "Missing name")

  }
  "Authenticator" must "return an error if any of the individual's surname is missing" in {
    val missingAddress = IndividualsDetail("al", "", List(ContactDetails("123231", "asldls", "asdasd")))
    val exception = intercept[RuntimeException] {auth.validateSubscriber(missingAddress)}
    assert(exception.getMessage == "Missing surname")

  }
  "Authenticator" must "return an error if any of the individual's contact detail is missing" in {
    val missingAddress = IndividualsDetail("al", "kouh", List(ContactDetails("123231", "asldls", "")))
    val exception = intercept[RuntimeException] {auth.validateSubscriber(missingAddress)}
    assert(exception.getMessage == "Missing address")

  }
}