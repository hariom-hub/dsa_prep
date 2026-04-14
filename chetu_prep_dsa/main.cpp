#include <bits/stdc++.h>
using namespace std;


int updatevalue(int *x){
    
    
    *x = 100;
    return *x;
}
int main() {
	// your code goes here
	
	int a = 10;
	cout<<"updated value = "<<updatevalue(&a)<<endl;
	return 0;

}
