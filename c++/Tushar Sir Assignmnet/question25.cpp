#include<iostream>
using namespace std;

int main(){

 int n,pos;
 int flag=0;
 cout<<"Enter the length of Array:";
 cin>>n;
int arr[n];
 cout<<"Enter the elements of array:";
 for(int i=0;i<n;i++){
   cin>>arr[i];
 }

 cout<<"Enter the Position of element to be deleted:";
 cin>>pos;

 if(pos<0 || pos>=n){
    flag=1;
    cout<<"Invalid Position";

 }

 if(flag==0){
            for(int i=pos;pos<n-1;pos++){

            arr[pos]=arr[pos+1];
        }

        for(int i=0;i<n-1;i++){
            cout<<arr[i]<<" ";
        }
 }
 return 0;
}