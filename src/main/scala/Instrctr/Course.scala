package Instrctr

class Course(val courseID: Int, var title: String, var releaseYear: String, var instructor: Instructor) {
  def getID(): String = this.courseID.toString() + this.courseID.toString()
  def isTaughtBy(instructor: Instructor): Boolean = if(instructor.equals(this.instructor)) true else false
  def copyCourse(newReleaseYear: String): Course = new Course(this.courseID, this.title, newReleaseYear, this.instructor)
}
