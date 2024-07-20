#include<iostream>
using namespace std;
int main(){
    int n,i;
    int *arr;
    cout<<"Enter the number of students in class:";
    cin>>n;
    arr=(int*)malloc(n*sizeof(i));

    //note that sizeof() is used here
    
    for(i=0;i<n;i++){
        cout<<"Enter the marks of the student:";
        cin>>arr[i];
    }
    for(i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
    return 0;
}