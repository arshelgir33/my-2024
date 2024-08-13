import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class generate {
    int numberOfSmallLetters;
    int numberOfCaps;
    int numberOfNumbers;
    public ArrayList<String> letters;
    public ArrayList<Integer> numbers;

    public generate(int numberOfSmallLetters, int numberOfCaps,int numberOfNumbers) {
        this.numberOfSmallLetters = numberOfSmallLetters;
        this.numberOfCaps = numberOfCaps;
        this.numberOfNumbers = numberOfNumbers;
        this.letters = new ArrayList<>();
        this.numbers = new ArrayList<>();
    }
    public String mainAlg() {
        StringBuilder pswd = new StringBuilder();
        int psdLength = this.numberOfCaps + this.numberOfNumbers + this.numberOfSmallLetters;
        ArrayList<String> pswd_list = new ArrayList<>();

        for (int i = 0; i < psdLength; i++) {
            if (numberOfSmallLetters > 0) {
                pswd_list.add(splitInRandom(this.letters).toLowerCase());
                numberOfSmallLetters--;
            } else if (numberOfNumbers > 0) {
                Random random = new Random();
                int num_num = random.nextInt(10);
                pswd_list.add(String.valueOf(num_num));
                numberOfNumbers--;
            } else if (numberOfCaps > 0) {
                pswd_list.add(splitInRandom(this.letters));
                numberOfCaps--;
            }
        }

        // Shuffle the generated password list
        Collections.shuffle(pswd_list);

        // Convert list to a string
        for (String s : pswd_list) {
            pswd.append(s);
        }

        return pswd.toString();
    }

    public String splitInRandom(ArrayList<String> input) {
        Random random = new Random();
        return input.get(random.nextInt(input.size()));
    }

    public void loadLetters() {
        this.letters.add("A"); this.letters.add("B"); this.letters.add("C");
        this.letters.add("D"); this.letters.add("E"); this.letters.add("F");
        this.letters.add("G"); this.letters.add("H"); this.letters.add("I");
        this.letters.add("J"); this.letters.add("K"); this.letters.add("L");
        this.letters.add("M"); this.letters.add("N"); this.letters.add("O");
        this.letters.add("P"); this.letters.add("Q"); this.letters.add("R");
        this.letters.add("S"); this.letters.add("T"); this.letters.add("U");
        this.letters.add("V"); this.letters.add("W"); this.letters.add("X");
        this.letters.add("Y"); this.letters.add("Z");
    }

    public void loadNumbers() {
        this.numbers.add(0); this.numbers.add(1); this.numbers.add(2);
        this.numbers.add(3); this.numbers.add(4); this.numbers.add(5);
        this.numbers.add(6); this.numbers.add(7); this.numbers.add(8);
        this.numbers.add(9);
    }
}
