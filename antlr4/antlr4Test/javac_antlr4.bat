@rem
@rem Miguel Angel Gallardo Lemus_21-03-2013-2100
@rem script para  probar  que  funcionen las  clases  gneradas en antlr4  y compiladas  en linux 
@rem para ejecutar este  archivo:
@rem 1.- /bin/bash grun.bash [parametros]
@rem 2.- ./grun.bash [parametros]
@rem nota:mgl:21-03-2013: para  separar elementos en el "-cp", enlinux  en con ":", en win es con";"
@rem nota: para a ceptar paramentros en el escrit es con "$1 $2 ... o  $*  "
@rem uso: ./javac_antlr4.sh [ruta  de las  fuentes] [archivo a compilar]
javac -classpath ./;c:\antlr4_lib\antlr-4.0-complete.jar;%1  ""%1""/""%2""
