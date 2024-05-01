class Test extends Exception {}

class Main{
    public static void main(String args[]){
        try{
            throw new Test();
        }
        catch(Test e){
            System.out.println("Got the  Exception ");
        }
    }
}