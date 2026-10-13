/*  Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */

/* 
pseudocodigo: necesitamos contar cada aparicion de cada letra y cada union de estas letras. en la palabra dog tenemos que guardar d - do - dog 
vamos a usar un diccionario, en la cual la clave sera la letra o palabra y el valor sera la cantidad de repeticiones
vamos a iterar sobre la lista para recorrer todas las palabras, y luego recorrer cada palabra guardando o +1 cada aparicion 
*/

