package com.ak.basics

object Conditions {

  /**
   *
   * A Method to calculate discount.
   *  Rules are :
   *  If Amount is > 5000 -> return 50
   *  If Amount is > 5000 -> return 50
   *  If Amount is > 5000 -> return 50
   *  Else return 0
   */
  def calculateDiscount(amount: Float): Float = {
    if (amount > 5000) {
      50
    } else if (amount > 3000) {
      25
    } else if (amount > 1000) {
      5
    } else 0
  }

  /**
   *
   */

}
