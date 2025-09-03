class Triangle(_name : String) : Shape {

    fun getArea(side_i: Double, side_ii: Double, side_iii: Double): Double {
        var perimeter = side_i + side_ii + side_iii
        var halfPerimeter = perimeter / 2.0;

        var inside_Sqrt = halfPerimeter * (halfPerimeter - side_i) * (halfPerimeter - side_ii) * (halfPerimeter - side_iii);
        return Math.sqrt(inside_Sqrt);
    }
}