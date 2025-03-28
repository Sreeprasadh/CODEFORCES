#include <bits/stdc++.h>
using namespace std;

// Type aliases for convenience
using ll = long long;
using ld = long double;
//using pii = pair<int, int>;
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

vector<vector<int>> adj;
vector<bool> vis;
vector<int> subtreeSize;

void dfs(int node){
    vis[node] = true;
    subtreeSize[node] = 1;

    for(int ngbr : adj[node]){
        if(!vis[ngbr]){
            dfs(ngbr);
            subtreeSize[node] += subtreeSize[ngbr];
        }
    }
}

void solve() {
   int n;
   cin>>n;

   if(n%2 != 0){
        cout<<-1 <<endl;
        return;
   }

   adj.resize(n+1);
   vis.resize(n+1, false);
   subtreeSize.resize(n+1, 0);

   for(int i=0; i<n; i++){
        int u,v;
        cin>>u>>v;

        adj[u].push_back(v);
        adj[v].push_back(u);
   }

   dfs(1);
   int cnt = 0;

   for(int i=1; i<=n; i++){
        if(subtreeSize[i]%2 == 0){
            cnt++;
        }
   }

   cout<<cnt-1<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    
    solve();
    
    return 0;
}