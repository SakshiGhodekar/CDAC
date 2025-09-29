#include <iostream>
using namespace std;

int main(){
	int a[5],i;
	int max;
	cout<<"accept array elements\n";
	for(i=0;i<5;i++){
		cin>>*(a+i);
	}
	max=*(a+0);
	cout<<"print array elements\n";
	for(i=0;i<5;i++){
		if(max<*(a+i)){
			max=*(a+i);
		}
		
	}
	cout<<"max value is"<<"\t"<<max;
}

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

