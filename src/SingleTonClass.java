public class SingleTonClass {
    private static SingleTonClass singleTonClass=new SingleTonClass();
    public static SingleTonClass getSingleTonClass(){
        if(singleTonClass==null)
            singleTonClass=new SingleTonClass();
        return singleTonClass;
    }

    private SingleTonClass(){

    }


}
