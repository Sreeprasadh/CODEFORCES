
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
    ll k;
    cin>>n>>k;

    vector<ll> vec(n);
    ll maxi = 0;
    

    for(int i=0; i<n; i++){
        cin>>vec[i];
        maxi = max(maxi, vec[i]);
    }

    ll l = 0, h = maxi + k;
    ll ans = 0;

    while(l <= h){
        ll mid = l + (h-l)/2;
        bool f = false;

        for(int i=0; i<n; i++){
            vector<ll> min_req(n);
            min_req[i] = mid;
            
            ll cnt = 0;

            for(int j=i; j<n; j++){
                
                if(min_req[j] <= vec[j]){
                    break;
                }
                
                if(j+1 >= n){
                    cnt = k+1;
                    break;
                }

                cnt += (min_req[j] - vec[j]);
                min_req[j+1] = max(0LL, min_req[j] - 1);
            }

            if(cnt<=k){
                f = true;
            }
        }

        if(f){
            ans = mid;
            l = mid+1;
        }else{
            h = mid-1;
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