#include<iostream>
using namespace std;
int main()
{
  float a,d;
  int b,c;
  std::cin>>a>>b>>c;
  d = a*b;
  if (c>=d){
    std::cout<<"Cannot reach";
  }
  else{
  	std::cout<<"Can reach";
  }  
}