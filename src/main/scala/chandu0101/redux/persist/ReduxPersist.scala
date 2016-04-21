package chandu0101.redux.persist

import chandu0101.redux.Store

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait Persistor extends js.Object {
  def purge(keys: js.Array[String]): Unit

  def purgeAll(): Unit
}

@ScalaJSDefined
class ReduxPersistConfig(val storage: js.Any) extends js.Object

@js.native
trait ReduxPersist[T] extends js.Object {

  def persistStore(store: Store[T], config: ReduxPersistConfig = ???, callback: js.Function = ???): Persistor = js.native


  def autoRehydrate(): js.Function1[Store[T], js.Function3[js.Function, js.UndefOr[T], js.UndefOr[js.Function], Store[T]]] = js.native
}
