
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

vector<int> ways(10,0);

void solve() {
    string s;
    long long pos;

    cin>>s;
    cin>>pos;

    int n = s.size();
    
    vector<char> st;
    s += '$';
    pos--;
   

    bool ok = pos < n;

    for(char c : s){
        while (!ok && st.size() > 0 && st.back() > c)
        {
            pos = pos - n;
            n--;
            st.pop_back();

            if(pos < n){
                ok = true;
            }
        }
        st.push_back(c);
    }

    cout<<st[pos];
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