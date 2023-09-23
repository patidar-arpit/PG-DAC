#include<iostream>
using namespace std;
void getDate(int *date,int *month,int *year){

   cout<<"Enter the date:";
   cin>>*date;

   cout<<"Enter the month:";
   cin>>*month;
   cout<<"Enter the year:";
   cin>>*year;
}

int main(){
   int date,month,year;

   getDate(&date,&month,&year);

   cout<<date<<"/"<<month<<"/"<<year;


}