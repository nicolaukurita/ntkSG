export interface I${entidade.singularNameUpper} {
#foreach($campo in $campos)
  ${campo.dicionario.name}: #if($campo.tipo == 'text')string#elseif ($campo.tipo=='imageUrl')string#else${campo.tipo}#end;
#end
}