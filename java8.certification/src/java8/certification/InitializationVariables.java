package java8.certification;
public class InitializationVariables {


    public static final void main(String [] args){
       Integer $1 = new Integer(127);
       Integer $2 = new Integer(127);;
       System.out.println(System.identityHashCode($1));
    }


}
