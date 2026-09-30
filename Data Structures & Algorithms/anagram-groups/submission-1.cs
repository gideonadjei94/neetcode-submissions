public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
        var map = new Dictionary<string, List<string>>();

            foreach(string s in strs)
            {
                char[] pattern = new char[26];

                foreach(char c in s)
                {
                    pattern[c - 'a']++;
                }

                string key = new(pattern);
                
                if(!map.TryGetValue(key, out List<string>? group))
                {
                    group = [];
                    map[key] = group;
                }

                group.Add(s);
            }

            return [.. map.Values];
    }
}
