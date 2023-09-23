#include<iostream>

using namespace std;

int main(){
    int basic_salary;
    cout<<"Enter your Basic Salary:";
    cin>>basic_salary;
    double gross_salary;
    double net_salary;


    gross_salary= (15/100)*basic_salary+(30/100)*basic_salary+basic_salary;
    net_salary=gross_salary- ((12.5/100)*gross_salary);

    cout<<net_salary;


    return 0;
}