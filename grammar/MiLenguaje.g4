grammar MiLenguaje;
start
   : definition start
   | EOF
   ;

definition
   : NEW definables
   ;

definables
   : ENTITY NAME '{' entityDef '}'
   | NAME DTO NAME '{' dtoDef '}'
   ;
dtoDef
   : dtoOpc NAME  ':' dtoOptions  dtoDefRecursion
   ;

dtoDefRecursion
   : ',' dtoDef
   |
   ;

dtoOptions
   : '{' validationPairs (',' validationPairs)* '}'
   ;
dtoOpc
   : 'strict'
   | 'flexible'
   | 'none'
   ;
entityDef
   : PROPERTIES '{' propDef '}' RELATIONS '{' relDef '}'
   | PROPERTIES '{' propDef '}'
   ;

relDef // relatedTable - columnName - relatedColumnName
   :  relationTypes NAME '(' NAME ',' NAME  ')' ':' relObj relDefRecursion
   ;

relDefRecursion
   : ',' relDef
   |
   ;

relObj
   :  '{' relPairs (',' relPairs)* '}'
   ;

relPairs
   : 'onDelete' ':' onDeleteTypes
   | 'nullable'
   ;
onDeleteTypes
   : 'restrict'
   | 'cascade'
   | 'setNull'
   ;


relationTypes
   : 'OneToOne'
   | 'OneToMany'
   | 'ManyToOne'
   | 'ManyToMany'
   ;


propDef
   :  NAME ':' types propDefRecursion
   |  NAME ':' propObj propDefRecursion
   ;
propDefRecursion
   : ',' propDef
   |
   ;
propObj
   : '{' propPairs (',' propPairs)* '}'
   ;

propPairs
   : 'type' ':' types
   | 'length' ':' INT
   | 'nullable'
   | 'default' ':' basicValues
   | 'generated'
   | 'unique'
   | 'validate' ':' validationObj
   | 'primary'
   ;


validationObj
   : '{' validationPairs (',' validationPairs)* '}'
   ;

validationPairs
   : 'IsEmail'
   | 'Max' ':' INT
   | 'Min' ':' INT
   | 'IsPositive'
   | 'IsNegative'
   | 'IsBooleanString'
   | 'IsDateString'
   | 'IsNumberString'
   | 'IsAlpha'
   | 'IsAlphanumeric'
   ;

types
   : 'number'
   | 'string'
   | 'boolean'
   ;
obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

pair
   : NAME ':' value
   ;

arr
   : '[' value (',' value)* ']'
   | '[' ']'
   ;

value
   : basicValues
   | obj
   | arr
   | 'null'
   ;

basicValues
   : STRING
   | INT
   | NUMBER
   | BOOLEAN
   ;

NEW
   : 'New'
   ;

ENTITY
   : 'Entity'
   ;

DTO
   : 'DTO'
   ;

PROPERTIES
   : 'properties'
   ;

RELATIONS
   : 'relations'
   ;

BOOLEAN
   : 'true'
   | 'false'
   ;

STRING
   : '"' (ESC | SAFECODEPOINT)* '"'
   ;


fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;


fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;


fragment HEX
   : [0-9a-fA-F]
   ;


fragment SAFECODEPOINT
   : ~ ["\\\u0000-\u001F]
   ;




INT
   // integer part forbis leading 0s (e.g. `01`)
   : '0' | [1-9] [0-9]*
   ;

NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;
// no leading zeros

fragment EXP
   // exponent number permits leading 0s (e.g. `1e01`)
   : [Ee] [+\-]? [0-9]+
   ;

// \- since - means "range" inside [...]
NAME
  :  ([a-zA-Z\u00C0-\u00FF\u0153\u0152])[a-zA-Z\u00C0-\u00FF\u0153\u0152_0-9]*
  ;
WS
   : [ \t\n\r] + -> skip
   ;
