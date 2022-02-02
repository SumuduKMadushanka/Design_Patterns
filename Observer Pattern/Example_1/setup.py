import os
import json

def load_configs(file_name):
    conf_file = open(file_name)
    data = json.load(conf_file)
    conf_file.close()

    return data

def compile_java_file(java_file, bin_location = ".\\bin"):
    print ("\n\tCompiling " + java_file)
    os.system("javac " + java_file + " -d " + bin_location)
    print ("\tCompiling " + java_file +" Completed")

def compile(file_name, bin_location = ".\\bin"):
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
        compile_java_file(java_file, bin_location)

def main():
    # Load Configs
    configs = load_configs("configs.json")
    project_name = configs["project_name"]
    bin_location = configs["bin_location"]
    file_name_list = configs["file_name_list"]

    print("-------- Start Compiling " + project_name + " Java files --------")

    if not (os.path.exists(bin_location)):
        os.mkdir(bin_location)
        print("\tBin dir created")

    for file_name in file_name_list:
        compile(file_name, bin_location)

    print("-------- Complete the " + project_name + " Compilation Successfully --------")


if __name__ == "__main__":
    main()