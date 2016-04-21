package chandu0101.redux.logger

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class ReduxLoggerOptions(val predicate: js.Function, val collapsed: js.UndefOr[Boolean] = js.undefined, val duration: js.UndefOr[Boolean] = js.undefined) extends js.Object

@js.native
trait ReduxLogger extends js.Object {

  def createLogger(options: ReduxLoggerOptions): js.Function = js.native

}
