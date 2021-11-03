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
:ComputerPartVisitor_Java
if exist .\bin\ComputerPartVisitor.class (
    GOTO :ComputerPartVisitor_Has_Class
) else (
    GOTO :Compile_ComputerPartVisitor
)

:ComputerPartVisitor_Has_Class
copy .\ComputerPartVisitor.java .\temp_compile
copy .\bin\ComputerPartVisitor.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D ComputerPartVisitor.java ComputerPartVisitor.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="ComputerPartVisitor.java" (
    GOTO :Compile_ComputerPartVisitor
) else (
    echo ComputerPartVisitor.java already Compiled
    GOTO :ComputerParts_Java
)

:Compile_ComputerPartVisitor
echo Compiling ComputerPartVisitor.java...
javac ComputerPartVisitor.java -d .\bin
echo Compiling ComputerPartVisitor.java Completed

:ComputerParts_Java
if exist .\bin\ComputerParts.class (
    GOTO :ComputerParts_Has_Class
) else (
    GOTO :Compile_ComputerParts
)

:ComputerParts_Has_Class
copy .\ComputerParts.java .\temp_compile
copy .\bin\ComputerParts.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D ComputerParts.java ComputerParts.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="ComputerParts.java" (
    GOTO :Compile_ComputerParts
) else (
    echo ComputerParts.java already Compiled
    GOTO :KeyBoard_Java
)

:Compile_ComputerParts
echo Compiling ComputerParts.java...
javac ComputerParts.java -d .\bin
echo Compiling ComputerParts.java Completed

:KeyBoard_Java
if exist .\bin\KeyBoard.class (
    GOTO :KeyBoard_Has_Class
) else (
    GOTO :Compile_KeyBoard
)

:KeyBoard_Has_Class
copy .\KeyBoard.java .\temp_compile
copy .\bin\KeyBoard.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D KeyBoard.java KeyBoard.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="KeyBoard.java" (
    GOTO :Compile_KeyBoard
) else (
    echo KeyBoard.java already Compiled
    GOTO :VisitorPatternDemo_Java
)

:Compile_KeyBoard
echo Compiling KeyBoard.java...
javac KeyBoard.java -d .\bin
echo Compiling KeyBoard.java Completed

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