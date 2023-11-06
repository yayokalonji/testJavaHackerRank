import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


import static java.lang.System.out;

public class Main {


    private static class Node {
        public Node left;
        public Node right;
        public int value;

        public Node(Node l, Node r, int v) {
            left = l;
            right = r;
            value = v;
        }
    }

    public static void main(String[] args) {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;
        out.println(jumpingOnClouds(c, k));
        out.println(findDigits(110110015));
        extraLongFactorials(25);
        out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
        out.println(squares(7, 90));
        out.println(libraryFine(2, 7, 1014, 1, 1, 1015));
        out.println(cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8)));
        out.println(nonDivisibleSubset(3, Arrays.asList(1, 7, 2, 4)));
        out.println(repeatedString("aba", 10));
        out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
        out.println(removeVowel("This website is for losers LOL!"));
        out.println(rowSumOddNumbers(2));
        out.println(isTriangle(7, 2, 2));
        out.println(maskify("454578647586477767"));
        out.println(duplicateCount("indivisibility"));
        out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
        out.println(order("is2 Thi1s T4est 3a"));
        out.println(pigIt("Move the first letter []"));
        out.println(Arrays.toString(solution("abc")));
        out.println(toRoman(2008));
        out.println(fromRoman("MM"));
        out.println(getPINs("11"));
        out.println(alphanumeric("a1b2c3"));
        out.println(solution(10));
        out.println(isPrime(-1));
        out.println(zeros(12));
        out.println(sumStrings("123", "456"));
        out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        out.println(ipsBetween("0.0.0.0", "255.255.255.255"));
        out.println(treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2), new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
        out.println(longToIP(2154959208L));
        User user = new User();
        user.incProgress(-7);  // User ranked -8 completes an activity ranked -7
        out.println("Rank: " + user.rank);       // Output: -7
        out.println("Progress: " + user.progress); // Output: 10
        out.println(top3("\"  '  \""));
        out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
        Arrays.stream(arrayDiff(new int[]{1, 2, 3}, new int[]{2})).forEach(out::println);
        out.println(toJadenCase("hello world"));
        out.println(greet("Jackson"));
        out.println(removeChar("eloquent"));
        out.println(convert(false));
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        out.println(countPassengers(list));
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        out.println(findNeedle(haystack1));
        out.println(Arrays.toString(towerBuilder(3)));
        out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        out.println(stringToNumber("1234"));
        out.println(countSheep(new Boolean[]{true, true, true, false, true, true, true, true, true, true, true, false, false, true, true}));
        out.println(binaryAddition(3, 4));
        out.println(hero(1938854660, 1551468324));
        out.println(areYouPlayingBanjo("Martin"));
        out.println(isLove(1, 1));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int i = 0;
        k = c.length % k != 0 ? 1 : k;
        while (i < c.length) {
            if ((c[i] == 1)) {
                e -= 2;
            }
            e--;
            i = i + k;
        }
        return e;
    }

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        char[] numbers = String.valueOf(n).toCharArray();
        int count = 0;
        int divisor;
        for (char i : numbers) {
            if (i != '0') {
                divisor = n % Character.getNumericValue(i);
                if (divisor == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void extraLongFactorials(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = n; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        out.println(factorial);
    }

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int count = 0;
        int size = Math.min(s.length(), t.length());
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        int tMinusCount = t.length() - count;
        int sMinusCount = s.length() - count;

        int stk = k - (tMinusCount + sMinusCount);

        if (tMinusCount + sMinusCount < k && t.length() + s.length() > k && stk % 2 != 0) {
            return "No";
        } else if (tMinusCount + sMinusCount <= k) {
            return "Yes";
        } else {
            return "No";
        }
    }

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */
    public static int squares(int a, int b) {
        int count = 0;
        int sqrt = (int) Math.sqrt(a);
        int square = sqrt * sqrt;
        if (square < a) {
            sqrt++;
            square = sqrt * sqrt;
        }
        while (square >= a && square <= b) {
            count++;
            sqrt++;
            square = sqrt * sqrt;
        }
        return count;
    }

    /*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1
     *  2. INTEGER m1
     *  3. INTEGER y1
     *  4. INTEGER d2
     *  5. INTEGER m2
     *  6. INTEGER y2
     */

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;
        if (d1 > d2 && m1 == m2 && y1 == y2) {
            fine = 15 * (d1 - d2);
        } else if (m1 > m2 && y1 == y2) {
            fine = 500 * (m1 - m2);
        } else if (y1 > y2) {
            fine = 10000;
        }
        return fine;
    }

    /*
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> values;
        List<Integer> countStick = new ArrayList<>();
        countStick.add(arr.size());
        int minValue = arr.stream().min(Integer::compare).orElse(0);
        while (!(arr.isEmpty())) {
            final int val = minValue;
            values = arr.stream().map(i -> i - val).filter(i -> i != 0).toList();
            if (!values.isEmpty()) countStick.add(values.size());
            minValue = values.stream().min(Integer::compare).orElse(0);
            arr = values;
        }
        return countStick;
    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] remainderArr = new int[k];
        for (int i : s) {
            remainderArr[i % k]++;
        }
        int zeroRemainder = remainderArr[0];
        int numOfElementsInSubset = (zeroRemainder > 0) ? 1 : 0;
        for (int i = 1; i <= (k / 2); i++) {
            if (i != (k - i)) {
                numOfElementsInSubset += Math.max(remainderArr[i], remainderArr[k - i]);
            } else {
                numOfElementsInSubset++;
            }
        }
        return numOfElementsInSubset;
    }

    public static long repeatedString(String s, long n) {
        String a = s.repeat((int) n);
        out.println(a);
        out.println(a.charAt(0));
        return a.charAt(0);
    }

    public static String removeVowel(String str) {
        // remove all vowels
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }

    /*
    Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case.
    (In this case, all triangles must have surface greater than 0 to be accepted).
     */
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /* which changes all but the last four characters into '#'. */
    public static String maskify(String str) {
        int len = str.length();
        if (len <= 4) {
            return str;
        }
        String lastFour = str.substring(len - 4);
        return "#".repeat(len - 4) + lastFour;
    }

    /* Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
       The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
     */
    public static int duplicateCount(String text) {
        return (int) text.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream().filter(c -> c > 1).count();
    }

    /* Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements,
        with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
     */
    public static boolean comp(int[] a, int[] b) {
        return a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }

    /* Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
    */
    public static String order(String words) {
        return Arrays.stream(words.split(" ")).sorted(Comparator.comparingInt(s -> s.chars().filter(c -> c >= '0' && c <= '9').findFirst().orElse('0'))).collect(Collectors.joining(" "));
    }

    /* Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched. */
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String modifiedWord = extractWord(word);
                modifiedSentence.append(modifiedWord).append(" ");
            }
        }
        return modifiedSentence.toString().trim();
    }

    public static String extractWord(String word) {
        StringBuilder modifiedWord = new StringBuilder();
        StringBuilder punctuation = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch) || ch == '\'') {
                modifiedWord.append(ch);
            } else {
                punctuation.append(ch);
            }
        }

        if (!modifiedWord.isEmpty()) {
            char firstLetter = modifiedWord.charAt(0);
            modifiedWord.deleteCharAt(0);
            modifiedWord.append(firstLetter).append("ay");
        }
        modifiedWord.append(punctuation);
        return modifiedWord.toString();
    }

    /* Complete the solution so that it splits the string into pairs of two characters.
    If the string contains an odd number of characters,
    then it should replace the missing second character of the final pair with an underscore
    ('_'). */
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        return s.split("(?<=\\G.{2})");
    }

    /*
     * Modern Roman numerals are written by expressing each digit separately,
     * starting with the left most digit and skipping any digit with a value of zero.
     * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
     * 2008 is written as 2000=MM, 8=VIII; or MMVIII.
     * 1666 uses each Roman symbol in descending order: MDCLXVI.
     * */
    public static String toRoman(int n) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < romanValues.length; i++) {
            while (n >= romanValues[i]) {
                result.append(romanSymbols[i]);
                n -= romanValues[i];
            }
        }
        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentSymbol = romanNumeral.charAt(i);
            int currentValue = romanSymbolValue(currentSymbol);

            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }
        return result;
    }

    private static int romanSymbolValue(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    /*
     *Alright, detective, one of our colleagues successfully observed our target person, Robby the robber.
     * We followed him to a secret warehouse, where we assume to find all the stolen stuff.
     * The door to this warehouse is secured by an electronic combination lock. Unfortunately our spy isn't sure about the PIN he saw, when Robby entered it.
     * He noted the PIN 1357, but he also said, it is possible that each of the digits he saw could actually be another adjacent digit (horizontally or vertically, but not diagonally).
     *  E.g. instead of the 1 it could also be the 2 or 4. And instead of the 5 it could also be the 2, 4, 6 or 8.
     * He also mentioned, he knows this kind of locks. You can enter an unlimited amount of wrong PINs, they never finally lock the system or sound the alarm.
     * That's why we can try out all possible (*) variations.
     * possible in sense of: the observed PIN itself and all variations considering the adjacent digits
     *  Can you help us find all those variations? It would be nice to have a function, that returns an array (or a list in Java/Kotlin and C#) of all variations for an observed PIN with a length of 1 to 8 digits.
     *  We could name the function getPINs (get_pins in python, GetPINs in C#).
     * But please note that all PINs, the observed one and also the results must be strings, because of potentially leading '0's. We already prepared some test cases for you.
     * Detective, we are counting on you!
     */

    public static List<String> getPINs(String observed) {
        Map<Character, char[]> adjacentDigits = new HashMap<>();
        adjacentDigits.put('0', new char[]{'8'});
        adjacentDigits.put('1', new char[]{'2', '4'});
        adjacentDigits.put('2', new char[]{'1', '3', '5'});
        adjacentDigits.put('3', new char[]{'2', '6'});
        adjacentDigits.put('4', new char[]{'1', '5', '7'});
        adjacentDigits.put('5', new char[]{'2', '4', '6', '8'});
        adjacentDigits.put('6', new char[]{'3', '5', '9'});
        adjacentDigits.put('7', new char[]{'4', '8'});
        adjacentDigits.put('8', new char[]{'5', '7', '9', '0'});
        adjacentDigits.put('9', new char[]{'6', '8'});

        List<String> combinations = new ArrayList<>();
        generateCombinations(observed.toCharArray(), 0, new StringBuilder(), adjacentDigits, combinations);
        return combinations;
    }

    private static void generateCombinations(char[] observed, int index, StringBuilder currentCombo, Map<Character, char[]> adjacentDigits, List<String> combinations) {
        if (index == observed.length) {
            combinations.add(currentCombo.toString());
            return;
        }

        char currentDigit = observed[index];
        char[] possibleDigits = adjacentDigits.get(currentDigit);

        for (char possibleDigit : possibleDigits) {
            currentCombo.append(possibleDigit);
            generateCombinations(observed, index + 1, currentCombo, adjacentDigits, combinations);
            currentCombo.deleteCharAt(currentCombo.length() - 1);
        }
    }

    /*
    * In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.
        The string has the following conditions to be alphanumeric:
        At least one character ("" is not valid)
        Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
        No whitespaces / underscore
    *
    * */
    public static boolean alphanumeric(String s) {
        return s.matches("^[a-zA-Z0-9]+$");
    }
    /*
    * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
    * Note: If the number is a multiple of both 3 and 5, only count it once.
    * */

    public static int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    /*
     * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
     * */
    public static int zeros(int n) {
        int count = 0;
        for (long i = 5; n / i >= 1; i *= 5)
            count += (int) (n / i);
        return count;
    }

    /**
     * Given the string representations of two integers, return the string representation of the sum of those integers.
     * A string representation of an integer will contain no characters besides the ten numerals "0" to "9".
     * I have removed the use of BigInteger and BigDecimal in java
     */

    public static String sumStrings(String a, String b) {
        a = a.replaceFirst("^0+(?!$)", "");
        b = b.replaceFirst("^0+(?!$)", "");

        // Parse the strings into BigInteger objects
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);

        // Get the sum of the BigIntegers
        BigInteger sum = bigInteger1.add(bigInteger2);

        // Convert the sum to a string representation and return it
        return sum.toString();
    }

    /*
    * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
    An easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.
    Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
    * */
    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;
        int max = 0;
        int current = 0;
        for (int j : arr) {
            current += j;
            if (current < 0) current = 0;
            if (current > max) max = current;
        }
        return max;
    }

    /*
    * Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).
    All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.
    * */
    public static long ipsBetween(String start, String end) {
        long startIp = Arrays.stream(start.split("\\.")).mapToLong(Long::parseLong).reduce(0L, (result, octet) -> (result << 8) + octet);
        long endIp = Arrays.stream(end.split("\\.")).mapToLong(Long::parseLong).reduce(0L, (result, octet) -> (result << 8) + octet);

        return (endIp - startIp);
    }

    public static List<Integer> treeByLevels(Node node) {
        List<Integer> levels = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current != null) {
                    levels.add(current.value);
                    if (current.left != null) queue.add(current.left);
                    if (current.right != null) queue.add(current.right);
                }
            }
        }
        return levels;
    }

    /*
    *
    * Take the following IPv4 address: 128.32.10.1
        This address has 4 octets where each octet is a single byte (or 8 bits).

        1st octet 128 has the binary representation: 10000000
        2nd octet 32 has the binary representation: 00100000
        3rd octet 10 has the binary representation: 00001010
        4th octet 1 has the binary representation: 00000001
        So 128.32.10.1 == 10000000.00100000.00001010.00000001

        Because the above IP address has 32 bits, we can represent it as the unsigned 32-bit number: 2149583361

        Complete the function that takes an unsigned 32-bit number and returns a string representation of its IPv4 address.
    * */
    public static String longToIP(long ip) {
        return String.format("%d.%d.%d.%d", (ip >> 24) & 0xff, (ip >> 16) & 0xff, (ip >> 8) & 0xff, ip & 0xff);
    }

    /*
    * Write a class called User that is used to calculate the amount that a user will progress through a ranking system similar to the one Codewars uses.

    Business Rules:

    A user starts at rank -8 and can progress all the way to 8.
    There is no 0 (zero) rank. The next rank after -1 is 1.
    Users will complete activities. These activities also have ranks.
    Each time the user completes a ranked activity the users rank progress is updated based off of the activity's rank
    The progress earned from the completed activity is relative to what the user's current rank is compared to the rank of the activity
    A user's rank progress starts off at zero, each time the progress reaches 100 the user's rank is upgraded to the next level
    Any remaining progress earned while in the previous rank will be applied towards the next rank's progress (we don't throw any progress away). The exception is if there is no other rank left to progress towards (Once you reach rank 8 there is no more progression).
    A user cannot progress beyond rank 8.
    The only acceptable range of rank values is -8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8. Any other value should raise an error.
    The progress is scored like so:

    Completing an activity that is ranked the same as that of the user's will be worth 3 points
    Completing an activity that is ranked one ranking lower than the user's will be worth 1 point
    Any activities completed that are ranking 2 levels or lower than the user's ranking will be ignored
    Completing an activity ranked higher than the current user's rank will accelerate the rank progression. The greater the difference between rankings the more the progression will be increased. The formula is 10 * d * d where d equals the difference in ranking between the activity and the user.
    Logic Examples:

    If a user ranked -8 completes an activity ranked -7 they will receive 10 progress
    If a user ranked -8 completes an activity ranked -6 they will receive 40 progress
    If a user ranked -8 completes an activity ranked -5 they will receive 90 progress
    If a user ranked -8 completes an activity ranked -4 they will receive 160 progress, resulting in the user being upgraded to rank -7 and having earned 60 progress towards their next rank
    If a user ranked -1 completes an activity ranked 1 they will receive 10 progress (remember, zero rank is ignored)
    * */
    public static class User {
        private int rank;
        private int progress;

        public User() {
            this.rank = -8;
            this.progress = 0;
        }

        public void incProgress(int activityRank) {
            if (activityRank < -8 || activityRank == 0 || activityRank > 8) {
                throw new IllegalArgumentException("Invalid activity rank");
            }

            int rankDiff = activityRank - this.rank;

            if (rankDiff == 0) {
                this.progress += 3;
            } else if (rankDiff == -1) {
                this.progress += 1;
            } else if (rankDiff > 0) {
                this.progress += 10 * rankDiff * rankDiff;
            }

            while (this.progress >= 100) {
                if (this.rank == -1) {
                    this.rank += 2;
                } else {
                    this.rank += 1;
                }
                this.progress -= 100;
            }

            if (this.rank >= 8) {
                this.rank = 8;
                this.progress = 0;
            }
        }
    }

    /*
    Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of the top-3 most occurring words, in descending order of the number of occurrences.
    Assumptions:
    A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
    Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
    Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
    Matches should be case-insensitive, and the words in the result should be lowercase.
    Ties may be broken arbitrarily.
    If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, or an empty array if a text contains no words.
     */

    public static List<String> top3(String s) {
        s = s.toLowerCase().replaceAll("[^a-z']", " ");
        String[] words = s.trim().split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
        sortedWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        List<String> topWords = new ArrayList<>();
        for (int i = 0; i < Math.min(sortedWords.size(), 3); i++) {
            topWords.add(sortedWords.get(i).getKey());
        }
        return topWords;
    }

    /*
     * Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
     * Any whitespace at the end of the line should also be stripped out.
     */
    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        for (int i = 0; i < lines.length; i++) {
            for (String symbol : commentSymbols) {
                int index = lines[i].indexOf(symbol);
                if (index != -1) {
                    lines[i] = lines[i].substring(0, index);
                    break;
                }
            }
        }
        return String.join("\n", lines);
    }

    /**
     * Your goal in this kata is to implement a difference function,
     * which subtracts one list from another and returns the result.
     * It should remove all values from list a which are present in list b keeping their order.
     */
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        for (int item : a) {
            boolean isContained = false;
            for (int element : b) {
                if (item == element) {
                    isContained = true;
                    break;
                }
            }

            if (!isContained) {
                result.add(item);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
     * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
     * Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.
     * For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
     * Your task is to convert strings to how they would be written by Jaden Smith.
     * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
     */
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        } else {
            return Arrays.stream(phrase.split(" ")).map(i -> i.substring(0, 1).toUpperCase() + i.substring(1)).collect(Collectors.joining(" "));
        }
    }
    /*
    * Make a function that will return a greeting statement that uses an input
    * your program should return, "Hello, <name> how are you doing today?"
    * [Make sure you type the exact thing I wrote or the program may not execute properly]
    * */
    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
    /*
    * It's pretty straightforward.
    * Your goal is to create a function that removes the first and last characters of a string.
    * You're given one parameter, the original string.
    * You don't have to worry about strings with less than two characters.
    */
    public static String removeChar(String str) {
        return str.substring(1, str.length() - 1);
    }

    /*
    * Convert boolean values to strings.
    * */
    public static String convert(boolean b) {
        return String.valueOf(b);
    }

    /*
    * There is a bus moving in the city which takes and drops some people at each bus stop.
    * You are provided with a list (or array) of integer pairs.
    * Elements of each pair represent the number of people that get on the bus (the first item) and the number of people that get off the bus (the second item) at a bus stop.
    * Your task is to return the number of people who are still on the bus after the last bus stop (after the last array).
    * Even though it is the last bus stop, the bus might not be empty and some people might still be inside the bus, they are probably sleeping there :D
    * Take a look on the test cases. Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the returned integer can't be negative.
    * The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.
    * */
    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for (int[] stop : stops) {
            result += stop[0] - stop[1];
        }
        return result;
    }

    /*
    * Find the needle in the haystack.
    * */
    public static String findNeedle(Object [] haystack){
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }

    /*
    * Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.
    * */
    public static String[]  towerBuilder(int nFloors) {
        String[] result = new String[nFloors];
        for (int i = 1; i <= nFloors; i++) {
            String spaces = " ".repeat(nFloors - i);
            String blocks = "*".repeat(i * 2 - 1);
            String floor = spaces + blocks + spaces;
            result[i- 1] = floor;
        }
        return result;
    }
    /*
    * Write a function that removes the spaces from the string, then return the resultant string.
    * */
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    /*
    * We need a function that can transform a string into a number. What ways of achieving this do you know?
    * Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
    * */
    public static int stringToNumber(String str) {
        return Integer.parseInt(str) ;
    }
    /*
    * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
    * */
    public static int countSheep(Boolean[] arrayOfSheep) {
        int count = 0;
        for (Boolean sheep : arrayOfSheep) {
            if (sheep != null && sheep) {
                count++;
            }
        }
        return count;
    }

    /*
    * Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.
    * The binary number returned should be a string.
    * */
    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }

    /*
    * A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated,
    * our hero has no idea how many bullets he should carry.
    * Assuming he's going to grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?
    * Return true if yes, false otherwise :)
    * */
    public static boolean hero(int bullets, int dragons){
        return Double.parseDouble(String.valueOf(bullets)) >= 2 * Double.parseDouble(String.valueOf(dragons));
    }

    /*
    * */
    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().startsWith("r") ? name +" plays banjo" :  name + " does not play banjo";
    }

    /**
     * Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
     * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
     */
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 &&  flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0);
    }
}
