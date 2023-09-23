#include<iostream>
using namespace std;

int num1;
int num2;


int * max(int a,int b){
   

    if(a>b){
        num1=a;
        return &num1;

    }
    
    num2=b;
    return &num2;

}

int main(){

    
    cout<<"Enter two integers:";
    cin>>num1>>num2;

    int *greatest=max(num1,num2);

    cout<<greatest;

    return  0;
}