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

void normalize(pair<int,int> &p){
    if(p.first < 0){
        p.first *= -1;
        p.second *= -1;
    }else if(p.first == 0 && p.second < 0){
        p.second *= -1;
    }

    int gcd = __gcd(abs(p.first), abs(p.second));
    p.first/=gcd;
    p.second/=gcd;
}

map<pair<int,int>,int> mp;

void solve() {
    int n;
    cin>>n;

    vector<ll> a(n);
    vector<ll> b(n);

    for(int i=0; i<n; i++){
        cin>>a[i];
    }
    for(int i=0; i<n; i++){
        cin>>b[i];
    }

 
    int maxi = 0;
    int cnt0 = 0;

    for(int i=0; i<n; i++){
        if(a[i] == 0){
            if(b[i] == 0){
                cnt0++;
            }
        }else{
            pair<int,int> p = make_pair(-b[i],a[i]);
            normalize(p);
            mp[p]++;

            maxi = max(maxi,mp[p]);
        }
    }

    cout<< cnt0 + maxi<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    solve();
    return 0;
}