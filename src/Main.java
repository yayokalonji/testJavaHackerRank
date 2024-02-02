import java.awt.*;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


import static java.lang.System.in;
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
        out.println(sortDesc(478673));
        out.println(isIsogram("moose"));
        out.println(accum("abcd"));
        out.println(squareSum(new int[]{2, 2, 2}));
        out.println(reverse("world"));
        out.println(findSmallestInt(new int[]{34, 15, 88, 2}));
        out.println(numberToString(123));
        out.println(opposite(-3));
        out.println(positiveSum(new int[]{1, 2, -3, 4, -6}));
        out.println(abbrevName("sam harris"));
        out.println(sum(new double[]{1.0, 2.0, 3.0}));
        out.println(convert(false));
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
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
        out.println(boolToWord(true));
        out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        out.println(whoLikesIt("Peter", "Paul", "Mary"));
        out.println(check("The quick brown fox jumps over the lazy dog"));
        out.println(evenOrOdd(3));
        out.println(isValidWalk(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        out.println(Arrays.toString(countBy(3, 9)));
        out.println(Arrays.toString(digitize(123)));
        out.println(seriesSum(2));
        out.println(isSquare(26));
        out.println(findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        out.println(Arrays.toString(dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));
        out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
        out.println(squareDigits(765));
        out.println(getCount("abracadabra"));
        out.println(getMiddle("testing"));
        out.println(repeatWord(3, "Hello"));
        out.println(find_average(new int[]{1, 4, 4, 7, 7}));
        out.println(updateLight("green"));
        out.println(makeComplete("AAAAA"));
        out.println(fibonnaci(10));
        out.println(smash(new String[]{"hello", "world", "this", "is", "great"}));
        out.println(factorial(5));
        out.println(doubleInteger(100));
        out.println(howOld("5 years old"));
        out.println(isPalindrome("ana"));
        out.println(isPrime(14));
        out.println(findNb(1071225));
        out.println(Arrays.toString(removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"})));
        out.println(number(Arrays.asList("1", "2", "3", "4", " 5")));
        out.println(checkForFactor(2450, 5));
        out.println(correct("FGDKHJFD05GSSLK"));
        out.println(stray(new int[]{1, 1, 2}));
        out.println(bouncingBall(30, 0.66, 1.5));
        out.println(rentalCarCost(6));
        out.println(saleHotDogs(9));
        out.println(numberOfDivisors(12));
        out.println(nbDig(5750, 0));
        out.println(min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        out.println(max(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        out.println(minimum(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        out.println(maximum(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        out.println(minSpecialValue(7, new int[]{37, 91, 29, 58, 45, 51, 74}, 4));
        out.println(Arrays.toString(solution(5, 4, new int[]{0, 1, 0, 4})));
        out.println(can_get_word("A"));
        out.println(camelCase("identifier"));
        out.println(basicMath("+",9,2));
        out.println(removeExclamationMarks("!Hello !World!"));
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
     * Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
     * */
    public static String boolToWord(boolean b) {
        if (b) return "Yes";
        else return "No";
    }

    /*
     * Your task is
     * to make a function that can take any non-negative integer as an argument
     * and return it with its digits in descending order.
     * Essentially, rearrange the digits to create the highest possible number.
     * */
    public static int sortDesc(final int num) {
        String[] digits = String.valueOf(num).split("");
        Arrays.sort(digits, Comparator.reverseOrder());
        return Integer.parseInt(String.join("", digits));
    }

    /*
     *An isogram is a word that has no repeating letters, consecutive or non-consecutive.
     * Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
     */
    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static String accum(String s) {
        String[] letters = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            sb.append(String.format("%s%s", letters[i].toUpperCase(), String.join("", Collections.nCopies(i, letters[i].toLowerCase()))));
            if (i != letters.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
    /*
     * Complete the square sum function so that it squares each number passed into it and then sums the results together.
     */

    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(i -> i * i).sum();
    }

    /*
     * Complete the solution so that it reverses the string passed into it.
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int findSmallestInt(int[] args) {
        OptionalInt min = Arrays.stream(args).min();
        return min.isPresent() ? min.getAsInt() : 0;
    }

    /* You are going to be given an array of integers.
     *  Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N.
     * If there is no index that would make this happen, return -1.
     */
    public static int findEvenIndex(int[] arr) {
        int leftSum = 0;
        int rightSum = Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    /*
     * We need a function that can transform a number (integer) into a string.
     * What ways of achieving this do you know?
     * */
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    /*
     *
     * Very simple, given an integer or a floating-point number, find its opposite.
     * */
    public static int opposite(int number) {
        return -number;
    }

    /*
     * You get an array of numbers, return the sum of all of the positives ones.
     * */
    public static int positiveSum(int[] arr) {
        return Arrays.stream(arr).filter(i -> i > 0).sum();
    }

    /*
    * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
    The output should be two capital letters with a dot separating them.
    It should look like this:
    * */
    public static String abbrevName(String name) {
        return name.substring(0, 1).toUpperCase() + "." + name.substring(name.indexOf(' ') + 1).substring(0, 1).toUpperCase();
    }

    /*
     * Write a function that takes an array of numbers and returns the sum of the numbers.
     * The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
     * */
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
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
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }

    /*
     * Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.
     * */
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];
        for (int i = 1; i <= nFloors; i++) {
            String spaces = " ".repeat(nFloors - i);
            String blocks = "*".repeat(i * 2 - 1);
            String floor = spaces + blocks + spaces;
            result[i - 1] = floor;
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
        return Integer.parseInt(str);
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
    public static String binaryAddition(int a, int b) {
        return Integer.toBinaryString(a + b);
    }

    /*
     * A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated,
     * our hero has no idea how many bullets he should carry.
     * Assuming he's going to grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?
     * Return true if yes, false otherwise :)
     * */
    public static boolean hero(int bullets, int dragons) {
        return Double.parseDouble(String.valueOf(bullets)) >= 2 * Double.parseDouble(String.valueOf(dragons));
    }

    /*
     * */
    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
    }

    /**
     * Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
     * Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
     */
    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0);
    }

    /*
     * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
     * Implement the function which takes an array containing the names of people that like an item.
     * */
    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> names[0] + " likes this";
            case 2 -> names[0] + " and " + names[1] + " like this";
            case 3 -> names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default -> names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        };
    }

    /*
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     * Given a string, detect whether it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     * */
    public static boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (Character c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        return set.size() == 26;
    }

    /*
     * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
     * */
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    /*
     * You live in the city of Cartesia where all roads are laid out in a perfect grid.
     * You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
     *  The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
     *  You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block,
     * so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
     * */
    public static boolean isValidWalk(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int x = 0, y = 0;
        for (char direction : walk) {
            switch (direction) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + direction);
            }
        }
        return x == 0 && y == 0;
    }

    /*
     * Create a function with two arguments that will return an array of the first n multiples of x.
     * Assume both the given number and the number of times to count will be positive numbers greater than 0.
     * Return the results as an array or list ( depending on language ).
     * */
    public static int[] countBy(int x, int n) {
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = x * i;
        }
        return result;
    }

    /*
     * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
     * */
    public static int[] digitize(long n) {
        String str = new StringBuilder(String.valueOf(n)).reverse().toString();
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return result;
    }

    /*
     * Your task is to write a function which returns the sum of the following series upto nth term(parameter).
     * Rules:
     * You need to round the answer to 2 decimal places and return it as String.
     * If the given value is 0, then it should return 0.00.
     * You will only be given Natural Numbers as arguments.
     * */
    public static String seriesSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (3 * i - 2);
        }
        return String.format("%.2f", sum);
    }

    /*
     * A square of squares
     * */
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static int findIt(int[] a) {
        int result = 0;
        for (int j : a) {
            result ^= j;
        }
        return result;
    }

    /*
     * Once upon a time, on a way through the old wild mountainous west,…
     *  a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.
     * Going to one direction and coming back the opposite direction right away is a needless effort.
     * Since this is the wild west, with dreadful weather and not much water, it's important to save yourself some energy; otherwise you might die of thirst!
     * How I crossed a mountainous desert the smart way.
     * The directions given to the man are, for example, the following (depending on the language):
     *
     * ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
     * or
     * { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
     * or
     * [North, South, South, East, West, North, West]
     *
     * You can immediately see that going "NORTH" and immediately "SOUTH" is not reasonable, better stay to the same place! So the task is to give to the man a simplified version of the plan.
     * A better plan in this case is simple:
     *
     * ["WEST"]
     * or
     * { "WEST" }
     * or
     * [West]
     *
     * Other examples:
     * In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away.
     * The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).
     * In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].
     * Task Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
     * The Haskell version takes a list of directions with data Direction = North | East | West | South.
     * The Clojure version returns nil when the path is reduced to nothing.The Rust version takes a slice of enum Direction {North, East, West, South}.
     * See more examples in "Sample Tests:"
     * Notes
     * Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH",
     * "SOUTH" and "EAST" are not directly opposite of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
     * if you want to translate, please ask before translating.
     * */
    public static String[] dirReduc(String[] arr) {
        Map<String, String> opposites = new HashMap<>();
        opposites.put("NORTH", "SOUTH");
        opposites.put("SOUTH", "NORTH");
        opposites.put("EAST", "WEST");
        opposites.put("WEST", "EAST");
        Stack<String> stack = new Stack<>();
        for (String direction : arr) {
            if (stack.isEmpty() || !stack.peek().equals(opposites.get(direction))) {
                stack.push(direction);
            } else {
                stack.pop();
            }
        }
        return stack.toArray(String[]::new);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = {};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] + numbers[i] == target) {
                    result = new int[]{i, j};
                }
            }
        }
        return result;
    }

    /*
     * Welcome.In this kata, you are asked to square every digit of a number and concatenate them.
     * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
     * Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
     * Note: The function accepts an integer and returns an integer.
     * Happy Coding!
     * */
    public static int squareDigits(int n) {
        String str = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(str.charAt(i)));
            result.append(digit * digit);
        }
        return Integer.parseInt(result.toString());
    }

    /*
     * Some numbers have funny properties. For example:
     * 89 --> 8¹ + 9² = 89 * 1
     * 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
     * 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
     * Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
     * we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
     * In other words:
     * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
     * If it is the case we will return k, if not return -1.
     * Note: n and p will always be given as strictly positive integers.
     */
    public static int digPow(int n, int p) {
        int sum = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += (int) Math.pow(digit, p + i);
        }
        return sum % n == 0 ? sum / n : -1;
    }

    /*
     * Count the number of vowels in a given string.
     * */
    public static int getCount(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    /*
     * Get the Middle Character
     * */
    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            return word.substring(word.length() / 2, word.length() / 2 + 1);
        }
    }

    /*
     * Repeat a given string (first argument) num times (second argument).Return an empty string if num is not a positive number.
     * */
    public static String repeatWord(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    /* Average give array */
    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    /*
     * Change to next traffic light
     * */
    public static String updateLight(String current) {
        return "green".equals(current) ? "yellow" : "yellow".equals(current) ? "red" : "green";
    }

    public static String makeComplete(String dna) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if ('A' == (dna.charAt(i))) {
                result.append("T");
            } else if ('T' == dna.charAt(i)) {
                result.append("A");
            } else if ('C' == dna.charAt(i)) {
                result.append("G");
            } else if ('G' == dna.charAt(i)) {
                result.append("C");
            }
        }
        return result.toString();
    }

    /*
     * Serie fibonnaci
     * */
    public static int fibonnaci(int n) {
        if (n <= 1) {
            return n;
        }
        int firtsValue = 0;
        int secondValue = 1;
        int current = 0;
        for (int i = 2; i <= n; i++) {
            current = firtsValue + secondValue;
            firtsValue = secondValue;
            secondValue = current;
        }
        return current;
    }

    public static String smash(String... words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != 0) result.append(" ");
            result.append(words[i]);
        }
        return result.toString();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

    /*
     * Code as fast as you can! You need to double the integer and return it.
     * */
    public static int doubleInteger(int i) {
        return i * 2;
    }

    /*
     * You ask a small girl, "How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
     * Write a program that returns the girl's age (0-9) as an integer.
     * Assume the test input string is always a valid string. For example, the test input may be "1-year-old" or "5 years old". The first character in the string is always a number.
     * */
    public static int howOld(final String herOld) {
        return Integer.parseInt(herOld.split(" ")[0]);
    }

    /*
     * Word Palindrome
     * */
    public static boolean isPalindrome(String str) {
        int mid = str.length() / 2;
        for (int i = 0; i <= mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /*
     * Number prime
     * */
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Your task is to construct a building which will be a pile of n cubes.The cube at the bottom will have a volume of n^3
     * and the rest of the cubes will have a volume of n^3, the cube above will have volume of (n-1)^3  and so on until the top which will have a volume of
     * 1^3.You are given the total volume m of the building.Being given m can you find the number n of cubes you will have to build?
     * */
    public static int findNb(long m) {
        long volume = 0;
        int n = 0;
        while (volume < m) {
            n++;
            volume += (long) Math.pow(n, 3);
        }
        return volume == m ? n : -1;
    }

    /*
     * Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
     * */
    public static Object[] removeEveryOther(Object[] a) {
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                result.add(a[i]);
            }
        }
        return result.toArray();
    }

    /*
     * Your team is writing a fancy new text editor, and you've been tasked with implementing the line numbering.
     * Write a function which takes a list of strings and returns each line prepended by the correct number.
     * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
     * */
    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            result.add((i + 1) + ": " + lines.get(i));
        }
        return result;
    }

    /*
     * This function should test if the factor is a factor of base.
     * Return true if it is a factor or false if it is not.
     * About factors are numbers you can multiply together to get another number.
     * 2 and 3 are factors of 6 because: 2 * 3 = 6
     * You can find a factor by dividing numbers. If the remainder is 0, then the number is a factor.
     * You can use the mod operator (%) in most languages to check for a remainder -
     * For example; 2 is not a factor of 7 because: 7 % 2 = 1
     * Note: base is a non-negative number, a factor is a positive number.
     * */
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }

    /*
     * Character recognition software is widely used to digitize printed texts.
     * Thus, the texts can be edited, searched and stored on a computer.
     * When documents (especially pretty old ones written with a typewriter),
     * are digitized character recognition pieces of software often make mistakes.
     * Your task is to correct the errors in the digitized text.
     * You only have to handle the following mistakes:
     * S is misinterpreted as 5
     * O is misinterpreted as 0
     * I is misinterpreted as 1
     * The test cases contain numbers only by mistake.
     * */
    public static String correct(String string) {
        return string.replace('5', 'S').replace('0', 'O').replace('1', 'I');
    }

    /*
     * You are given an odd-length array of integers, in which all of them are the same, except for one single number.
     * Complete the method which accepts such an array, and returns that single different number.
     * The input array will always be valid!
     * (Odd-length >= 3)
     * */
    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
    }

    /*
     * A child is playing with a ball on the nth floor of a tall building.The height of this floor above ground level,h,is known.
     * He drops the ball out of the window.The ball bounces (for example), to two-thirds of its height(a bounce of 0.66).
     * His mother looks out of a window 1.5 meters from the ground.
     * How many times will the mother see the ball pass in front of her window
     * (including when it's falling and bouncing)?
     * Three conditions must be met for a valid experiment:
     * Float parameter "h" in meters must be greater than 0
     * Float parameter "bounces" must be greater than 0 and less than 1
     * Float parameter "window" must be less than h.
     * If all three conditions above are fulfilled, return a positive integer, otherwise return -1.
     * Note:
     * The ball can only be seen
     * if the height of the rebounding ball is strictly greater than the window parameter.
     * */
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int count = 1;
        double ballHeight = h;
        while (ballHeight * bounce > window) {
            count += 2;
            ballHeight *= bounce;
        }
        return count;
    }

    /*
     * After a hard quarter in the office, you decide to get some rest on a vacation.
     * So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
     * You will need a rental car in order for you to get around on your vacation.
     * The manager of the car rental makes you some good offers.
     * Every day you rent the car costs $40.
     * If you rent the car for 7 or more days, you get $50 off your total.
     * Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
     * Write a code that gives out the total amount for different days(d).
     * */
    public static int rentalCarCost(int d) {
        int total = d * 40;
        if (d >= 7) {
            total -= 50;
        } else if (d >= 3) {
            total -= 20;
        }
        return total;
    }

    public static int saleHotDogs(final int n) {
        if (n < 5) {
            return n * 100;
        } else if (n < 10) {
            return n * 95;
        } else {
            return n * 90;
        }
    }

    /*
     * Count the number of divisors of a positive integer n.
     * Random tests go up to n = 500000.
     * Note you should only return a number, the count of divisors.
     * The numbers between parentheses are shown only for you to see which numbers are counted in each case.
     * */
    public static long numberOfDivisors(int n) {
        long count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i * i != n) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
     * Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.
     * Square all numbers k (0 <= k <= n) between 0 and n.
     * Count the numbers of digits d used in the writing of all the k**2.
     * Implement the function taking n and d as parameters and returning this count.
     * */
    public static int nbDig(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String square = String.valueOf(i * i);
            for (int j = 0; j < square.length(); j++) {
                if (square.charAt(j) == (d + 48)) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
     * Your task is to make two functions (max and min, or maximum and minimum, etc., depending on the language)
     * that receive a list of integers as input, and return the largest and lowest number in that list, respectively.
     * */
    public static int min(int[] list) {
        int min = list[0];
        for (int j : list) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int max(int[] list) {
        int max = list[0];
        for (int j : list) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int minimum(int[] list) {
        return Arrays.stream(list).min().orElseThrow(RuntimeException::new);
    }

    public static int maximum(int[] list) {
        return Arrays.stream(list).max().orElseThrow(RuntimeException::new);
    }

    /*
     * The special value of a subsequence p is equal (pi - pi -1)
     * where pi denotes the ith element of the subsequence
     * Find out the minimum special value among all the subsequences of array a having length k,
     * if not possible to apply operation print 0.
     * Note:
     * a subsequence is a sequence
     * that can be derived from an array
     * by deleting some or no elements without changing the order of the remaining elements.
     * */
    public static long minSpecialValue(int n, int[] a, int k) {
        if (k > n || k <= 0) {
            return 0;
        }

        // Sort the array
        Arrays.sort(a);

        // Calculate the special value for the first k elements
        int specialValue = 0;
        for (int i = 1; i < k; i++) {
            specialValue += Math.abs(a[i] - a[i - 1]);
        }

        return specialValue;
    }

    public static int[] solution(int N, int K, int[] seat) {
        List<Integer> reservedSeats = new ArrayList<>();
        Set<Integer> availableSeats = new TreeSet<>();

        for (int i = 1; i <= N; i++) {
            availableSeats.add(i);
        }

        for (int i = 0; i < K; i++) {
            if (seat[i] == 0) {
                int reservedSeat = availableSeats.iterator().next();
                availableSeats.remove(reservedSeat);
                reservedSeats.add(reservedSeat);
            } else {
                availableSeats.add(seat[i]);
                reservedSeats.remove((Integer) seat[i]);
            }
        }

        return reservedSeats.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean can_get_word(String word) {
        List<String> blocksWord = new ArrayList<>();
        blocksWord.add("BO");
        blocksWord.add("XK");
        blocksWord.add("DQ");
        blocksWord.add("CP");
        blocksWord.add("NA");
        blocksWord.add("GT");
        blocksWord.add("RE");
        blocksWord.add("TG");
        blocksWord.add("QD");
        blocksWord.add("FS");
        blocksWord.add("HU");
        blocksWord.add("VI");
        blocksWord.add("AT");
        blocksWord.add("OB");
        blocksWord.add("ER");
        blocksWord.add("FS");
        blocksWord.add("LY");
        blocksWord.add("PC");
        blocksWord.add("ZM");
        blocksWord.add("JW");

        word = word.toUpperCase();

        for (String block : blocksWord) {
            if (word.contains(block)) {
                return false;
            }
        }
        return true;
    }

    public static boolean canGetWord(String word, Map<String, Boolean> blocks) {
        word = word.toUpperCase();
        blocks = new HashMap<>();
        blocks.put("BO", true);
        blocks.put("XK", true);
        blocks.put("DQ", true);
        blocks.put("CP", true);
        blocks.put("NA", true);
        blocks.put("GT", true);
        blocks.put("RE", true);
        blocks.put("TG", true);
        blocks.put("QD", true);
        blocks.put("FS", true);
        blocks.put("HU", true);
        blocks.put("VI", true);
        blocks.put("AT", true);
        blocks.put("OB", true);
        blocks.put("ER", true);
        blocks.put("LY", true);
        blocks.put("PC", true);
        blocks.put("ZM", true);
        blocks.put("JW", true);

        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            boolean findBlock = false;

            for (Map.Entry<String, Boolean> block : blocks.entrySet()) {
                boolean blockValue = block.getValue();
                String blockKey = block.getKey();
                if (blockValue && blockKey.contains(letter)) {
                    blocks.put(blockKey, false);
                    findBlock = true;
                    break;
                }
            }

            if (!findBlock) {
                return false;
            }
        }
        return true;
    }

    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }

    /*
    * Your task is to create a function that does four basic mathematical operations.
    * The function should take three arguments - operation(string/char), value1(number), value2(number).
    * The function should return a result of numbers after applying the chosen operation.
    * */
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> null;
        };
    }

    /* Write function RemoveExclamationMarks, which removes all exclamation marks from a given string.*/
    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }

    /* Create a function that accepts a string and a single character, and returns an integer
     * of the count of occurrences the 2nd argument is found in the first one.
     * If no occurrences can be found, a count of 0 should be returned.
     */
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
