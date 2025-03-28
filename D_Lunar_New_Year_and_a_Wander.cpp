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
#define N 300010

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

priority_queue<int, vector<int>, greater<int>> pq;
vector<int> adj[N];
vector<int> res;
bool vis[N];
int n, m;



void solve() {

    cin>>n>>m;

    for(int i=0; i<m; i++){
        int a, b;
        cin>>a>>b;

        adj[a].push_back(b);
        adj[b].push_back(a);
    }

    pq.push(1);
    vis[1] = true;

    while (!pq.empty())
    {
        int node = pq.top();
        pq.pop();

        res.push_back(node);

        for(int adjNode : adj[node]){
            if(!vis[adjNode]){
                pq.push(adjNode);
                vis[adjNode] = true;
            }
        }
    }
    
    for(auto node :res){
        cout<<node<<" ";
    }
    cout<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    solve();
    return 0;
}