class `Equilateral Triangle`(_name : String, side: Double) : Triangle(_name, side, side, side) {
    var side = 0.0

    //the overrides below could probably be ignored by me deleting the functions -v-
    override fun getArea(): Double{
        return super.getArea()
    }

    override fun printDimensions(){
        super.printDimensions()
    }

    fun setDimensions(newSide: Double){
        super.setDimensions(newSide, newSide, newSide)
    }
}