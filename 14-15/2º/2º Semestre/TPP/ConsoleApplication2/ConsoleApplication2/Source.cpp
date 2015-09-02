#include <iostream>

using std::cout;
using std::endl;
using std::cin;

int v[4];
/*v[0] = 2131;
v[3] = 112;*/

void set23(int& number)
{
	number = 23;
}
int main()
{
int i = 10;
set23(i);
cout << "i now contains: " << i << endl;
return 0;
}