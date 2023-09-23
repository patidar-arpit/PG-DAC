#include<iostream>

using namespace std;

int main(){
    int m1,m2,m3,m4,m5;
    cout<<"Enter the marks of 5 subjects:";
    cin>>m1;
    cin>>m2;
    cin>>m3;
    cin>>m4;
    cin>>m5;


    int average=(m1+m2+m3+m4+m5)/5;

    double average1=(double)(m1+m2+m3+m4+m5)/5;

    cout<<average<<endl;
    cout<<average1;

    return 0;
}