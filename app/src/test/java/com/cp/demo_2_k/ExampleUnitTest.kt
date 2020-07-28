package com.cp.demo_2_k

import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val a:Int=12;
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

//        Flowable.range(a, 10)
//            .observeOn(Schedulers.computation())
//            .map { v: Int -> v * v }
//            .blockingSubscribe { x: Int? -> println(x) }

        Flowable.range(a,3)
            .observeOn(Schedulers.computation())
            .map { v:Int->v*v }
            .blockingSubscribe{x:Int?-> println(x)}
    }
}