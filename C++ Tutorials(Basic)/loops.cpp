#include<iostream>
using namespace std;
int main(){
    int i,n,a,digit,temp=0;
    cin>>n;
    // for(i=1;i<=n;i++){
    //     cout<<"Hello Buddy.!!"<<endl;
    // }

    // for(i=4;i<=n;i+=3){
    //   cout<<i<<",";
    // }

   while(n!=0){
        digit=n%10;
        temp=(temp*10)+digit;
        n=n/10;
    }
    n=temp;

    cout<<temp;

}