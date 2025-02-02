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

const ll N = 1e5+7;
const ll mod = 1e9+7;
ll cnt = 0;

vector<vector<ll>> adj(N);
vector<ll> vis(N);

void dfs(ll node){
    vis[node] = 1;
    cnt++;

    for(ll adjNode : adj[node]){
        if(vis[adjNode]==0){
            dfs(adjNode);
        }
    }
}

ll findPow(ll a, ll b, ll m){
    ll ans = 1;

    while (b)
    {
        if(b&1){
            ans = (ans*a)%m;
        }
        b = b/2;
        a = (a*a)%m;
    }
    return ans;
}

void solve() {
   ll n, k;
   cin>>n>>k;

   for(ll i=0; i<n-1; i++){
        ll a, b, c;
        cin>>a>>b>>c;

        if(c == 0){
            adj[a].push_back(b);
            adj[b].push_back(a);
        }
   }

   ll ans = findPow(n,k,mod);
   ans%=mod;
   
   ll rem = 0;
   for(ll i=1; i<=n; i++){
        if(vis[i] == 0){
            cnt = 0;
            dfs(i);
            rem += findPow(cnt,k,mod);
            rem%=mod;
        }
   }

   rem = rem%mod;
   ans = (ans - rem + mod)%mod;
   cout<<ans<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    solve();
    return 0;
}