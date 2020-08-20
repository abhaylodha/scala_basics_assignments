package com.ak.basics

import org.scalatestplus.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalactic.source.Position.apply

@RunWith(classOf[JUnitRunner])
class CurryingSpecs extends AnyFlatSpec with Matchers with BeforeAndAfterAll {
  "Currying" should "return proper result" in {
    Currying.isDivisibleby55(20) should be(false)
    Currying.isDivisibleby55(110) should be(true)
  }
}