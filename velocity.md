#foreach( $campo in $campos )

#if(${campo.searchable}!= $null)

verificar o tipo de campo, e colocar virgula ou não se for o ultimo
        #if (${campo.beType}!=$null)${campo.beType}#else#if ($campo.tipo=="text") String#else Integer#end#end ${campo.CamelCase}#if( $foreach.hasNext ),


#if (${campo.beType}!=$null)
    ${campo.beType} 
#else
    #if ($campo.tipo=="text") 
        String
    #else 
        Integer
    #end
#end