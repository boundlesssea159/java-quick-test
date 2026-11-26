class StringsExercise {
    public static void main(String[] args) {
        // 1. Change every lowercase i that refers to yourself in the sentence below to an uppercase I.
        //    Careful not to change the i inside other words (like pair).
        //    Expected: When I went to the mall I bought a pair of shoes.
        String sentence = "When i went to the mall i bought a pair of shoes.";
        String newSentence = sentence.replaceAll("i ", "I ");
        System.out.println(newSentence);

        // 2. Count how many times the letter a appears in the text below. Count both upper and lower case A's.
        //    Expected: 13
        String text = "A lazy cat sat on a warm mat and Anna ate an apple.";
       long number =  text.chars().filter(c->c=='a' || c=='A').count();
       System.out.println(number);

    }
}
