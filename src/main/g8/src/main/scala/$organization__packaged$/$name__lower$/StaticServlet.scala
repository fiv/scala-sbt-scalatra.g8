
package $organization$.$name;format="lowercase"$

import org.scalatra.ScalatraServlet
import javax.servlet.http.HttpServletResponse._
import com.google.common.net.{HttpHeaders, MediaType}
import scala.language.implicitConversions

class StaticServlet extends ScalatraServlet {

  implicit def mediaTypeToString(mediaType: MediaType): String = mediaType.toString

  notFound {
    serveStaticResource() getOrElse {
      response.setStatus(SC_NOT_FOUND)
      contentType = MediaType.PLAIN_TEXT_UTF_8
      "Static resource not found"
    }
  }

}