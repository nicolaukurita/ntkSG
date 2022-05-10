export interface I${entidade.nome} {
#foreach($campo in $campos)
  ${campo.nome}: #if($campo.tipo == 'text')string#elseif ($campo.tipo=='imageUrl')string#else${campo.tipo}#end;
#end
}