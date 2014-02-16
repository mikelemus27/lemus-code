#!/bin/bash
#Miguel Angel Gallardo Lemus_21-03-2013-2100
#script para  probar  que  funcionen las  clases  gneradas en antlr4  y compiladas  en linux 
#para ejecutar este  archivo:
#1.- /bin/bash grun.bash [parametros]
#2.- ./grun.bash [parametros]
#nota:mgl:21-03-2013: para  separar elementos en el "-cp", enlinux  en con ":", en win es con";"
#nota: para a ceptar paramentros en el escrit es con "$1 $2 ... o  $*  "
#exec java -cp ./:/home/mikelemus/antlr4_lib/antlr-4.0-complete.jar org.antlr.v4.runtime.misc.TestRig "$@";
#uso: ./grun.sh [ruta  de las  fuentes] [archivo a compilar]
exec java -cp ./:/home/mikelemus/antlr4_lib/:antlr-4.0-complete.jar:$1 org.antlr.v4.runtime.misc.TestRig $2 $3 $4;
