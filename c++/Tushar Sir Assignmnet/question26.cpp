#include<iostream>
using namespace std;

int main(){

 int n,pos,element;
 int flag=0;
 cout<<"Enter the length of Array:";
 cin>>n;
 int arr[n+1];
 cout<<"Enter the elements of array:";
 for(int i=0;i<n;i++){
   cin>>arr[i];
 }

 cout<<"Enter the Position of element where to be inserted:";
 cin>>pos;
 
 cout<<"What Element you want to insert?:";
 cin>>element;

 for(int i=n;i>pos;i--){
    arr[i]=arr[i-1];
 }
 arr[pos]=element;

 for(int i=0;i<=n;i++){
    cout<<arr[i]<<" ";
 }
  return 0;
}