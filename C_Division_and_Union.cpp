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

typedef pair<int,int> Point;
typedef pair<Point,int> Segment;

vector<Segment> segments;

bool compare(const Segment &a, const Segment &b){
    if(a.first.second != b.first.second){
        return a.first.second < b.first.second;
    }
    if(a.first.first != b.first.first){
        return a.first.first < b.first.first;
    }
    return a.second < b.second;
}

void solve() {
    
    int n;
    cin>>n;
    
    segments.resize(n);
    for(int i=0; i<n; i++){
        cin>>segments[i].first.first >> segments[i].first.second;
        segments[i].second = i;
    }

    sort(segments.begin() , segments.end() , compare);

    int minX = segments[n-1].first.first;

    for(int i=n-2; i>=0; i--){
        if(segments[i].first.second < minX){
            vector<int>res(n,2);
            for(int j=0; j<=i; j++){
                res[segments[j].second] = 1;
            }

            for(int num : res){
                cout<<num<<" ";
            }
            cout<<"\n";
            return;
        }
        minX = min(minX, segments[i].first.first);
    }
    cout<<-1<<"\n";
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