import itertools 
def m(x):
    perms = set(itertools.permutations(x))
    for i in perms:
        pretty_perms = ",".join(i)
        print(pretty_perms)
    

x = ['N','I','S','I','D','H']
m(x)

