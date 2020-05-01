class Solution {
 public:
  string stringShift(string s, vector<vector<int>>& shift) {
    int len = (int)s.length();
    string ans{s};
    for (auto pp : shift) {
      shift_once(ans, len, pp);
    }
    return ans;
  }

 private:
  void shift_once(string& s, const int& len, vector<int> pp) {
    if (pp[0] == 1) {
      s = s.substr(len - pp[1], pp[1]) + s.substr(0, len - pp[1]);
    } else {
      s = s.substr(pp[1], len - pp[1]) + s.substr(0, pp[1]);
    }
  }
};