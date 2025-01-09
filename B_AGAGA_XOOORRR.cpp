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


void solve() {
    
    int n;
    cin >> n;

    vector<ll> arr(n);
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    bool ff = false;

    for(int i=0; i<n-1; i++){

        ll _xor = 0;

        for(int j=0; j<=i; j++){
            _xor ^= arr[j];
        }

        ll nextXor = 0;
        bool f = false;
        for(int j=i+1; j<n; j++){
            nextXor ^= arr[j];

            if(nextXor == _xor){
                f = true;
                nextXor = 0;
            }
        }

        if(f==true && nextXor == 0){
            ff = true;
            break;
        }
    }

    cout<<(ff ? "YES " : "NO ") << '\n';
}

int main() {
    fast_io(); // Enable fast I/O

    int t; 
    cin >> t;
    while (t--) {
        solve();
    }

    return 0;
}
