
import $organization$.$name;format="lowercase"$.controllers._
import $organization$.$name;format="lowercase"$.StaticServlet
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new RootServlet, "/*")
    context.mount(new StaticServlet, "/static/*")
    context.mount(new StaticServlet, "/images/*")
  }
}
