import com.wordnik.swagger.util.Json
import com.wordnik.swagger.models.auth.AuthorizationValue
import io.swagger.parser.util.RemoteUrl
import io.swagger.parser.{Swagger20Parser, SwaggerParser}

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.Matchers

import scala.collection.JavaConverters._

@RunWith(classOf[JUnitRunner])
class RemoteUrlTest extends FlatSpec with Matchers {
  it should "read a remote URL" in {
    val output = RemoteUrl.urlToString("http://petstore.swagger.io/v2/pet/3", null)
    println(output)
  }
  it should "set a header" in {
    val av = new AuthorizationValue("accept", "application/xml", "header")
    val output = RemoteUrl.urlToString("http://petstore.swagger.io/v2/pet/3", List(av).asJava)
    println(output)
  }
}