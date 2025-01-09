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
    cin>>n;

    vector<int> vec(n);
    vector<vector<int>> ind(n+1);
    for(int i=0; i<n; i++){
        cin>>vec[i];

        ind[vec[i]].PB(i+1);
    }

    vector<int> res(n+2, n+n);

    for(int i=1; i<=n; i++){
        int start = 0;
        int mx = 0;

        for(int j : ind[i]){
            mx = max(mx, j-start);
            start = j;
        }
        //imaginary indices 0 and n+1 [Actual indices are from 1 to n]
        //so even if a gap is not present it will have the maximum value and won't be considered.
        mx = max(mx, (n+1)-start);
        res[mx] = min(res[mx], i);
    }

    int mn = n+n;

    for(int i=1; i<=n; i++){
        mn = min(mn, res[i]);

        if(mn>n){
            cout<<-1<<" ";
        }else{
            cout<<mn<<" ";
        }
    }
    cout<<endl;
   
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