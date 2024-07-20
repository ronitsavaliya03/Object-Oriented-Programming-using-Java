#include<iostream>
using namespace std;
int main(){
    int i,n1,n2;
    int *fp;
    cout<<"Enter size of list: ";
    cin>>n1;
    fp=(int *)malloc(n1*sizeof(int));

    cout<<"Enter "<<n1<<" number"<<endl;
    for(i=0; i<n1; i++){
        cin>>fp[i];
    }
    cout<<endl;
    cout<<"The numbers in the list are"<<endl;
    for(i=0; i<n1; i++){
        cout<<fp[i]<<" ";
    }

    //second part

    cout<<endl;
    cout<<"Enter new size of list: ";
    cin>>n2;

    fp=(int *)realloc(fp,n2*sizeof(int));
    if(n2>n1){
        cout<<"Enter "<<n2-n1<<" numbers"<<endl;
    
    for(i=n1; i<n2; i++){
        cin>>fp[i];
    }
    }

    cout<<"The number in the list are "<<endl;
    for(i=0; i<n2; i++){
        cout<<fp[i]<<" ";
    }

}