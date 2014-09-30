#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{

    // game loop
    while (1) {
        int SX;
        int SY;
        cin >> SX >> SY; cin.ignore();
        int max_id = 0;
        int max_h = 0;
        for (int i = 0; i < 8; i++) {
            int MH; // represents the height of one mountain, from 9 to 0. Mountain heights are 
provided from left to right.
            cin >> MH; cin.ignore();
            if (MH > max_h) {
                max_id = i;
                max_h = MH;
            }
        }

        cout << (SX == max_id ? "FIRE" : "HOLD") << endl;
    }
}
