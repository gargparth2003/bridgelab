/*



Given an array arr[] of size N containing positive integers and an integer X, find the
element in the array which is smaller than X and closest to it.
Input Format
First line - Take size of array N and an element X.
Second line - Take N integer value to store them in an array.
Output Format
Print the number which is closest to the given number X.
Constraints
1. 1 <= N <= 10^3

2. 1 <= arr[i], X <= 10^4
Input Output
5 16
4 67 13 12 15
15
For a given value 16, there are four values which are smaller than it. But 15 is the number
which is smaller and closest to it with a minimum difference of 1.
*/


#include<iostream>
using namespace std;
int immediateSmaller(int arr[],int n,int x)
{
    int count =0 ;
int diff = 10000;
for(int i=0;i <n;i++){
if(x>arr[i]){
count=x-arr[i];
if(count<diff){
diff=count;
}
}
}
if(diff==10000)
return-1;
else if(diff>0)
return( x-diff);
}
int main(){
int n,x;
cin >> n>>x;
int arr[n];
for(int i=0;i<n;i++){
cin>>arr[i];
}
cout<<immediateSmaller(arr,n,x)<<endl;
return 0;
}