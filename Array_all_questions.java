package ALL_JAVA_OOPS.COM;

import java.util.Scanner;
// int this question we have to find how much pair == target number
class pair{
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:"); //6
        int size= sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter the array element:");
        for(int i =0; i< size; i++){
            arr[i]=sc.nextInt();  // |4|6|3|5|8|2|
        }
        for(int i =0 ; i< size;i++){
            System.out.println(arr[i]); //print the array elment
        }
        System.out.println("enter target number:");
        int target = sc.nextInt();  //7
        int ans=0; // answer  initialize as 0
        for(int i =0; i<arr.length;i++){    // start compare with first element with each element i.e 4+6,4+3,4+5....
            for(int j =0; j<i+1;j++){   // after complete 4 then start with 6 and so on
                if(arr[i]+arr[j]==target){ // condtion if 4+6 ==7 the ans ++ otherwise the loop ise continue
                    ans++;
                }
            }

        }
        System.out.println("total number of pairs are :" + ans);

    }
}
//question 2
class triplets_whose_sum_equal_to_target{
public static void triplets(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size:"); //6
    int size= sc.nextInt();
    int arr[]= new int[size];
    System.out.println("enter the array element:");
    for(int i =0; i< size; i++){
        arr[i]=sc.nextInt();  // |4|6|3|5|8|2|
    }
    for(int i =0 ; i< size;i++){
        System.out.println(arr[i]); //print the array elment
    }
    System.out.println("enter the target number:");
    int target = sc.nextInt();
    int ans=0;
    for(int i =0 ; i< arr.length;i++){ // find first number x
        for(int j=i+1;j< arr.length;j++){ //find second number y
            for(int k = j+1; k< arr.length;k++){ //find 3rd number z
                if(arr[i]+arr[j]+arr[k]== target){
                    ans++;
                }
            }
        }

    }
    System.out.println(ans);


}
}
// In this question we have to find unique number in given array wher all the elemnts are being repeated twice with one value
class unique{
    public  static void unique_number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int size= sc.nextInt();
        int arr[]= new int[size];  //5
        System.out.println("enter the array element:");
        for(int i =0; i< size; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0 ; i< arr.length;i++){    // 1 2 2 1 3    start with 0 index =1
            for(int j = i+1; j< arr.length;j++){ //j = i+1 =1 start with 1 =2
                if(arr[i]==arr[j]){ // compare 1 and 2 are same if yes the return -1 otherwise i become 1 index= 2 and  j become i+1 = 2 ager same honge toh -1 print hoga
                    arr[i]=-1;// -1 becose yeha hame only +v number he ralh salte hai toh repeated number ko hatne ke liya ham koi ise value de dete hai jisko loop ignore kar sake ke ya ans nhi hoga like negative number (-1)
                    arr[j]=-1;
                }
            }

        }
        int ans=0;
        for(int i = 0 ; i< arr.length; i++){
            if (arr[i] >0){
                ans= arr[i];
            }

        }
        System.out.println(ans);

    }

}
// In this question we have to find the maximum value in array

class  maximum {
    public static void  max(){
        int ans = 0; // answer initialize with zero
        int arr[]={10,20,30}; // take array
        for(int i=0; i< arr.length;i++){ // traversal of array and check the condtion
            if(arr[i]>ans){ //ager i= 10 bada hai  ans =0 se toh ans 10 ban jayega fir ager i =20 bada hai 10 se 20 ans ban jayega or last ager 30 bada hai 20 se toh ans final 20 aa jayega
                ans= arr[i];

            }
        }
        System.out.println(ans);

    }
}

// second maximum number in array   is sum ko ham baad me dekhenge 
class  second_largest_number{
    public static void maximum_2() {
        Scanner sc = new Scanner(System.in);
        int largest  = Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;

        System.out.println("enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                int arrays  = arr[i];
                if(arrays > largest){
                    second_largest=largest;
                    largest= arrays;
                }
            }

            // finsing even number in array by using two methods
            class even{
                public static void even_number(){
                    int arr[]={10,20,30};

                    // first method
                    for(int i =0; i<arr.length;i++){
                        if(arr[i]%2==0){
                            System.out.print(arr[i]);
                        }
                    }
                    //second method
                    int[] arr = {1, 2, 3, 4, 5};
IntStream.of(arr).filter(n -> n % 2 == 0).forEach(System.out::println);
                    // ?*********************************************explnation *****************************************
                    /*
                     IntStream.of(arr): Creates an IntStream from the array. An IntStream is a sequence of primitive int values.

3. .filter(n -> n % 2 == 0): Applies a filter to the stream. The filter takes a lambda expression n -> n % 2 == 0, which checks if a number is even (i.e., divisible by 2). Only even numbers pass through the filter.

4. .forEach(System.out::println): Applies a terminal operation to the filtered stream. The forEach method takes a lambda expression System.out::println, which prints each even number to the console.
*/
                }
            }
                    
        }
//        System.out.println(max);
//        for(int i = 0 ; i< arr.length; i++){
//            if(arr[i]== max){
//                arr[i]= Integer.MIN_VALUE;
            }
        }

//    }

//}

// calculate sum of all array  elements
class all_elements{
    public static void sum(){
     int sum =0;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the array size:");
            int size= sc.nextInt();
            int arr[]= new int[size];  //5
            System.out.println("enter the array element:");
            for(int i =0; i< size; i++){
                arr[i]=sc.nextInt();

            }
            for(int i = 0 ; i<arr.length; i++){
                sum= arr[i]+sum;
            }

        System.out.println("ans is :" +sum);

    }
}

// in this question we have to swap the value (ex a= 10 , b= 20 after swap a=20, b=10)
class swap{
    public static void swaping(int a , int b){
        System.out.println("original value before swaping:");
        System.out.println("a" +a);
        System.out.println("b " +b);
        a=b;
        b=a;
    }
}
public class Array_all_questions {
    public static void main(String args[]){
        even obj8=new even();
        obj8.even_number();
         swap obj7 = new swap();
        // obj7.swaping(10, 20);
        second_largest_number obj6= new second_largest_number();
        // obj6.maximum_2();

        all_elements obj5= new all_elements();
//        obj5.sum();
        unique obj4= new unique();
//        obj4.unique_number();
        triplets_whose_sum_equal_to_target obj3= new triplets_whose_sum_equal_to_target();
//        obj3.triplets();
        maximum obj2=new maximum();
//        obj2.max();
        pair obj1 = new pair();
//        obj1.sum();

    }
}
