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

int cnt[200007][26];

int findVal(int u, int v){
    int tot=0,mx = 0;

    for(int i=0; i<26; i++){
        tot += (cnt[u][i]  + cnt[v][i]);
        mx = max(mx, cnt[u][i] + cnt[v][i]);
    }
    return tot - mx;
}

void solve() {
    
    int n, k;
    cin>>n>>k;

    string s;
    cin>>s;

    int res = 0;
    for(int i=0; i<k; i++){
        for(int j=0; j<26; j++){
            cnt[i][j] = 0;
        }
    }

    for(int i=0; i<n; i++){
        cnt[i%k][s[i] - 'a']++;
    }
    
    for(int i=0; i<k ;i++){
        res += findVal(i, k-i-1);
    }
    cout<<res/2<<endl;
    
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