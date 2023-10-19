package testingLang

enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

class Robot(var x: Int, var y: Int, var direction: Direction) {
    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
            Direction.LEFT -> Direction.DOWN
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.DOWN -> Direction.LEFT
            Direction.RIGHT -> Direction.DOWN
            Direction.LEFT -> Direction.UP
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.UP -> y++
            Direction.DOWN -> y--
            Direction.RIGHT -> x++
            Direction.LEFT -> x--
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}
fun moveRobot(r: Robot, toX: Int, toY: Int) {
    var currentX = r.x
    var currentY = r.y

    while (currentX != toX || currentY != toY) {
        val diffX = toX - currentX
        val diffY = toY - currentY

        if (diffX != 0) {
            if (diffX > 0) {
                r.direction = Direction.RIGHT
                r.stepForward()
                currentX++
            } else {
                r.direction = Direction.LEFT
                r.stepForward()
                currentX--
            }
        }

        if (diffY != 0) {
            if (diffY > 0) {
                r.direction = Direction.UP
                r.stepForward()
                currentY++
            } else {
                r.direction = Direction.DOWN
                r.stepForward()
                currentY--
            }
        }
    }
}


fun main() {
    val myRobot = Robot(0, 0, Direction.UP)

    println(myRobot)
    myRobot.turnRight()
    myRobot.stepForward()
    println(myRobot)

    myRobot.turnLeft()
    myRobot.stepForward()
    println(myRobot)
    moveRobot(myRobot, 3, 7)
    println("${myRobot.x} ${myRobot.y}") // Выводит "3 7"
}