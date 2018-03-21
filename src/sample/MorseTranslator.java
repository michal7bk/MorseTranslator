package sample;

import java.util.*;

public class MorseTranslator {

    public static <T, E> String getKeyByValue(Map<T, E> map, E value) {
        Set<T> keys = new HashSet<T>();
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        String keyString;
        keyString = keys.toString().replaceAll("\\[|\\]","").replaceAll(","," ");
        return keyString;
    }

    public static String decode(String morseCode) {
        String str = new String();
        Map<Character, String> morse = new HashMap<Character, String>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c',  "-.-");
        morse.put('d',  "-..");
        morse.put('e',    ".");
        morse.put('f', "..-.");
        morse.put('g',  "--.");
        morse.put('h', "....");
        morse.put('i',   "..");
        morse.put('j', ".---");
        morse.put('k',   "-.");
        morse.put('l', ".-..");
        morse.put('m',   "--");
        morse.put('n',   "-.");
        morse.put('o',  "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s',  "...");
        morse.put('t',   "-");
        morse.put('u',  "..-");
        morse.put('v', "...-");
        morse.put('w',  ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");
        morse.put('1', ".----");
        morse.put('2',"..---");
        morse.put('3', "...--");
        morse.put('4', "....-");
        morse.put('5', ".....");
        morse.put('6', "-....");
        morse.put('7', "--...");
        morse.put('8', "---..");
        morse.put('9', "----.");
        morse.put('0', "-----");
        StringTokenizer st = new StringTokenizer(morseCode);

        while (st.hasMoreTokens()){
            try{
                str=str +getKeyByValue(morse,st.nextToken());}
            catch (Exception e){
                System.out.println("Check morse code. ");
            }

        }


        return str;
    }
}
