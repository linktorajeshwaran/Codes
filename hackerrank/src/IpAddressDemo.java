import java.util.Scanner;

class IpAddressDemo{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here

class MyRegex {
    String pattern = "((?:0{0,2}[0-9]?|0{0,1}[0-9]?[0-9]?|1[0-9]?[0-9]?|2[0-4]?[0-9]?|2[0-5]?[0-5]?)\\.){3}((?:0{0,2}[0-9]?|0{0,1}[0-9]?[0-9]?|1[0-9]?[0-9]?|2[0-4]?[0-9]?|2[0-5]?[0-5]?)){1}";
}