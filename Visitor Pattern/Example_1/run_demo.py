import os

error_colour = "\033[91m"
end_colour = "\033[0m"

if (os.path.exists(".\\bin\\VisitorPatternDemo.class")):
    os.chdir(".\\bin")
    os.system("java VisitorPatternDemo")
    os.chdir("..")

else:
    print (error_colour + "ERROR: VisitorPatternDemo.class file not found" + end_colour)