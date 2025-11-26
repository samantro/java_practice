
@echo off
setlocal

REM === Configuration ===
set SRC_DIR=src
set OUT_DIR=out

REM Create output directory if it doesn't exist
if not exist "%OUT_DIR%" mkdir "%OUT_DIR%"

echo Finding all .java files under "%SRC_DIR%"...
REM Build a list of source files into sources.txt
dir /s /b "%SRC_DIR%\*.java" > sources.txt

REM If nothing found, exit
for /f %%A in ('find /c /v "" ^< sources.txt') do set COUNT=%%A
if "%COUNT%"=="0" (
    echo No .java files found. Exiting.
    del sources.txt
    exit /b 1
)

echo Compiling %COUNT% files...
REM Compile all sources, place .class files into OUT_DIR
javac -d "%OUT_DIR%" @sources.txt

REM Clean up list file
del sources.txt

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed with error level %ERRORLEVEL%.
    exit /b %ERRORLEVEL%
) else (
    echo Compilation successful! Classes are in "%OUT_DIR%".
)

endlocal
