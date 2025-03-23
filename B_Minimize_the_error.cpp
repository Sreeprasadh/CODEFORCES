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

// typedef pair<int,int> pt;
// const int N = 3 * 100000 + 15;

// pair<pt,int> a[N];



void solve() {
    int n,k1,k2;
    cin>>n>>k1>>k2;

    vector<int> a(n,0);
    vector<int> b(n,0);

    for(int i=0; i<n; i++){
        cin>>a[i];
    }
    for(int i=0; i<n; i++){
        cin>>b[i];
    }

    priority_queue<ll>pq;

    for(int i=0; i<n; i++){
        pq.push(abs(a[i]-b[i]));
    }
    int k = k1+k2;

    while (k > 0)
    {
        ll el = pq.top();
        pq.pop();

        pq.push(abs(el - 1));
        k--;
    }
    ll res = 0;

    while (!pq.empty())
    {
        ll el = pq.top();
        pq.pop();

        res += (el * el);
    }
    
    cout<<res<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    
    solve();
    
    return 0;
}