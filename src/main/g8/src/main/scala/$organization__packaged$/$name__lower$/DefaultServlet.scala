
package $organization$.$name;format="lowercase"$

import org.scalatra._
import com.google.common.net.MediaType
import javax.servlet.http.HttpServletResponse.SC_NOT_FOUND

class DefaultServlet extends ScalatraServlet with GZipSupport with MethodOverride {

  before() {
    contentType = MediaType.PLAIN_TEXT_UTF_8.toString
  }

  override def resourceNotFound() = {
    response.setStatus(SC_NOT_FOUND)
    contentType = MediaType.PLAIN_TEXT_UTF_8.toString
    "Not found"
  }

  doNotFound = () => {
    resourceNotFound()
  }

}