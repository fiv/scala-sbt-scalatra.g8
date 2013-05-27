
package $organization$.$name;format="lowercase"$

import org.scalatra._
import com.google.common.net.{HttpHeaders, MediaType}
import javax.servlet.http.HttpServletResponse.SC_NOT_FOUND
import scala.language.implicitConversions

class DefaultServlet extends ScalatraServlet with GZipSupport with MethodOverride {

  implicit def mediaTypeToString(mediaType: MediaType): String = mediaType.toString

  notFound {
    response.setStatus(SC_NOT_FOUND)
    contentType = MediaType.PLAIN_TEXT_UTF_8
    "Not found"
  }

}