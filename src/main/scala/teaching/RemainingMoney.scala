package teaching

import scala.math.Numeric.BigDecimalAsIfIntegral.abs

object RemainingMoney {
  def remainingMoney(shoppingTotal: BigDecimal, yourMoney: BigDecimal): String={
    val remainingMoney: BigDecimal = abs(yourMoney- shoppingTotal)
    val x: String = remainingMoney match{
      case remainingMoney if (remainingMoney > 0) => s"Thank you for your purchase, here is your $remainingMoney change"
      case remainingMoney if (remainingMoney == 0) => s"Thank you for your purchase"
      case _ => s"Sorry but you are $remainingMoney short!"
    }
    x
  }
}
