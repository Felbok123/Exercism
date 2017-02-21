package bob;

public class Bob {


    public String hey(String input) {
        String response = "Whatever.";

        if (input.trim().length() == 0) {
            response = "Fine. Be that way!";
        }

        if (input.endsWith("?")) {
            response = "Sure.";
        }

        if (youAreYelling(input)) {
            response = "Whoa, chill out!";
        }

        return response;

    }

    private static boolean youAreYelling(String input) {
        boolean isLetters = false;
        char[] charArray = new char[input.length()];
        input.getChars(0, input.length(), charArray, 0);
        for (char ch : charArray) {
            if (Character.isLetter(ch)) {
                isLetters = true;
                if (Character.isLowerCase(ch)) {
                    return false;
                }
            }
        }
        return isLetters;
    }
}
