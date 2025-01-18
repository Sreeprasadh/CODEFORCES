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
    vector<vector<int>> adj(n);
    int ans[n+1];
    memset(ans, -1, sizeof(ans));

    for(int i=1; i<n; i++){
        int u,v;
        cin>>u;
        cin>>v;
        u--;
        v--;
        adj[u].push_back(i);
        adj[v].push_back(i);
    }

    int vv = 0;

    for(int i=0; i<n; i++){
        if(adj[i].size() > 2){
            ans[adj[i][0]] = 0;
            ans[adj[i][1]] = 1;
            ans[adj[i][2]] = 2;
            vv = 3;
            break;
        }
    }

    for(int i=1; i<n; i++){
        if(ans[i] == -1){
            ans[i] = vv;
            vv++;
        }
    }

    for(int i=1; i<n; i++){
        cout<<ans[i]<<endl;
    }
    
}

int main() {
    fast_io(); // Enable fast I/O   
    solve();
    return 0;
}