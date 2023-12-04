dict={}
total =int(input("enter the strangth of the class"))
for i in range(0,total):
    key=input("enter the student reg_no : ")
    sub1=int(input("enter the mark of 1st sub :  "))
    sub2=int(input("enter the mark of 2nd sub :  "))
    sub3=int(input("enter the mark of 3rd sub :  "))
    sub4=int(input("enter the mark of 4tt sub :  "))
    sub5=int(input("enter the mark of 5th sub :  "))
    asub=[sub1,sub2,sub3,sub4,sub5]
    dict1[key]=asub
    percent=(sum(asub)/500)*100
    print("percentage of ", key , " is : " , percent)

print("Students marks" ,dict)


