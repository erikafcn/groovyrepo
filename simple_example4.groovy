/**
 * This method finds the number pair which sum gives the imput sum
 * it returns an empty list if there's no match
 * @param arr, sum
 * @return res
 */

def arr = [1,3,2,1,0,6,4,2]
def sum = 7
List sum_pair(List<Integer> arr, int sum) {
    def pair =  []
    for(int i = 0; i < arr.size(); i++) {
        def temp_list = arr
        temp_list.remove(i)
        for(int j = 0; j < temp_list.size(); j++) {
            int temp = arr[i] + temp_list[j]
            if(temp == sum) {
                pair = [arr[i] , temp_list[j]]
                return pair
            }
        }
    }

    return pair
}

println "The pair is: " + sum_pair(arr, sum)
