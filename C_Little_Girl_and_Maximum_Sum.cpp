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
    int n,q;
    cin>>n>>q;
    
    vector<int> arr(n);
    vector<int> frq(n+1);

    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    for(int i=0; i<q; i++){
        int l,r;
        cin>>l>>r;
        l--;

        frq[l]++;
        frq[r]--;
    }

    for(int i=1; i<=n; i++){
        frq[i] += frq[i-1];
    }

    sort(begin(frq),end(frq));
    sort(begin(arr),end(arr));

    ll sum  = 0;

    for(int i=1 ; i<=n; i++){
        sum += (ll)frq[i] * arr[i-1];
    }

    cout<<sum<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    
    solve();
    
    return 0;
}