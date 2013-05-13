
package $organization$.$name;format="lowercase"$.controllers

import $organization$.$name;format="lowercase"$.DefaultServlet

class RootServlet extends DefaultServlet {

  doNotFound = () => {
    serveStaticResource() getOrElse resourceNotFound()
  }

  get("/") {
    "All your $name$ are belong to us."
  }

}