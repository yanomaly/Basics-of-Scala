package Instrctr

class Instructor (val id: Int, var name: String, var surname: String) {
    def fullName(): String = this.name.substring(0, 1).toUpperCase + this.name.tail.toLowerCase + " " + this.surname.substring(0, 1).toUpperCase + this.surname.tail.toLowerCase
}
