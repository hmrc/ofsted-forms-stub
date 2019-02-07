package uk.gov.hmrc.ofstedformsstub.controllers

import org.scalatest.{Matchers, WordSpec}
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.http.Status
import play.api.test.FakeRequest
import play.api.test.Helpers._

class OftsedFormsStubControllerControllerSpec extends WordSpec with Matchers with GuiceOneAppPerSuite {

  val fakeRequest = FakeRequest("GET", "/")

  "GET /" should {
    "return 200" in {
      val controller = new OftsedFormsStubController()
      val result = controller.hello()(fakeRequest)
      status(result) shouldBe Status.OK
    }
  }

}
