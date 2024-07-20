#include<iostream>
using namespace std;

class student{
    string name;
    public:
    int age;
    bool gender;

    // Default CopyConstructor--> Shallow Copy
    // Copy the pointers are copy but there locations are not copied.

    // Wemade CopyConstructor--> Deep Copy
    // Copy the pointers are copy and there locations are also copied.

    student(){
        cout<<"Default Constructor"<<endl;
    }

    student(string s,int a,bool g){
        cout<<"Peramiterised Constructor"<<endl;
        name = s;
        age = a;
        gender = g;
    }

    student(student &a){
        cout<<"Copy Constructor"<<endl;
        name=a.name;
        age=a.age;
        gender=a.gender;
    }

    ~student(){
        cout<<"Yes!! Destructor called"<<endl;
    }

    void setName(string s){
        name=s;
    }

    void printInfo(){
        cout<<"Name: ";
        cout<<name<<endl;
        cout<<"Age: ";
        cout<<age<<endl;
        cout<<"Gender: ";
        cout<<gender<<endl;

    }

    bool operator == (student &a){
        if(name==a.name && age==a.age && gender==a.gender){
            return true;
        }
            return false;
    }
};

int main(){
     
    // student arr[3];
    // for(int i=0;i<3;i++){
    //     string s;
    //     cout<<"Name: ";
    //     cin>>s;
    //     arr[i].setName(s);
    //     cout<<"Age: ";
    //     cin>>arr[i].age;
    //     cout<<"Gender: ";
    //     cin>>arr[i].gender;
    // }
    // cout<<"----------------------------"<<endl;
    // for(int i=0;i<3;i++){
    //     arr[i].printInfo();
    // }

    student a("ronniet",19,0);
    student b("rahul",21,0);
    student c(a);

    if(b==a){
        cout<<"same"<<endl;
    }
    else{
        cout<<"not same"<<endl;
    }
    return 0;
}