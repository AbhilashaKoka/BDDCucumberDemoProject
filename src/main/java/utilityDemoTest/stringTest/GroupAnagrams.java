package utilityDemoTest.stringTest;


import java.util.*;

public class GroupAnagrams {
        public static void main(String[] args) {
            String[] strs = {"eat","tea","tan","ate","nat","bat"};
            List<List<String>> result = groupAnagrams(strs);
            System.out.println(result);
        }

        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String word : strs){
                char[] chars = word.toCharArray();// Sort characters in the word to form the key
                Arrays.sort(chars);
                String key = new String(chars);
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(word); // Group words by sorted key
            }
            return new ArrayList<>(map.values());
        }



        public static List<List<String>> groupAnagrams2(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String word : strs) {
                char[] chars = word.toCharArray();  // Sort characters to form a key
                Arrays.sort(chars);
                String key = new String(chars);
               if (!map.containsKey(key)) {   // Add word to the correct group
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(word);
            }
            List<List<String>> groups = new ArrayList<>(); // Collect values into a list (no streams)
            for (List<String> group : map.values()) {
                groups.add(group);
            }
            return groups;
        }
    }




