package owexample

import outwatch.dom._
import outwatch.dom.dsl._
import monix.execution.Scheduler.Implicits.global

object Owexample {
  def main(args: Array[String]): Unit = {

    OutWatch.renderInto("#app", h1("Hello World")).unsafeRunSync()
  }
}
