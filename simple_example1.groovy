/**
 * This method will print the first not repeating char in the input string or -1 if nothing is present
 * @param word
 * @return word[i]
 */

def word = 'elephant'

String first_not_repeating_char(String word) {
    Boolean flag = true
    for(int i = 0; i < word.size(); i++) {
        def str = (word - word[i])
        flag = true
        for(int j = 0; j < str.size(); j++) {
            if(word[i] == str[j]) {
                flag = false
                break
            }
        }
        if(flag == true) {
            return word[i]

        }
    }
    return -1
}

