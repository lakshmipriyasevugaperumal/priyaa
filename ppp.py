n=int(raw_input("enter limit"))
strings=[]
length=0
for i in range(n):
    strn=raw_input()
    strings.append(strn)
    if i==0:
        length=len(strn)
    if length>=len(strn):
        length=len(strn)
strn=""
for i in range(length):
     test=strings[0][i]
     flag=0
     for k in strings:
         if test!=k[i]:
             flag=1
             break
     if flag==1:
         break
     else:
         strn=strn+test
print "longest prefix is",strn
    
