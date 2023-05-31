grammar MiLenguaje;

start
   : definition start
  // | generation EOF
   | EOF
   ;

definition
   : NEW definables
   ;

definables
   : ENTITY NAME '{' entityDef '}'
   | DTO 'for' NAME NAME '{' dtoDef '}'
   ;
dtoDef
   :'base' ':' dtoOpc
   ;
dtoOpc
   : 'strict'
   | 'flexible'
   | 'none'
   ;
entityDef
   : PROPERTIES '{' propDef '}' RELATIONS relDef
   | PROPERTIES '{' propDef '}'
   ;

relDef
   : '{' NAME ':' relObj '}'
   ;

relObj
   :  '{' relPairs (',' relPairs)* '}'
   ;

relPairs
   : 'relation' ':' relationTypes
   | 'onDelete' ':' onDeleteTypes
   | 'nullable' ':' BOOLEAN
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
   | NAME ':' types
   | NAME ':' propObj
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
   : 'isEmail'
   | 'max' ':' INT
   | 'min' ':' INT
   | 'isPositive'
   | 'isNegative'
   | 'isBooleanString'
   | 'isDateString'
   | 'isNumberString'
   | 'isAlpha'
   | 'isAlphanumeric'
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
