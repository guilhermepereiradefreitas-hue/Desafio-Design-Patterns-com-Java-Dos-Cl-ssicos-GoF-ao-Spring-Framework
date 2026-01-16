#!/bin/bash

echo "---------------------------------------------------"
echo " Executando Spring Design Patterns JWT"
echo "---------------------------------------------------"

# Garante permissão de execução no mvnw se existir
if [ -f "./mvnw" ]; then
    chmod +x ./mvnw
    echo "[INFO] Usando Maven Wrapper..."
    ./mvnw spring-boot:run
else
    echo "[WARN] Maven Wrapper não encontrado. Tentando 'mvn' global..."
    mvn spring-boot:run
fi