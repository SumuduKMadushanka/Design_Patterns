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
:ComputerComponent_Java
if exist .\bin\ComputerComponent.class (
    GOTO :ComputerComponent_Has_Class
) else (
    GOTO :Compile_ComputerComponent
)

:ComputerComponent_Has_Class
copy .\ComputerComponent.java .\temp_compile
copy .\bin\ComputerComponent.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D ComputerComponent.java ComputerComponent.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="ComputerComponent.java" (
    GOTO :Compile_ComputerComponent
) else (
    echo ComputerComponent.java already Compiled
    GOTO :Hardware_Java
)

:Compile_ComputerComponent
echo Compiling ComputerComponent.java...
javac ComputerComponent.java -d .\bin
echo Compiling ComputerComponent.java Completed

:Hardware_Java
if exist .\bin\Hardware.class (
    GOTO :Hardware_Has_Class
) else (
    GOTO :Compile_Hardware
)

:Hardware_Has_Class
copy .\Hardware.java .\temp_compile
copy .\bin\Hardware.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D Hardware.java Hardware.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="Hardware.java" (
    GOTO :Compile_Hardware
) else (
    echo Hardware.java already Compiled
    GOTO :Monitor_Java
)

:Compile_Hardware
echo Compiling Hardware.java...
javac Hardware.java -d .\bin
echo Compiling Hardware.java Completed

:Monitor_Java
if exist .\bin\Monitor.class (
    GOTO :Monitor_Has_Class
) else (
    GOTO :Compile_Monitor
)

:Monitor_Has_Class
copy .\Monitor.java .\temp_compile
copy .\bin\Monitor.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D Monitor.java Monitor.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="Monitor.java" (
    GOTO :Compile_Monitor
) else (
    echo Monitor.java already Compiled
    GOTO :Display_Java
)

:Compile_Monitor
echo Compiling Monitor.java...
javac Monitor.java -d .\bin
echo Compiling Monitor.java Completed

:Display_Java
if exist .\bin\Display.class (
    GOTO :Display_Has_Class
) else (
    GOTO :Compile_Display
)

:Display_Has_Class
copy .\Display.java .\temp_compile
copy .\bin\Display.class .\temp_compile
cd .\temp_compile
For /F %%i IN ('DIR /B /O:D Display.java Display.class') DO SET NEWEST=%%i
cd ..

if "%NEWEST%"=="Display.java" (
    GOTO :Compile_Display
) else (
    echo Display.java already Compiled
    GOTO :VisitorPatternDemo_Java
)

:Compile_Display
echo Compiling Display.java...
javac Display.java -d .\bin
echo Compiling Display.java Completed

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