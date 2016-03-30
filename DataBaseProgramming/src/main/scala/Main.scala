import slick.driver.SQLiteDriver.api._

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by Mikio on 2016/03/24.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val db = Database.forConfig("sqliteconf")

    val name = "初音ミク"

    try {
      Await.result(
        db.run(
          sql"""SELECT * FROM artist WHERE name = ${name} LIMIT 1""".as[(Int, String, String)]
        ).map(println),
        Duration.Inf
      )
    } finally db.close
  }
}
