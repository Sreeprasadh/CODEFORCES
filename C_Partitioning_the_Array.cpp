
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
    vector<int> arr(n);
    
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    int res = 0;

    for(int i=1; i<=n; i++){
        if(n%i == 0){
            int k = n/i , g = 0;

            for(int j=0; j<k; j++){
                int diff = 0;

                for(int l=j; l<n; l+=k){
                    diff = __gcd(diff, abs(arr[l]-arr[j]));
                }
                g = __gcd(g,diff);
            }

            if(g!=1){
                res++;
            }
        }
    }
    cout<<res<<endl;
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