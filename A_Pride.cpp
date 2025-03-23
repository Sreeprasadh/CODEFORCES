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

int findSmallest(vector<ll> &vec, int n){
    int minLen = n+1;

    for(int i=0; i<n; i++){
        ll cur = vec[i];

        if(cur == 1){
           return 1;
        }
        
        for(int j=i; j<n; j++){
            cur = __gcd(cur, vec[j]);

            if(cur == 1){
                minLen = min(minLen, j - i );
                break;
            }
        }
    }

    return (minLen == n+1) ? -1 : minLen;
}

void solve() {
    int n;
    cin >> n;

    vector<ll> vec(n,0);
    int cnt = 0;

    for(int i=0; i<n; i++){
        cin>>vec[i];
        if(vec[i] == 1){
            cnt++;
        }
    }

    if(cnt > 0){
        cout<<n-cnt<<endl;
        return;
    }

    int smallest = findSmallest(vec,n);

    if(smallest == -1){
        cout<<-1<<endl;
        return;
    }

    cout<< smallest + (n-1) << endl;
}


int main() {
    fast_io(); // Enable fast I/O
    
    solve();
    
    return 0;
}