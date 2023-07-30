import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

message = input()
char =message
s=""
for i in range (len(char)):
 s=s+f'{ord(char[i]):07b}'

ch1=s
l=[]

while (True):
 if (ch1==""):
     break
 else :
    if (ch1[0]=='1') :
        i =ch1.find('0')
        if(i== -1):
            temp =ch1[0:len(ch1)]
            ch1=""
        else:
         temp =ch1[0:i]
         ch1= ch1[i:len(ch1)]
        l.append(temp)
    else:
        j =ch1.find('1')
       
        if(j== -1) :
            
          temp =ch1[0:len(ch1)]
          ch1=""
        else :
         temp =ch1[0:j]
         ch1=ch1[j:len(ch1)]
        l.append(temp)
      
        


output=""
for i in range (len(l)):
    temp=l[i]
    if (temp[0]=='1'):
        output = output +'0'+' '
        
        k=len(temp)
       
        output=output +'0'*k +' '
    else :
        output=output +'00'+' '
        
        k=len(temp)
        output=output +'0'*k +' '
        
print(output[:-1])    