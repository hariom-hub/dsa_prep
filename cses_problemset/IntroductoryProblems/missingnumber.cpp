#include <iostream>
#include <vector>

using namespace std;

// Converted from GetMissingNumber(int n, long[] nums)
long long getMissingNumber(int n, const vector<long long>& nums) {
    long long numsum = 0;
    long long arrsum = 0;

    // Sum of all numbers from 1 to n
    for (int i = 1; i <= n; i++) {
        numsum = numsum + i;
    }

    // Sum of the elements present in the vector
    for (long long l : nums) {
        arrsum += l;
    }

    return numsum - arrsum;
}

int main() {
    // Optimize standard I/O operations for competitive programming performance
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    if (!(cin >> n)) return 0;

    // Sized exactly to n - 1 since one number is missing (equivalent to Java's long[n-1])
    vector<long long> nums(n - 1);
    for (int i = 0; i < n - 1; i++) {
        cin >> nums[i];
    }

    cout << getMissingNumber(n, nums) << "\n";

    return 0;
}