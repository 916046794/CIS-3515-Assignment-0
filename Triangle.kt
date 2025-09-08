class Triangle: Shape{
    var side_i = 0.0
    var side_ii = 0.0
    var side_iii = 0.0

    constructor(name: String, side_i: Double, side_ii: Double, side_iii: Double) : super(name) {
        this.side_i = side_i
        this.side_ii = side_ii
        this.side_iii = side_iii
    }

    override fun getArea(): Double {
        var perimeter = side_i + side_ii + side_iii
        var halfPerimeter = perimeter / 2.0;

        var inside_Sqrt = halfPerimeter * (halfPerimeter - side_i) * (halfPerimeter - side_ii) * (halfPerimeter - side_iii);
        return Math.sqrt(inside_Sqrt);
    }

    override fun printDimensions(){
        println("$side_i * $side_ii * $side_iii")
    }

    fun setDimensions(newSideI: Double, newSideIi: Double, newSideIii: Double){
        side_ii = newSideI
        side_ii = newSideIi
        side_iii = newSideIii
    }
}