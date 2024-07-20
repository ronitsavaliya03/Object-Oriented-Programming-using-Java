#include<iostream>
using namespace std;
int main(){
    int i,j,t,n;
    int *p;

    cout<<"Enter the value of n: ";
    cin>>n;

    p=(int *)malloc(n*sizeof(int));

    cout<<"Enter values:"<<endl;
    for(i=0; i<n; i++){
        cin>>p[i];
    }
    for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            if(p[i]>p[j]){
                t=p[i];
                p[i]=p[j];
                p[j]=t;
            }
        }
    }
    cout<<"Ascending order"<<endl;
    for(i=0; i<n; i++){
        cout<<p[i]<<" ";
    }

    for(i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            if(p[i]<p[j]){
                t=p[i];
                p[i]=p[j];
                p[j]=t;
            }
        }
    }
    cout<<endl;
    cout<<"Descending order"<<endl;
    for(i=0; i<n; i++){
        cout<<p[i]<<" ";
    }
    free(p);
}