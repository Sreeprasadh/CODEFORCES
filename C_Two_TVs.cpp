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
    int n;
    cin>>n;
    vector<vector<int>> vec(n, vector<int>(2));

    for(int i=0; i<n; i++){
        cin>>vec[i][0];
        cin>>vec[i][1];
    }

    sort(begin(vec),end(vec));

    if(n<=2){
        cout<<"YES "<<endl;
        return;
    }

    int prevE1 = vec[0][1];
    int prevE2 = vec[1][1];

    bool f = true;

    for(int i=2; i<n; i++){
        if(vec[i][0] <= prevE1 && vec[i][0] <= prevE2){
            f = false;
            break;
        }
        
        if(vec[i][0] > prevE1){
            prevE1 = vec[i][1];
        }else{
            prevE2 = vec[i][1];
        }
    }

    if(f==true){
        cout<<"YES "<<endl;
    }else{
        cout<<"NO "<<endl;
    }
}

int main() {
    fast_io(); // Enable fast I/O
    
    solve();
    
    return 0;
}