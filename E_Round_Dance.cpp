
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


bool dfs(int node,  unordered_set<ll> adj[], vector<bool> &vis, int parent){
    vis[node] = true;

    for(auto &ngbr : adj[node]){
        if(!vis[ngbr]){
            if(dfs(ngbr,adj,vis,node) == true){
                return true;
            }
        }else if(ngbr != parent){
            return true;
        }
    }
    return false;
}

void solve() {
    int n;
    cin>>n;

    unordered_set<ll> adj[n+1];
    for(int i=0; i<n; i++){
        int a;
        cin>>a;
        a--;
        adj[i].insert(a);
        adj[a].insert(i);
    }
    vector<bool> vis(n,false);
    int cc = 0, cyclecnt = 0;

    for(int i=0; i<n; i++){
        if(!vis[i]){
            bool hasCycle = dfs(i,adj,vis,-1);
            if(hasCycle){
                cyclecnt++;
            }
            cc++;
        }
    }
    cout<<cyclecnt + (cc -cyclecnt > 0 ? 1 : 0) << " ";
    cout<<cc<<endl;
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