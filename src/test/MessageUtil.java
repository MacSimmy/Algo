package test;

/**
 * Created by mahendra.chhimwal on 7/15/2016.
 */
public class MessageUtil {

    private  String message;
    private int number;

    public MessageUtil(String message){
        this.message = message+"extra";
    }

    public MessageUtil(int number){
        this.number = number;
    }

    public  String printMessage(){
        return message;
    }

    public int getNumber(){
        return this.number;
    }
}
