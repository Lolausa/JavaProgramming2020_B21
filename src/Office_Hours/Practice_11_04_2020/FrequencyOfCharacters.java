package Office_Hours.Practice_11_04_2020;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "abbacaa";  //a4b2c1
        String result = "";

        for (int f = 0; f <= str.length() - 1; f++) {

            char ch = str.charAt(f);             // a b c
            int count = 0; // for the frequency     4 2 1
            for (int i = 0; i <= str.length() - 1; i++) {  // to find the frequency of one character, by compering it with ech ch
                if (ch == str.charAt(i)) {
                    count++;

                }
            }
            if (result.contains(""+ch)){
                continue;
            }

            result += "" + ch + count;
        }
        System.out.println(result);

    }


}
