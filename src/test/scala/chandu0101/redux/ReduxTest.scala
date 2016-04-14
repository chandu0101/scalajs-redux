package chandu0101.redux

import scala.scalajs.js
import scala.scalajs.js.JSON
import scala.scalajs.js.Dynamic.{literal => json}

class ReduxTest extends BaseTest{

 test("sample") {
   val store = Redux.createStore((state : Any ,action : js.Object) => state,List(1,2,3))
   store.subscribe(() => println(s"store new state : ${store.getState()}"))
   store.dispatch(json(`type` = "hello"))
   assert( 2 == 2)
 }

}
