#include<iostream>
using namespace std;
int main(){
    int *fp;
    fp=(int *)malloc(sizeof(int));
    *fp=25;//store 25 pointer to int size storage.
    cout<<*fp<<endl;    
    
    fp=(int *)realloc(fp,2*sizeof(int));
    cout<<*fp;
    free(fp);

}