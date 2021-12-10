import os

error_colour = "\033[91m"
end_colour = "\033[0m"

if (os.path.exists(".\\bin\\ObserverPatternDemo.class")):
    os.chdir(".\\bin")
    os.system("java ObserverPatternDemo")
    os.chdir("..")

else:
    print (error_colour + "ERROR: ObserverPatternDemo.class file not found" + end_colour)