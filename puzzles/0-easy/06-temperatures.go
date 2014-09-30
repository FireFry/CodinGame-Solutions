package main

import "fmt"
import "os"
import "bufio"
import "strings"
import "strconv"

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

func main() {
    scanner := bufio.NewScanner(os.Stdin)

    // N: the number of temperatures to analyse
    var N int
    
    scanner.Scan()
    fmt.Sscan(scanner.Text(),&N)
    scanner.Scan()
    a := strings.Fields(scanner.Text()) // the N temperatures expressed as integers ranging from 
-273 to 5526
    if len(a) == 0 {
        fmt.Println(0)
    } else {
        var closest int64 = 6000 * 2
        var closestNum int64 = 6000
        for i := 0; i < len(a); i++ {
            n, _ := strconv.ParseInt(a[i], 10, 16)
            fmt.Fprintln(os.Stderr, n)
            var dist int64 = 0
            if n >= 0 {
                dist = n * 2
            } else {
                dist = (-n) * 2 + 1
            }
            if (dist < closest) {
                closest = dist
                closestNum = n
            }
        }
        fmt.Println(closestNum)// Write answer to stdout
    }
}
