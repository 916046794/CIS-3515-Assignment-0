abstract class Shape (_name : String) : Dimensionable{
    //implements Dimensionable interface, has a constant named name that's public
    var name = _name

    open fun getArea(): Double {
        //it said to make this open (shrug)
        //weirdhow it prints kotlin.Unit right before it but I think bc of the typecast
        return 0.0;
    }

    override fun printDimensions(){
        print("")
    }
}