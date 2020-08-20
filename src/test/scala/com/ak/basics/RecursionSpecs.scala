package com.ak.basics

import org.scalatestplus.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalactic.source.Position.apply

@RunWith(classOf[JUnitRunner])
class RecursionSpecs extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  "Recusive functions" should "run as expected" in {

    Recursion.isPrime(4) should be(false)
    Recursion.isPrime(17) should be(true)
    Recursion.isPrime(37 * 17) should be(false)

    Recursion.concatenate("a", 5) should be("aaaaa")

    Recursion.fibonacci(1) should be(1)
    Recursion.fibonacci(2) should be(1)
    Recursion.fibonacci(3) should be(2)
    Recursion.fibonacci(4) should be(3)

  }
}
