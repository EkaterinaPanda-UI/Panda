public class Main {
    public static void combinations(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < words.length; k++) {
                    if (i != j && i != k && j != k) {
                        System.out.println(words[i] + words[j] + words[k]);
                    }
                }
            }
        } 
    }
    public static void main(String[] args) {
        String words[] = {"Мама", "Мыла", "Раму"};
        combinations(words);
    }
}
