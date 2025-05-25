
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
    int n,m;
    cin>>n>>m;

    vector<pii> seg(m);

    for(int i=0; i<m; i++){
        int l,r;
        cin>>l>>r;
        l--;
        seg[i] = {l,r};
    }

    int q;
    cin>>q;

    vector<int> changes(q);
    for(int i=0; i<q; i++){
        cin>>changes[i];
        changes[i]--;
    }

    int l = 1, h = q;
    int ans = -1;

    while(l <= h){
        int mid = l + (h-l)/2;

        vector<int> cur(n,0);
        for(int i=0; i<mid; i++){
            cur[changes[i]] = 1;
        }

        vector<int> prefix(n+1, 0);

        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i] + cur[i];
        }

        bool f = false;
        for(auto &sg : seg){
            int cnt = prefix[sg.second] - prefix[sg.first];
            if(cnt > (sg.second - sg.first)/2){
                f = true;
                break;
            }
        }

        if(f){
            ans = mid;
            h = mid -1;
        }else{
            l = mid+1;
        }
    }
    cout<<ans<<endl;
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