package fi.ln.testiwebprojekti

import org.scalatra.ScalatraServlet
import javax.servlet.http.HttpServletResponse._
import com.google.common.net.{HttpHeaders, MediaType}

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