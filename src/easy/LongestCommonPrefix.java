package easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] s){

        // Return empty string if s length is than 1 or if s is empty
        if(s.length < 1) return "";

        // Let prefix be equal to the first element in the array
        String prefix = s[0];

        // Loop through the array based off the 2nd element
        for(int i = 1; i < s.length;i++ ){
            /*
            Go through the current string until the indexOf becomes 0
            this will give us the prefix because if it contains the prefix
            it will become 0 breaking the loop or the prefix itself will
            become empty (0) essentially breaking the while condition
             */
        while(s[i].indexOf(prefix) != 0){
            prefix = prefix.substring(0,prefix.length() - 1);
        }
        }
        return prefix;
    }
}
