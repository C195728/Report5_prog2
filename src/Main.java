public class Main{
    public static void main(String[] args){
        try{
        String str = null;
        System.out.println(str.length());
    }catch(NullPointerException e){
        System.out.println("nullが入力されている");
        System.out.println(e.getMessage());
    }
}
}