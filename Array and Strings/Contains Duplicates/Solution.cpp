#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
     int size=nums.size();
     std::set<int> myset;
     std::pair<std::set<int>::iterator,bool> ret;
        for (int i=0; i<size; ++i){ 
        ret = myset.insert(nums[i]); 
        if(ret.second==false)return(true); 
            }
        return(false); 

    }
};