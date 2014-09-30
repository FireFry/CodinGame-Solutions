#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{
    char MESSAGE[100];
    int bn = 0;
    int binary[100 * 8];
    
    gets(MESSAGE);
    
    for (int i = 0; MESSAGE[i]; i++) {
        char ch = MESSAGE[i];
        int x = ch;
        int b = 0;
        int c = 1;
        for (int bit = 0; bit < 7; bit++) {
            b += c * (x % 2);
            c *= 10;
            x /= 2;
        }
        while (c > 1) {
            c /= 10;
            binary[bn++] = (b / c) % 10;
        }
    }
    for (int i = 0; i < bn; i++) {
        fprintf(stderr, "%d", binary[i]);
    }
    fprintf(stderr, "\n");
    
    int count = 1;
    int prev = binary[0];
    for (int i = 1; i <= bn; i++) {
        int x = (i < bn ? binary[i] : 1 - binary[i - 1]);
        if (x == prev) {
            count++;
        } else {
            printf(prev == 0 ? "00 " : "0 ");
            while (count-- > 0) {
                printf("0");
            }
            if (i < bn)
                printf(" ");
            count = 1;
        }
        prev = x;
    }

    // Write an action using printf(). DON'T FORGET THE TRAILING \n
    // To debug: fprintf(stderr, "Debug messages...\n");
}
