# class test:
#     def __init__(self,a="Hello World"):
#         self.a=a
#     def display(self):
#         print(self.a)
# obj=test()
# obj.display()


class fruits:
    def __init__(self, price):
        self.price = price
obj=fruits(50)
obj.quantity=10
obj.bags=2
print(obj.quantity+len(obj.__dict__))
