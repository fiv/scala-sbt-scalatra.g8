
package $organization$.$name;format="lowercase"$.controllers

import $organization$.$name;format="lowercase"$.DefaultServlet

class RootServlet extends DefaultServlet {

  get("/") {
    contentType = MediaType.PLAIN_TEXT_UTF_8
    "All your $name$ are belong to us."
  }

}