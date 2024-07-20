#include<iostream>
using namespace std;
int main(){
    int x,y;
    x=5;
    cout<<x+8<<endl;//it's print 13

    x+=9;
    cout<<x<<endl;

    x++;
    cout<<x<<endl;

    cout<<"Enter the value of y:";
    cin>>y;//input(not requred endl)
    cout<<y*y<<endl;

    cout<<"Answer:"<<x+y;

    return 0;
}