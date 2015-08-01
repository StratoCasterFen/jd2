set git_cmd=git

set remoteRepo=https://github.com/StratoCasterFen/jd2.git

set repo=%CD%\matsak-dao
	
rd /S /Q %repo%
if EXIST %repo% (
	tskill TGitCache
	rd /S /Q %repo%
	if EXIST %repo% (
		echo Не удалось удалить каталог %repo%
 		exit 1
		pause
	)
)

md %repo%

%git_cmd% clone --recursive %remoteRepo% %repo%
cd %repo%
%git_cmd% checkout develop
cd %repo%

set sqlPath="C:\Program Files\MySQL\MySQL Server 5.6\bin
%sqlPath%\mysql.exe" -u root -pqwe321 policestation < "%repo%\src\main\resources\policest2.sql"

mvn install
java -jar %repo%\target\matsak-dao-1.0-SNAPSHOT.jar

