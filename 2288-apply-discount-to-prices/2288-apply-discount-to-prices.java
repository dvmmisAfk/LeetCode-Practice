import java.util.*;
class Solution {
    public String discountPrices(String sentence, int discount) {
        String fnl = "";
        StringTokenizer ob = new StringTokenizer(sentence," ");
        for(;ob.hasMoreTokens();)
        {
            String s = ob.nextToken();
            int num = 0 ;
            double u= 0;
            String temp = "";
        
           if (s.startsWith("$") && s.length() > 1 && isNumeric(s.substring(1))) {
                double price = Double.parseDouble(s.substring(1)) ;
                double discounted = (price - ((discount * price) / 100.00));
                fnl += " $" + String.format("%.2f", discounted);;
            } else {
                fnl+=  " " + s;
            }
        }
        return fnl.trim();
    }

    private boolean isNumeric(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
        }
        return true;
    }
}