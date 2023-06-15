/**
 * A simple method to check if a word is palindrome or not
 * @param word
 * @return res
 */

def word = 'madam'
String palindrome(String word) {
    def res = "it's palindrome"
    for(int i = 0; i < word.size()/2; i++) {
            if(word[i] != word[word.size()-i-1]) {
                res = "not palindrome"
                return res
            }
    }
    return res
}

println 'Is it palindrome? ' + palindrome(word)
