import sys 
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

l = int(input())
h = int(input())
ch= input()

alphabet = [str(input()) for i in range(h)]


for i in range(h):
    for t in ch :
     if (t>='a') and (t<='z'):
        x= ord(t)-ord('a')
     elif (t>='A') and (t<='Z'):  
        x= ord(t)- ord('A') 
     else  :
        x = ord('z') - ord('a') + 1   
     for j in range(l)    :
        print(alphabet[i][x * l + j], end="")
    print("")    