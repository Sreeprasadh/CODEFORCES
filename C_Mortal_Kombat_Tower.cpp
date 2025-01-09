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

int N;
int dp[200006][2];

int findMinsteps(vector<int> &a, int i, int turn){

    if(i >= N){
        return 0;
    }

    if(dp[i][turn] != -1){
        return dp[i][turn];
    }

    if(turn){
        int mini = INF;
        if(i<N && a[i] == 1){
            mini = min(mini, 1+ findMinsteps(a,i+1,turn^1));
        }
        if(i<N && a[i] == 0){
            mini = min(mini, findMinsteps(a,i+1, turn^1));
        }
        if(i+1<N && a[i] == 1 && a[i+1] == 1){
            mini = min(mini, 2 +findMinsteps(a, i+2, turn^1));
        }
        if(i+1<N && a[i] == 0 && a[i+1] == 0){
            mini = min(mini, findMinsteps(a, i+2, turn^1));
        }
        if(i+1<N && a[i] == 0 && a[i+1] == 1){
            mini = min(mini, 1 + findMinsteps(a, i+2, turn^1));
        }
        if(i+1<N && a[i] == 1 && a[i+1] == 0){
            mini = min(mini, 1 + findMinsteps(a, i+2, turn^1));
        }

        return dp[i][turn] =  mini;
    }else{
        int mini = INF;
        mini = min(findMinsteps(a, i+1,turn^1), findMinsteps(a, i+2, turn^1));
        return dp[i][turn] =  mini;
    }
    
}

void solve() {
    
    int n;
    cin >> n;
    N = n;

    vector<int>a(n,0);
    FOR(i, 0, n){
        cin>>a[i];
    }
    memset(dp,-1,sizeof(dp));

    int cnt = findMinsteps(a,0,1);
    cout<<cnt<<endl;    
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