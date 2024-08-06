public class Prime{
  public static void main(String[] args) {
    int a=0;
    int count = 0;
    for(int i=0;i<=100;i++){
      if(a%i==0){
        count ++;
      }
    }
    if(count == 2){
      System.out.println("prime number");
    }
    else{
      System.out.println("is not a prime number");
    }
  }
}