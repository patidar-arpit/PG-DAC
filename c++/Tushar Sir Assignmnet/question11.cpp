#include<iostream>

using namespace std;

int main(){
    char ch;
    char Newch;
    cout<<"Enter a alphabet";
    cin>>ch;
    if(ch<65 || ch>123)
       cout<<"Plese enter a alphabet";
    else{
         if(ch>=65 && ch<=90)
            Newch=ch+32;

         if(ch>=97 && ch<=123)
            Newch=ch-32;

        cout<<Newch;
         
    }
    return 0;
}