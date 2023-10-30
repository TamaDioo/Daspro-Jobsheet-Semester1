@echo off
rem START or STOP Services
rem ----------------------------------
rem Check if argument is STOP or START

if not ""%1"" == ""START"" goto stop

if exist D:\Instalasi\hypersonic\scripts\ctl.bat (start /MIN /B D:\Instalasi\server\hsql-sample-database\scripts\ctl.bat START)
if exist D:\Instalasi\ingres\scripts\ctl.bat (start /MIN /B D:\Instalasi\ingres\scripts\ctl.bat START)
if exist D:\Instalasi\mysql\scripts\ctl.bat (start /MIN /B D:\Instalasi\mysql\scripts\ctl.bat START)
if exist D:\Instalasi\postgresql\scripts\ctl.bat (start /MIN /B D:\Instalasi\postgresql\scripts\ctl.bat START)
if exist D:\Instalasi\apache\scripts\ctl.bat (start /MIN /B D:\Instalasi\apache\scripts\ctl.bat START)
if exist D:\Instalasi\openoffice\scripts\ctl.bat (start /MIN /B D:\Instalasi\openoffice\scripts\ctl.bat START)
if exist D:\Instalasi\apache-tomcat\scripts\ctl.bat (start /MIN /B D:\Instalasi\apache-tomcat\scripts\ctl.bat START)
if exist D:\Instalasi\resin\scripts\ctl.bat (start /MIN /B D:\Instalasi\resin\scripts\ctl.bat START)
if exist D:\Instalasi\jetty\scripts\ctl.bat (start /MIN /B D:\Instalasi\jetty\scripts\ctl.bat START)
if exist D:\Instalasi\subversion\scripts\ctl.bat (start /MIN /B D:\Instalasi\subversion\scripts\ctl.bat START)
rem RUBY_APPLICATION_START
if exist D:\Instalasi\lucene\scripts\ctl.bat (start /MIN /B D:\Instalasi\lucene\scripts\ctl.bat START)
if exist D:\Instalasi\third_application\scripts\ctl.bat (start /MIN /B D:\Instalasi\third_application\scripts\ctl.bat START)
goto end

:stop
echo "Stopping services ..."
if exist D:\Instalasi\third_application\scripts\ctl.bat (start /MIN /B D:\Instalasi\third_application\scripts\ctl.bat STOP)
if exist D:\Instalasi\lucene\scripts\ctl.bat (start /MIN /B D:\Instalasi\lucene\scripts\ctl.bat STOP)
rem RUBY_APPLICATION_STOP
if exist D:\Instalasi\subversion\scripts\ctl.bat (start /MIN /B D:\Instalasi\subversion\scripts\ctl.bat STOP)
if exist D:\Instalasi\jetty\scripts\ctl.bat (start /MIN /B D:\Instalasi\jetty\scripts\ctl.bat STOP)
if exist D:\Instalasi\hypersonic\scripts\ctl.bat (start /MIN /B D:\Instalasi\server\hsql-sample-database\scripts\ctl.bat STOP)
if exist D:\Instalasi\resin\scripts\ctl.bat (start /MIN /B D:\Instalasi\resin\scripts\ctl.bat STOP)
if exist D:\Instalasi\apache-tomcat\scripts\ctl.bat (start /MIN /B /WAIT D:\Instalasi\apache-tomcat\scripts\ctl.bat STOP)
if exist D:\Instalasi\openoffice\scripts\ctl.bat (start /MIN /B D:\Instalasi\openoffice\scripts\ctl.bat STOP)
if exist D:\Instalasi\apache\scripts\ctl.bat (start /MIN /B D:\Instalasi\apache\scripts\ctl.bat STOP)
if exist D:\Instalasi\ingres\scripts\ctl.bat (start /MIN /B D:\Instalasi\ingres\scripts\ctl.bat STOP)
if exist D:\Instalasi\mysql\scripts\ctl.bat (start /MIN /B D:\Instalasi\mysql\scripts\ctl.bat STOP)
if exist D:\Instalasi\postgresql\scripts\ctl.bat (start /MIN /B D:\Instalasi\postgresql\scripts\ctl.bat STOP)

:end

