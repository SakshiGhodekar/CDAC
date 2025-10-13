import java.util.*;

class ArrayService{

  public static void acceptData(int[]arr){
 Scanner sc =new Scanner(System.in);

System.out.println("enter inputs");
for(int i=0;i<arr.length;i++){
 arr[i]=sc.nextInt();

}

}
 public static void displayData(int[]arr){

System.out.println("display Data");
for(int i=0;i<arr.length;i++){

System.out.println(i+" element is:"+arr[i]);

}

}

public static int addData(int[]arr){

int sum=0;
for(int i=0;i<arr.length;i++){

 sum=sum+arr[i];

}
return sum;
}
public static int maxNumber(int[]arr){

int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max){

max=arr[i];

}
return max;
}
}

public static int minNumber(int[]arr){
int min=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]<min){

min=arr[i];

}
return min;


}

public static int searchNumber(int[]arr,int n){

for(int i=0;i<arr.length;i++){

if(arr[i]==n){

 return i;

}
return -1;

}

}

public static 
}