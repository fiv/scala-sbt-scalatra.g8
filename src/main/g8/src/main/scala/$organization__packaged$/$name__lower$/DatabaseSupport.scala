
package $organization$.$name;format="lowercase"$

import org.scalatra.ScalatraServlet
import org.slf4j.LoggerFactory

import com.mchange.v2.c3p0.ComboPooledDataSource
import java.util.Properties

import scala.slick.driver.H2Driver.simple._

trait DatabaseSupport extends ScalatraServlet {

  val logger = LoggerFactory.getLogger(getClass)

  val cpds = {
    val props = new Properties
    props.load(getClass.getResourceAsStream("/c3p0.properties"))
    val cpds = new ComboPooledDataSource
    cpds.setProperties(props)
    logger.info("Created c3p0 connection pool")
    cpds
  }

  def closeDbConnection() {
    logger.info("Closing c3po connection pool")
    cpds.close()
  }

  val db = Database.forDataSource(cpds)

  override def destroy() {
    super.destroy()
    closeDbConnection()
  }
}