package br.com.etematica.ntksg.util;

public class StringConverter {
    public static String toCamelCase(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return inputString;
        }

        StringBuilder camelCaseString = new StringBuilder();
        boolean capitalizeNext = false;

        // Convert the first character to lowercase
        camelCaseString.append(Character.toLowerCase(inputString.charAt(0)));

        for (int i = 1; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (currentChar == ' ' || currentChar == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    camelCaseString.append(Character.toUpperCase(currentChar));
                    capitalizeNext = false;
                } else {
                    camelCaseString.append(Character.toLowerCase(currentChar));
                }
            }
        }
        return camelCaseString.toString();
    }

    public static String toPascalCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder pascalCaseString = new StringBuilder();
        boolean capitalizeNext = true; // Flag to indicate if the next character should be capitalized

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c) || c == '_' || c == '-') { // Delimiters
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    pascalCaseString.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    pascalCaseString.append(Character.toLowerCase(c));
                }
            }
        }
        return pascalCaseString.toString();
    }
}
