class Solution {
    public boolean isRationalEqual(String s, String t) {
        return Math.abs(getDecimalValue(s) - getDecimalValue(t)) < 1e-10;
    }

    private double getDecimalValue(String s) {
        if (s.indexOf('(') < 0) {
            return Double.parseDouble(s);
        }

        int openBracket = s.indexOf('(');
        int closeBracket = s.indexOf(')');

        String integerAndNonRepeating = s.substring(0, openBracket);
        String repeating = s.substring(openBracket + 1, closeBracket);

        double result = Double.parseDouble(integerAndNonRepeating);

        double factor = Math.pow(10, repeating.length());
        double repeatingValue = Double.parseDouble(repeating);

        int decimalPlaces = openBracket - s.indexOf('.') - 1;
        if (decimalPlaces < 0) decimalPlaces = 0;

        double multiplier = Math.pow(10, decimalPlaces);
        result += (repeatingValue / (factor - 1)) / multiplier;

        return result;
    }
}