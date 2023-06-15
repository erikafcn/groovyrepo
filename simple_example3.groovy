/**
 * Simple Bubble sort algorithm implementation
 * @param arr
 * @return res
 */

List arr = [26, 4, 24, 8, 20, 18]
void func(arr) {
    for (int i = 0; i < arr.size(); i++) {
        for (int j = 0; j < arr.size(); j++) {
            if(arr[j] < arr[i]) {
                def tempj = arr[j]
                arr[j] = arr[i]
                arr[i] = tempj
            }

        }
    }
}

func(arr)

println "Sorted array: " + arr
