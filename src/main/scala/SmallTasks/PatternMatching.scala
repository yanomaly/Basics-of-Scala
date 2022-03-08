package SmallTasks

object PatternMatching extends App {
  def guard(data: Any, maxLength: Int): String ={
    val res = data match{
      case list: List[Any] => if(list.length <= maxLength) "Задан список List допустимой длины" else "Длина списка больше максимально допустимого значения"
      case str: String => if(str.length <= maxLength) "Длина строки не превышает максимально допустимого значения" else "Получена строка недопустимой длины"
      case _ => "Что это? Это не строка и не список"
    }
    res
  }
}
