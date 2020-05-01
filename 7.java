class Solution {
public:
    int countElements(vector<int>& arr) {
        vector <int> inc_arr;
        int res =0;
        for(int i=0;i<arr.size();i++)
        {
            inc_arr.push_back(arr[i]+1);
        }
        for(int i =0;i<arr.size();i++)
        {
            auto it = find(arr.begin(),arr.end(),inc_arr[i]);
            if(it!= arr.end())
                res++;
        }
        return res;
    }
};