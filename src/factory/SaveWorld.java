package factory;

public class SaveWorld {

    public Avengers getAvenger(String problemType){
        if("easy".equals(problemType)){
            return new SpiderMan();
        }else{
            return new SuperMan();
        }
    }
}
