#include<iostream>
using namespace std;
void areaPeri(int l,int b,int &area,double &circum){

  area=l*b;
  circum=2*(l+b);

}
int main(){
 
 int choice;

 cout<<"1.Rectangle"<<endl;
 cout<<"2.Circle"<<endl;
 cin>>choice;

 switch(choice){
    case 1:
         int l,b;
         int area=0;
         double circum=0;
         cout<<"Enter the lenght and bradth:";
         cin>>l>>b;
         areaPeri(l,b,area,circum);
         cout<<area<<" "<<circum;

 }



 return 0;   
}