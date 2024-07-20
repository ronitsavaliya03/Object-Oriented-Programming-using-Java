#include<iostream>
using namespace std;
void greet(){
    cout<<"Good Morning"<<endl;
    cout<<"How Are You??"<<endl;
}
void greet2(){
    cout<<"Good Evening"<<endl;
    cout<<"How Are You??"<<endl;

}
int main(){
    char ch;
    cout<<"Enter the letter, m for morning or e for evening:";
    cin>>ch;
    if(ch=='m'){
    greet();
    }
    else if(ch=='e'){
    greet2();
    }
    else{
        cout<<"Hello.!";
    }
}