#include<iostream>
using namespace std;
struct  Student
{
   char name[50];
   int m1;
   int m2;
   int m3;
   char g;

};

float calculateAverage(int m1,int m2,int m3){

     float  averageIs=(m1+m2+m3)/3;

     return averageIs;
}

int main(){
   int noOfStudent;
   struct Student s1;


   cout<<"Enter the no of student:";
   cin>>noOfStudent;

   while(noOfStudent--){
    cout<<"Enter the name of student:";
    cin>>s1.name;

    cout<<"Enter the scores of three assignment score (score range:0-100):";
    cin>>s1.m1>>s1.m2>>s1.m3;

    float  grade=calculateAverage(s1.m1,s1.m2,s1.m3);

    if(grade >=90 && grade<=100){
        s1.g='A';
    }
    else if(grade>=80 && grade<=89){
        s1.g='B';
    }
    else if(grade >=70 && grade<=79){
        s1.g='C';
    }
    else if(grade >=60 && grade<=69){
        s1.g='D';
    }
    else{
        s1.g='F';
    }
    cout<<"Name :"<<s1.name<<endl;
    cout<<"Assignmnet Score are:"<<s1.m1<<" "<<s1.m2<<" "<<s1.m3<<endl;
    cout<<"Average Score is:"<<grade<<endl;
    cout<<"Corresponding grade is :"<<s1.g<<endl;


    }
    return 0;
 }
