#include <bits/stdc++.h>
using namespace std;

// Type aliases for convenience
using ll = long long;
using ld = long double;
using pii = pair<int, int>;
using pll = pair<ll, ll>;
using vi = vector<int>;
using vll = vector<ll>;

// Constants
const int INF = 1e9 + 7;
const ll LINF = 1e18;
const int MOD = 1e9 + 7; // Common modulus for modular arithmetic
const ld EPS = 1e-9;

// Macros for loops and utilities
#define FOR(i, a, b) for (int i = (a); i < (b); ++i)
#define RFOR(i, a, b) for (int i = (a); i >= (b); --i)
#define ALL(v) (v).begin(), (v).end()
#define SZ(v) ((int)(v).size())
#define PB push_back
#define MP make_pair

// Fast I/O
void fast_io() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
}

// Debugging utility (enable during testing)
#ifdef DEBUG
#define debug(x) cerr << #x << " = " << (x) << endl
#else
#define debug(x)
#endif

vector<ll> findSegments(vector<int> a){
    int n = a.size();
    int i=0;
    vector<ll> res(n+1);

    while (i<n)
    {
       if(a[i] == 0){
            i++;
            continue;
       }
       
       int j = i;

       while (j<n && a[j] ==1)
       {
            j++;
       }
    
       for(int len=1; len<=j-i; len++){
            res[len] += j-i-len+1;
       }
       i = j;
    }
    return res;
}

void solve() {
    int n,m;
    ll k;
    cin>>n>>m>>k;

    vector<int> a(n);
    vector<int> b(m);

    for(int& x:a){
        cin>>x;
    }

    for(int& x:b){
        cin>>x;
    }

    auto aa = findSegments(a);
    auto bb = findSegments(b);

    ll cnt = 0;

    for(int i=1; i<aa.size(); i++){
        if(k%i == 0 && k/i <= m){
            cnt += aa[i] * bb[k/i];
        }
    }
    cout<<cnt<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    solve();
    return 0;
}