# 🚀 Sorting Algorithms Revision Cheat Sheet

## 1. Selection Sort
**"Select the Minimum"**
* **Logic:** Find the minimum element in the unsorted part and swap it with the first element of that part.
* **Key Step:** Keep track of the `minIndex`.
* **Pros:** Minimal swaps ($N-1$ swaps maximum).

```java
// Selection Sort Implementation
for (int i = 0; i < n - 1; i++) {
    int min = i;
    for (int j = i + 1; j < n; j++) {
        if (nums[j] < nums[min]) {
            min = j;
        }
    }
    // Swap nums[min] and nums[i]
    int temp = nums[min];
    nums[min] = nums[i];
    nums[i] = temp;
}

2. Bubble Sort

"Push the Maximum to the End"

Logic: Repeatedly swap adjacent elements if they are in the wrong order. After each pass, the largest element "bubbles up" to its correct position.

Key Step: Compare nums[j] and nums[j+1].

Optimization: If no swaps occur in a pass, the array is already sorted—break early.

// Bubble Sort Implementation
for (int i = n - 1; i >= 0; i--) {
    boolean didSwap = false;
    for (int j = 0; j < i; j++) {
        if (nums[j] > nums[j + 1]) {
            int temp = nums[j];
            nums[j] = nums[j+1];
            nums[j+1] = temp;
            didSwap = true;
        }
    }
    if (!didSwap) break; // Optimized for O(N) best case
}


3. Insertion Sort"Take and Insert"
Logic: Take an element from the unsorted part and place it in its correct position in the sorted part by shifting elements.
Key Step: Builds the sorted array one item at a time (like sorting cards in your hand).
Pros: Extremely fast ($O(N)$) for nearly sorted data.

// Insertion Sort Implementation
for (int i = 0; i < n; i++) {
    int j = i;
    while (j > 0 && nums[j - 1] > nums[j]) {
        int temp = nums[j - 1];
        nums[j - 1] = nums[j];
        nums[j] = temp;
        j--;
    }
}

Algorithm,Best Case,Average Case,Worst Case,Space,Stable?
Selection,O(N2),O(N2),O(N2),O(1),No
Bubble,O(N)*,O(N2),O(N2),O(1),Yes
Insertion,O(N),O(N2),O(N2),O(1),Yes