package com.ak.basics

object Currying {

  def nDividesM(n: Int, m: Int): Boolean = m % n == 0

  /**
   * Implement above method as below two currying method.
   */
  def nDividesM_V2(n: Int)(m: Int): Boolean = ???

  def isDivisibleby55(m: Int): Boolean = ???

}
