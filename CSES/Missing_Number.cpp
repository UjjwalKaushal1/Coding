#include<bits/stdc++.h>
using namespace std;
long long sum(long long n)
{
    return (n*(n+1))/2;
}
int main()
{
    long long n;
    cin >> n;

    long s = 0;
    vector<long long> v(n-1);
    for(int i = 0; i<n-1; i++)
    {
        cin >> v[i];
        s += v[i];
    }
    long long ts = sum(n);
    cout << ts - s;
}