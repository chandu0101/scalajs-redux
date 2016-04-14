package chandu0101.redux

import scala.scalajs.js
import scala.scalajs.js.annotation.{ScalaJSDefined, JSName}


@ScalaJSDefined
trait Store[T] extends js.Object {

  def getState(): T

  def dispatch(action: js.Object): js.Object

  def subscribe(listener: js.Function): js.Function

  def replaceReducer(nextReducer: js.Function): Unit

}

@js.native
trait Redux extends js.Object {

  def createStore[T](reducer: js.Function, initialState: T = ???, enhancer: js.Function = ???): Store[T] = js.native

  def combineReducers(reducers: js.Dictionary[js.Function]): js.Function = js.native

  def applyMiddleware(middlewares: js.Function*): js.Function = js.native

  def bindActionCreators(actionCreators: js.Function, dispatch: js.Function): js.Function = js.native

  def compose(functions: js.Function*): js.Function = js.native
}

@JSName("Redux")
@js.native
object Redux extends Redux