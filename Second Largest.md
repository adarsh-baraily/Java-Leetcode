## 01. Second Largest

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/second-largest3735/1)

### Problem Description

**Task:** Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.Note: The second largest element should not be equal to the largest element.Examples:Input: arr[] = [12, 35, 1, 10, 34, 1]

#### Examples

##### Example 1

- **Output:**
```text
-1
```
- **Explanation:** The largest element of the array is 10 and the second largest element does not exist.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (3)

#### Solution 1 (Java)

- **Submitted:** 2026-11-26 00:09:28
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int getSecondLargest(int[] arr) {
        
        int n = arr.length;
        Arrays.sort(arr);
        
        int sl = -1;
        int l = arr[n - 1];
        for(int j = n - 2; j >= 0; j--) {
            if(arr[j] != l) {
                sl = arr[j];
                break;
            }
        }
        return sl;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-11-26 00:09:15
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int getSecondLargest(int[] arr) {
        
        int n = arr.length;
        Arrays.sort(arr);
        
        int sl = -1;
        int l = arr[n - 1];
        for(int j = n - 2; j >= 0; j--) {
            if(arr[j] != l) {
                sl = arr[j];
                break;
            }
        }
        return sl;
    }
}
```

#### Solution 3 (Java)

- **Submitted:** 2026-11-25 23:58:44
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public int getSecondLargest(int[] arr) {
        
        int n = arr.length;
        Arrays.sort(arr);
        
        int sl = -1;
        int l = arr[n - 1];
        for(int j = n - 2; j >= 0; j--) {
            if(arr[j] != l) {
                sl = arr[j];
                break;
            }
        }
        return sl;
    }
}
```

*Generated on: 11/26/2026, 12:11:48 AM*