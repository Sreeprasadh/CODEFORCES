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

    ll weights[n+1];
    ll ans = 0;

    FOR(i,1,n+1){
        cin>> weights[i];
        ans+= weights[i];
    }

    vector<int> indegree(n+1);
    FOR(i,1,n){
        int x, y;
        cin>>x>>y;

        indegree[x]++;
        indegree[y]++;
    }

    priority_queue<pair<int,int>> pq; 
    FOR(i, 1, n+1){
        indegree[i]--;
        if(indegree[i] >0){
            pq.push({weights[i], indegree[i]});
        }
    }

    cout<<ans<<" ";
    FOR(i, 2, n){
        
        pair<int, int> p = pq.top();
        pq.pop();
        ans += p.first;
        p.second = p.second-1;
      
        if(p.second > 0){
            pq.push(p);
        } 
        cout<<ans<<" ";
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