import java.util.*;

class ArrayService{

  public static void acceptData(int[]arr){
 Scanner sc =new Scanner(System.in);
//taking inputs for an array
System.out.println("enter inputs");
for(int i=0;i<arr.length;i++){
 arr[i]=sc.nextInt();

}

}
  //display data of an array
 public static void displayData(int[]arr){

System.out.println("display Data");
for(int i=0;i<arr.length;i++){

System.out.println(i+" element is:"+arr[i]);

}

}
//addition of array elements
public static int addData(int[]arr){

int sum=0;
for(int i=0;i<arr.length;i++){

 sum=sum+arr[i];

}
return sum;
}

//maximum of array elements
public static int maxNumber(int[]arr){

int max=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>max){

max=arr[i];

}
}
return max;
}
//minimum of array

public static int minNumber(int[]arr){
int min=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]<min){

min=arr[i];

}
}
return min;
}
 //search element from an array
public static int searchNumber(int[]arr,int n){

for(int i=0;i<arr.length;i++){

if(arr[i]==n){

 return i;

}
}
return -1;
}

//search all occurances from an array
public static int[] findAllOccu(int[]arr,int num) {
	
	int[]temp=new int[arr.length];
	for(int i=0;i<temp.length;i++) {
		temp[i]=-1;
	}
	int cnt=0;
	for(int i=0;i<arr.length;i++) {
		
	if(arr[i]==num) {
		temp[cnt]=i;
		cnt++;
	}
	}
	if(cnt>0) {
		return temp;
	}
	return null;
}

//find max position for nth max
public static int findMaxPos(int[]arr,int start) {
	int pos=start;
	int max=arr[pos];
	for(int i=start+1;i<arr.length;i++) {
		if(max<arr[i]) {
			pos=i;
			max=arr[i];
		}	
	}
	return pos;
}
//find nth max
public static int findNthMax(int[]arr,int n) {
	for(int i=0;i<n;i++) {
		int pos=findMaxPos(arr,i);
		int temp=arr[i];
		arr[i]=arr[pos];
		arr[pos]=temp;
	}
	return arr[n-1];
}
//find max position for nth min

public static int findMinPos(int[]arr,int start) {
	int pos=start;
	int min=arr[pos];
	for(int i=start+1;i<arr.length;i++) {
		if(min>arr[i]) {
			pos=i;
			min=arr[i];
		}	
	}
	return pos;
}
//find nth min
public static int findNthMin(int[]arr,int n) {
	for(int i=0;i<n;i++) {
		int pos=findMinPos(arr,i);
		int temp=arr[i];
		arr[i]=arr[pos];
		arr[pos]=temp;
	}
	return arr[n-1];
}

}