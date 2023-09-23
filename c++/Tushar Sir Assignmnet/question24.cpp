#include<iostream>
using namespace std;

int max(int arr[],int n){

    int greatest=INT8_MIN;

    for(int i=0;i<n;i++){
        if(arr[i]>greatest)
            greatest=arr[i];
    }

    return greatest;


}

int min(int arr[],int n){

    int smallest=INT8_MAX;

    for(int i=0;i<n;i++){
        if(arr[i]<smallest)
            smallest=arr[i];
    }

    return smallest;


}


void displayMultiply(int arr[] ,int n,int num){

    int brr [n] ={1,1,1,1,1};

    for(int i=0;i<n;i++){

        brr[i]=arr[i]*5;
    }

    for(int i=0;i<n;i++){
        cout<<brr[i]<<" ";
    }
}



int main(){

   int arr[5];
   cout<<"Enter five elemnets in an array:";
   
   for(int i=0;i<5;i++){
    cin>>arr[i];
   }

   cout<<max(arr,5)<<endl;
   cout<<min(arr,5)<<endl;
   displayMultiply(arr,5,5);

}