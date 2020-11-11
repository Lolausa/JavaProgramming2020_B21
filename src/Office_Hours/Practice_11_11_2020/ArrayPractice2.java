package Office_Hours.Practice_11_11_2020;

public class ArrayPractice2 {

    public static void main(String[] args) {
        String[] word = {"Tashkent", "Lol","Maryam", "Donald", "level", "Biden", "Agalar", "Engin"};

        int count = 0;

        for (String each : word) {
            char firstChar = each.toLowerCase().charAt(0); // t
            char lastChar = each.toLowerCase().charAt(each.length() - 1); // t

            if (firstChar == lastChar){
                count++;
            }
        }
        System.out.println(count);
    }

}
