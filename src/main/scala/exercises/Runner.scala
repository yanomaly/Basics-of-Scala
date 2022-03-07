package exercises

import exercises.LogSystem.Logger

object Runner extends App{
  val test: Logger = new Logger()
  print(test.info(3).msgNum)
}