# Problem Definition

## Description

Following code tries to figure out if a number is prime [Wiki](https://www.wikiwand.com/en/Prime_number). However, it has a bug in it. Please correct the bug and then submit the code.

```Java
public class Solution {
    public int isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }
}
```

## Notes