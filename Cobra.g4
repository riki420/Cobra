grammar Cobra;

@header {
package riki.cobra.language;
}

cobra: stat+;

stat: use '{' instructions* '}'
	| assignment
	;
	

use: 'use' (folder|file)+ #useStat
	;
	
folder: 'folder' atomic (',' atomic)* #folders
	| 'sub' folder excludes?	#subFolder
	;

excludes: 'exclude' atomic (',' atomic)* ;

file: 'file' atomic (',' atomic)* excludes?
	;
	
instructions: assignment ;

atomic: string
	| ID
	;

assignment: ID '=' string ;

string : STRING;

STRING: '"' .*? '"' {setText(getText().substring(1, getText().length()-1));};
ID:	'$'[A-Z_]+  {setText(getText().substring(1, getText().length()));};
WS: [ \t\r\n] -> skip;