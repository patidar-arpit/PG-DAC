#include<iostream>
using namespace std;

int main(){
   
    int basic_salary;
    int sales_amount;
    double  comission;

    cout<<"Enter Basic Salary:";
    cin>>basic_salary;
    cout<<"Enter sales amount:";
    cin>>sales_amount;

    if(sales_amount>=5000 && sales_amount<=7500){
      comission=(3/100)*sales_amount;
    }

    else if(sales_amount>=7501 && sales_amount<=10500){
        cout<<"HII";
        comission=(0.08)*sales_amount;
    }

    else if(sales_amount>=10501 && sales_amount<=15000){
        comission=(0.11)*sales_amount;
    }
    else{
        comission=(0.15)*sales_amount;
    }

    int net_salary=basic_salary+comission;

    cout<<"Net salary is:"<<net_salary;
  

    return 0;
}