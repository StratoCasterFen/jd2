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
pause

