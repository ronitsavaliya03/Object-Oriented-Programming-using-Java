#include<iostream>
using namespace std;
int change(int a[]){
    a[0]=9;
}
int main(){
    int a[3]={1,2,3};
    for(int i=0;i<=2;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
    change(a);
    for(int i=0;i<=2;i++){
        cout<<a[i]<<" ";
    }
}