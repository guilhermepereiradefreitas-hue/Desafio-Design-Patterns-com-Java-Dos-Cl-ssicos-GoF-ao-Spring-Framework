@echo off
echo ---------------------------------------------------
echo  Executando Spring Design Patterns JWT
echo ---------------------------------------------------

cd /d "%~dp0"

IF EXIST "mvnw.cmd" (
    echo [INFO] Usando Maven Wrapper...
    call mvnw.cmd spring-boot:run
) ELSE (
    echo [WARN] Maven Wrapper nao encontrado. Tentando 'mvn' global...
    call mvn spring-boot:run
)

IF %ERRORLEVEL% NEQ 0 (
    echo [ERRO] Falha na execucao. Verifique se o Java e o Maven estao configurados.
    pause
)