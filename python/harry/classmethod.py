class employee:
    company = "apple"
    def show(self):
        print(f"the name is {self.name} and the company is {self.company}")

    def changecompany(cls,newcompany):
        cls.company= newcompany


e1= employee()
e1.show()