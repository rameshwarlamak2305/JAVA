interface Parent1{//created Interface 
    void discipline();//Method is define
}
interface Parent2{
    void discipline();
}
class Child implements Parent1,Parent2{
    public void discipline(){//Method is implemented 
        System.out.println("I am Learning discipline");
    }
    void follow(){
        System.out.println("I am FOllowing all the Instruction");
    }
}
class MultipleInheritance{
    public static void main(String args[]){
        /* Parent1 p=new Child();
         * p.discipline();
         * 
         */
        Child c=new Child();
        c.discipline();
        c.follow();
    } 
}
