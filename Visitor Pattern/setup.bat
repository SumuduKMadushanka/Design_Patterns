:: Visitor Pattern Compile file
@echo OFF

:: Compile the java files
echo Start Compiling Visitor Pattern Java files...
mkdir temp_compile
if exist .\bin\ (
    GOTO :Start_Compilation
) else (
    mkdir bin
    echo bin dir created
)

:Start_Compilation

:VisitorPatternDemo_Java
if exist .\bin\VisitorPatternDemo.class (
    GOTO :VisitorPatternDemo_Has_Class
) else (
    GOTO :Compile_VisitorPatternDemo
)

:VisitorPatternDemo_Has_Class
copy .\VisitorPatternDemo.java .\temp_compile
copy .\bin\VisitorPatternDemo.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D VisitorPatternDemo.java VisitorPatternDemo.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="VisitorPatternDemo.java" (
    GOTO :Compile_VisitorPatternDemo
) else (
    echo VisitorPatternDemo.java already Compiled
    GOTO :End_Compilation
)

:Compile_VisitorPatternDemo
echo Compiling VisitorPatternDemo.java...
javac VisitorPatternDemo.java -d .\bin
echo Compiling VisitorPatternDemo.java Completed

:End_Compilation
echo Complete the Visitor Pattern Compilation Successfully
rmdir /s /q .\temp_compile

pause