#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
          vector<int> vec;
        
         int size=digits.size();
          int j = size-1;
        while(j>=0 && digits[j]==9)
          {                    
            vec.push_back(0);
            j--;
          }
        
        if(j<0)
        {
           vec.push_back(1); 
        }
        else if(j>=0 && digits[j]!=9 )
        {
            vec.push_back(digits[j]+1);
            j--;
        }
        while(j>=0)
        {
            vec.push_back(digits[j]);
            j--;
        }
                    
        reverse(vec.begin(),vec.end());
        return(vec);
              
              
    }
};