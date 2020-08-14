package com.ak.basics

import org.scalatestplus.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalactic.source.Position.apply

@RunWith(classOf[JUnitRunner])
class ConditionsSpecs extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  "Conditions.calculateDiscount" should "return proper discount" in {
    Conditions.calculateDiscount(5050.4f) should be(50)
    Conditions.calculateDiscount(3050.4f) should be(25)
    Conditions.calculateDiscount(1050.4f) should be(5)
    Conditions.calculateDiscount(50.4f) should be(0)
  }

}