package com.ak

import org.scalatestplus.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalactic.source.Position.apply

@RunWith(classOf[JUnitRunner])
class SampleScalaSpec extends AnyFlatSpec with Matchers with BeforeAndAfterAll {

  "testMethod" should "return 5" in {
    SampleScala.testMethod should be(5)
  }

}