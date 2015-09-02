#include <iostream>
using namespace std;

int main()
{
	int a;
	int b;
	int c;

	cout << "Enter the value for a: ";
	cin >> a;
	cout << "Enter the value for b: ";
	cin >> b;
	cout << "a: " << a << " b: " << b << endl;
	
	/*
	if (a < b)
	{
		cout << "a is less than b" << endl;
	} else if(b < a) {
		cout << "b is less than a" << endl;
	} else {
	cout << "a and b are the same number" << endl;
	}
	*/

	c = a+b;
	cout << "The result of adding a and b is: " << c << endl;

	return 0;
}
