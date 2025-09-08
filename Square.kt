class Square: Shape{
    var length = 0.0
    var height = 0.0

    constructor(name: String, length: Double, height: Double) : super(name) {
        this.length = length
        this.height = height
    }

    override fun getArea(): Double {
        return height*length;
    }

    override fun printDimensions(){
        println("$length * $height")
    }

    fun setDimensions(newHeight: Double, newLength: Double){
        length = newLength
        height = newHeight
    }
}