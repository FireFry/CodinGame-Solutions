import System.IO
import Control.Monad

main :: IO ()
main = do
    hSetBuffering stdout NoBuffering -- DO NOT REMOVE
    
    -- Auto-generated code below aims at helping you parse
    -- the standard input according to the problem statement.
    
    input_line <- getLine
    let input = words input_line
    let lx = read (input!!0) :: Int -- the X position of the light of power
    let ly = read (input!!1) :: Int -- the Y position of the light of power
    let tx = read (input!!2) :: Int -- Thor's starting X position
    let ty = read (input!!3) :: Int -- Thor's starting Y position
    loop lx ly tx ty

loop :: Int -> Int -> Int -> Int -> IO ()
loop lx ly tx ty = do
    input_line <- getLine
    let e = read input_line :: Int -- The level of Thor's remaining energy, representing the 
number of moves he can still make.
    
    let dx = signum (lx - tx)
    let dy = signum (ly - ty)
    
    -- hPutStrLn stderr "Debug messages..."
    
    -- A single line providing the move to be made: N NE E SE S SW W or NW
    putStrLn ((vertical dy) ++ (horizontal dx))
    
    loop lx ly (tx+dx) (ty+dy)
    
horizontal :: Int -> [Char]
horizontal (-1) = "W"
horizontal 0 = ""
horizontal 1 = "E"

vertical :: Int -> [Char]
vertical (-1) = "N"
vertical 0 = ""
vertical 1 = "S"
