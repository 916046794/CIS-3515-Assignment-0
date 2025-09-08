class Circle: Shape{
    var radius = 0.0

    constructor(name: String, radius: Double) : super(name) {
        this.radius = radius
    }

    override fun getArea(): Double {
        //pi*radius squared
        return (Math.pow(radius, 2.0)) * Math.PI;
    }

    override fun printDimensions(){
        println("$radius")
    }

    fun setDimensions(newRadius: Double){
        radius = newRadius;
    }
}