abstract class Shape (_name : String) : Dimensionable{
    //implements Dimensionable interface, has a constant named name that's public

    var name = _name
    fun getArea(): Double {
        return 0.0;
    }
    override fun printDimensions(){}
}