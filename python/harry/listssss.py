# l=[3,5,7]
# print(l)
# print(l[1])

# lst=[i*i for i in range (7) if i%2!=0]
# print(lst)
a=[1,4,6,8,3,8,2,7]
# a.append(0)
# a.sort()
# a.reverse()
print(a.index(3))
print(a.count(8))

m=a.copy()
m[0]=0
print(a)
a.insert(7,"thala")
print(a)
b=[12,23,34,45,56,67]
a.extend(b)
print(a)
c=a+b
print(c)