@echo off
setlocal enabledelayedexpansion

echo search for .swift files in the current folder and subfolders...
echo.

set /a count=0

for /r %%i in (*.swift) do (
    set "filename=%%~ni"
    set "path=%%~dpi"
    
    echo rename: %%i
    echo to: !path!!filename!.java
    ren "%%i" "!filename!.java"
    echo.
    
    set /a count+=1
)

echo.
echo done! renamed files: %count%
echo.
pause