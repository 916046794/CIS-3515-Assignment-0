import java.util.Scanner

fun main(){
    var orange_shape: Shape
    var cpu_shape: Shape
    var godet_shape: Shape
    var louvre_shape: Shape
    var user_input = Scanner(System.`in`)

    orange_shape = Circle("orange", 0.0)
    cpu_shape = Square("cpu", 0.0, 0.0)
    godet_shape = Triangle("godet", 0.0, 0.0, 0.0)
    louvre_shape = `Equilateral Triangle`("louvre", 0.0) //interesting how it adds ` as escape chars

    //prompting user for dimensions below
    println("\nPlease enter the dimensions for each shape as prompted.")

    println("\n\tSquare length, then height: ")
    var sq_len = user_input.nextDouble()
    var sq_height = user_input.nextDouble()
    cpu_shape.setDimensions(sq_len, sq_height)

    println("\n\tCircle radius: ")
    var circ_r = user_input.nextDouble()
    orange_shape.setDimensions(circ_r)

    println("\n\tTriangle side i, side ii, then side iii: ")
    var tri_i = user_input.nextDouble()
    var tri_ii = user_input.nextDouble()
    var tri_iii = user_input.nextDouble()
    godet_shape.setDimensions(tri_i, tri_ii, tri_iii)

    println("\n\tEquilateral triangle side: ")
    var eq_side = user_input.nextDouble()
    louvre_shape.setDimensions(eq_side)

    //printing the name, dimensions, and area of each shape
    println("\nHere are all your shapes:\n")

    println("\tThe square:\n\t${cpu_shape.name}")
    println("\t ${cpu_shape.printDimensions()}")
    println("\t ${cpu_shape.getArea()}")

    println("\n\tThe circle:\n\t${orange_shape.name}")
    println("\t ${orange_shape.printDimensions()}")
    println("\t ${orange_shape.getArea()}")

    println("\n\tThe triangle:\n\t${godet_shape.name}")
    println("\t ${godet_shape.printDimensions()}")
    println("\t ${godet_shape.getArea()}")

    println("\n\tThe equilateral triangle:\n\t${louvre_shape.name}")
    println("\t ${louvre_shape.printDimensions()}")
    println("\t ${louvre_shape.getArea()}")
}