class Circle(_name : String) : Shape {

    fun getArea(radius: Double): Double {
        //pi*radius squared
        return (Math.pow(radius, 2.0)) * Math.PI;
    }
}