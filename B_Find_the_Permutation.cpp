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

// Define a custom comparator
struct Compare {
    bool operator()(const pair<int, int>& a, const pair<int, int>& b) {
        if (a.first == b.first) {
            // If the first elements are equal, the one with the higher second element comes first
            return a.second < b.second;
        }
        // Otherwise, the smaller first element comes first
        return a.first > b.first;
    }
};

void solve() {
    
    int n;
    cin>>n;
    vector<vector<int>> adj(n+1);

    for(int i=1; i<=n; i++){
        string s;
        cin>>s;

        for(int j=0; j<n; j++){
            if(s[j] == '1'){
                adj[i].push_back(j+1);
                adj[j+1].push_back(i);
            }
        }
    }

    priority_queue<pair<int,int> , vector<pair<int,int>>, Compare> min_heap;

    for(int i=1; i<=n; i++){
        min_heap.push({adj[i].size(),i});
    }

    while (!min_heap.empty())
    {
        int pp = min_heap.top().second;
        min_heap.pop();

        cout<<pp<<" ";
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