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
    
    int n, m;
    cin>>n>>m;

    int arr[n][2];
    cin>>arr[0][0];
    cin>>arr[0][1];

    for(int i=1; i<n; i++){
        cin>>arr[i][0];
        cin>>arr[i][1];
        arr[i][0] += arr[i-1][0];
        arr[i][1] += arr[i-1][1];
    }

    int peri = 4*m;
    int total = n * peri;

    for(int i=0; i<n-1; i++){
        int x = arr[i][0] + m;
        int y = arr[i][1] + m;

        x = x - arr[i+1][0];
        y = y - arr[i+1][1];

        int newperi = 2 *(x+y);
        total -= newperi;
    }
    cout<<total<<endl;

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