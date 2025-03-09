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

typedef pair<int,int> pt;
const int N = 3 * 100000 + 15;

pair<pt,int> a[N];

void solve() {
    int n;
    cin>>n;

    for(int i=0; i<n; i++){
        cin>>a[i].first.first;
        cin>>a[i].first.second;
        a[i].second = i+1;
    }

    sort(a,a+n,[](const pair<pt,int> &x, const pair<pt,int> &y){
        if(x.first.first != y.first.first){
            return x.first.first > y.first.first;
        }
        return x.first.second < y.first.second;
    });
    //bool found = false;
    vector<int> res(2, -1);

    for(int i=0; i<n-1; i++){
        if(a[i].first.first >= a[i+1].first.first && a[i].first.second <= a[i+1].first.second){
            //found = true;
            res[0] = a[i].second;
            res[1] = a[i+1].second;
            break;
        }
    }
    cout<<res[0]<<" "<<res[1]<<endl;
}

int main() {
    fast_io(); // Enable fast I/O
    
    solve();
    
    return 0;
}