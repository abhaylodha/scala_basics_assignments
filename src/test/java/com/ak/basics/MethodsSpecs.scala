package com.ak.basics

import org.scalatestplus.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalactic.source.Position.apply

@RunWith(classOf[JUnitRunner])
class MethodsSpecs extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  "Methods.addTwoNumbers" should "return 11" in {
    Methods.addTwoNumbers(5, 6) should be(11)
  }

  "Method findSumUsingLoop" should "return 55" in {
    Methods.findSumUsingLoop(1, 10) should be(55)
  }

}