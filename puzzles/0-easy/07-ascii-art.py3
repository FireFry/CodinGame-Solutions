
# Read inputs from Standard Input.
# Write outputs to Standard Output.

import sys

l = int(input())
h = int(input())
t = str(input())

alphabet = [str(input()) for i in range(h)]

for i in range(h):
    for ch in t:
        if ch >= 'a' and ch <= 'z':
            x = ord(ch) - ord('a')
        elif ch >= 'A' and ch <= 'Z':
            x = ord(ch) - ord('A')
        else:
            x = ord('z') - ord('a') + 1
            
        for j in range(l):
            print(alphabet[i][x * l + j], end="")
            
    print("")
