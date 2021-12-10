import os

def compile_java_file(java_file):
    print ("\n\tCompiling " + java_file)
    os.system("javac " + java_file + " -d .\\bin")
    print ("\tCompiling " + java_file +" Completed")

def compile(file_name, bin_location):
    java_file = file_name + ".java"
    class_file = file_name + ".class"
    is_compiled = False

    if (os.path.exists(bin_location + "\\" + class_file)):
        modified_time_java_file = os.path.getmtime(java_file)
        modified_time_class_file = os.path.getmtime(bin_location + "\\" + class_file)

        if (modified_time_class_file > modified_time_java_file):
            print ("\n\t" + java_file + " was already Compiled")
            is_compiled = True

    if not (is_compiled):
        compile_java_file(java_file)

def main():
    # Define Variables
    bin_location = ".\\bin"
    file_name_list = ["ObserverPatternDemo"]

    print("-------- Start Compiling Visitor Pattern Java files --------")

    if not (os.path.exists(bin_location)):
        os.mkdir(bin_location)
        print("\tBin dir created")

    for file_name in file_name_list:
        compile(file_name, bin_location)

    print("-------- Complete the Visitor Pattern Compilation Successfully --------")


if __name__ == "__main__":
    main()