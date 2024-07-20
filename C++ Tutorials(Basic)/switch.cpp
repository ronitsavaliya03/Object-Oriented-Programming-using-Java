#include<iostream>
using namespace std;
int main(){
    int n,a,b;
    cout<<" 1.sum \n 2.sub \n 3.mul \n 4.div"<<endl;
    cout<<"Enter the num:";
    cin>>n;
    cout<<"Enter the value of a and b:"<<endl;
    cin>>a>>b;

    switch(n){
        case 1:cout<<a+b;
        break;
        case 2:cout<<a-b;
        break;
        case 3:cout<<a*b;
        break;
        case 4:cout<<a/b;
        break;
    }
}
