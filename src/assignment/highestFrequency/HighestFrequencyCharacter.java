package assignment.highestFrequency;



import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyCharacter {

    public static void main(String[] args) {

        String test = "test";
        char highestFrequencyCharacter = highestFrequencyCharacter(test);
        int highestFrequency = getCharacterFrequency(test, highestFrequencyCharacter);

            }

            public static char highestFrequencyCharacter(String test) {
                HashMap<Character, Integer> Map = new HashMap<>();


                for (char c : test.toCharArray()) {
                    Map.put(c, Map.getOrDefault(c, 0) + 1);
                }


                char highestFrequencyCharacter = 't';
                int highestFrequency = 0;

                for (Map.Entry<Character, Integer> entry : Map.entrySet()) {
                    char c = entry.getKey();
                    int frequency = entry.getValue();

                    if (frequency > highestFrequency) {
                        highestFrequency = frequency;
                        highestFrequencyCharacter = c;
                    }
                    System.out.println("character '" + highestFrequencyCharacter + "'with frequency  " + highestFrequency );
                }

                return highestFrequencyCharacter;
            }

            public static int getCharacterFrequency(String str, char c) {
                int frequency = 0;

                for (char chr : str.toCharArray()) {
                    if (chr == c) {
                        frequency++;
                    }
                }

                return frequency;
            }
        }

