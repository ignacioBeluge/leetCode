import java.util.HashMap;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String intToString = Integer.toString(x);

        for(int i=0; i<intToString.length() / 2;i++){
            char firstChar = intToString.charAt(i);
            char lastChar = intToString.charAt((intToString.length()-1)-i);
                if (firstChar != lastChar){
                    return false;
                }
            }
        return true;
    }

    public boolean isPalindromeV2(int x) {
        if (x < 0) {
            return false;
        }

        int numOriginal = x;
        int numInvertido=0;
        int numParcial=0;

        while (x > 10) {
            numParcial = x % 10;
            numInvertido = (numInvertido * 10) + numParcial;
            x = x/10;
        }

        if (numOriginal == numInvertido){
            return true;
        } else{
            return false;
        }
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInt = new HashMap<>();

        int numTraducido = 0;
        int valorAnterior = 0;
        
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        for (int i = s.length()-1; i>=0; i--) {
            char letra = s.charAt(i);
            int valorActual = romanToInt.get(letra);

            if (valorActual >= valorAnterior) {
                numTraducido += valorActual;
                valorAnterior = valorActual;
            } else{
                numTraducido -= valorActual;
                valorAnterior = valorActual;
            }
        }

        return numTraducido;
        
    }

    public static void main(String[] args) {
       Solution sol = new Solution();
       int numero = 1223;
       boolean resultado = sol.isPalindrome(numero);
       boolean resultadoV2 = sol.isPalindromeV2(numero);

       System.out.println("Palindromo?: " + resultadoV2);
       System.out.println("Resultado real: " + resultado);  
       
       String roman = "VV";

       int numTraducido = sol.romanToInt(roman);
       System.out.println(numTraducido);

    }
}
