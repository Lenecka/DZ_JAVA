public class Main {
public static void main(String[] args) {
 int[]num={5,3,9,7,6,4,6,7,4,1};
 int max=0;
 for(int i=1;i<10;i++)
{
 if(max<num[i])
 max=num[i];
}
System.out.print("максимальное число:  "+max);
}
}
