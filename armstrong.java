import java.util.*;
class armstrong {
 static int number(int a){
    int sum=0,rem;
    int temp=a;
    while(temp>0){
        rem=temp%10;
        sum=sum+(rem*rem*rem);
        temp/=10;
    }
    if(sum==a){
        System.out.println(a+" is an armstrong number");
    }
    else{
        System.out.println(a+" is not an armstrong number");
    }
    return sum;
}
public static void main(String[] args){
    System.out.println("enter number:");
    try(Scanner sc=new Scanner(System.in)){
    int a=sc.nextInt();
    number(a);
    }
}
}