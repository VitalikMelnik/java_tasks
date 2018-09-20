package melnikv;
import java.util.Arrays;
import java.lang.Math;
import java.util.stream.*;

public class Main {

    public static void main(String[] args){

        int [] array ={1,2,3,4,22,5,-2,6,7};


        /*
            *@function OutArr - out in console elements array
            *@param arr
        */

            //OutArr(array);

        /*
            *@function OutArrBack - out in console elements array but from the end
            *@param arr
         */

            //OutArrBack(array);

        /*
            *@function SumArr - find sum element with array
            *@param arr
         */

            //System.out.println(SumArr(array));

        /*
         *@function MaxElem - find maximum element from array
         *@param arr
         */
            //System.out.println(MaxElem(array));

        /*
         *@function MinElem_Ind - out in console minimum element from array and him index
         *@param arr
         */

            //MinElem_Ind(array);
        /*
         *@function CountPairedElem_SumTheir - out in console count paired elements in array and their sum
         *@param arr
         */
            //CountPairedElem_SumTheir(array);
        /*
         *@function CountPairedElem_SumTheir_Diapason - out in console count paired elements in array and their sum
         *@param start end
         */
            //CountPairedElem_SumTheir_Diapason(20,30);

        /*
         *@function Max_Min_Paried - out in console Max paired and Min not paried
         *@param arr
         */
            //Max_Min_Paried(array);
        /*
         *@function Change_neg_num - out in console  array with change negative number
         *@param arr
         */
            //Change_neg_num(array);
        /*
         *@function IncremAddNum_DecremNegNum - out in console  array with change number
         *@param arr
         */
            //IncremAddNum_DecremNegNum(array);
        /*
         *@function ArithmeticMean_BigNum - arithmetic mean array and count element who is bigger arithmetic mean
         *@param arr
         */
           //ArithmeticMean_BigNum(array);
        /*
         *@function SumTwoArr - create third array with sum first+second
         *@param arr arr2
         */
         int array2 [] = {1,2,3,4,22,5,-2,6,7};
         //SumTwoArr(array,array2);

        /*
         *@function ConcatTwoArr - create third array with concat first+second
         *@param arr arr2
         */
        int array3 [] = {1,2,3,4,22,5,7};
          //ConcatTwoArr(array2,array3);

        /*
         *@function  - change place min and max
         *@param arr
         */
          //ChangeMaxMin(array);
        /*
         *@function DelMaxMin - delet maimun and minimum from array
         *@param arr
         */
          //DelMaxMin(array);

        /*
         *@function PosNegArr  - slice arr on positive number and negative
         *@param arr
         */
          //PosNegArr(array);

        /*
         *@function ConcatArr_Index  - concat arr on paired number and inder their
         *@param arr arr 2
         */
           //ConcatArr_Index(array,array2);

        /*
         *@function DeletDuplicates - delet dublicates from array
         *@param arr
         */
         int array4 [] = {1,1,2,3,4,5,5,6,6,7,7,7,8,9};

        DeletDuplicates(array4);

    }

    public static void  OutArr(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void OutArrBack(int [] arr){
        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static int SumArr(int []arr){
        int sum = 0;
        for (Integer number : arr
             ) {
            sum = sum + number;
        }
        return sum;
    }
    public static int MaxElem(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void MinElem_Ind(int [] arr){
        int index = 0;
        int min = arr[0];
        int CurrentPosition =0;
        for (Integer number: arr
             ) {
            if(min>number){
                min= number;
                index = CurrentPosition;;
            }
            CurrentPosition++;
        }
        System.out.println("Min num = " + min +" Him index = " + index);
    }

    public static void CountPairedElem_SumTheir(int arr []){
        int cou =0;
        int sum =0;
        for (Integer number:arr
             ) {
            if(number%2 == 0){
                cou++;
                sum+=number;
            }
        }
        System.out.println("Count paired elements array = " +  cou +" Sum their = " + sum);
    }
    public static void CountPairedElem_SumTheir_Diapason(int start , int end){
        int cou =0;
        int sum =0;
        for (int i = start; i<=end; i++){
            if(i%2==0){
                cou++;
                sum+=i;
            }
        }
        System.out.println("Count paired elements array = " +  cou +" Sum their = " + sum);
    }

    public static void Max_Min_Paried(int arr []){
        Arrays.sort(arr);
        int i = 0;
        int max =0;
        int min =0;
        while (i<arr.length){
            if (arr[i]%2 !=0){
                min = arr[i];
                break;
            }
            i++;
        }
        i=arr.length-1;
        while (i>0){
            if (arr[i]%2 ==0){
                max = arr[i];
                break;
            }
            i--;
        }
        System.out.println("Min not paired element = " + min + " Max paired elemnt  = " + max);
    }
    public static void   Change_neg_num(int arr []){
        for (Integer number: arr
             ) {
            number = Math.abs(number);
            System.out.println(number);
        }

    };
    public static void IncremAddNum_DecremNegNum(int arr[]){
        for (Integer number: arr
             ) {
            if(number>0){
                number++;
            }else {
                number--;
            }
            System.out.println(number);
        }
    }
    public  static void ArithmeticMean_BigNum(int arr []){
        int sum = IntStream.of(arr).sum();
        int cou =0;
        double arf = sum / arr.length;
        for (Integer number:arr
             ) {
            if(number >= arf){
                cou++;
            }
        }
        System.out.println("Arithmetic Mean = " + arf );
        int[] arr2 = new int[cou];
        int i = 0;
        int j = 0;
        for (Integer number: arr
             ) {
            if(number>=arf){
                arr2[j] = number;
                j++;
            }
        }
        for (Integer n : arr2
             ) {
            System.out.println(n);
        }
    }
    public static void SumTwoArr(int arr [], int arr2 []){
        int [] arr3 = new int[arr.length];
        for (var i=0;i<arr.length;i++){
            arr3[i]= arr2[i]+arr[i];
            System.out.println(arr3[i]);
        }
    }

    public static void ConcatTwoArr(int arr[],int arr2 []){
        int [] arr3 = new int[arr.length+arr2.length];
        int i =0;
        int j = arr.length;
        int k = 0;
        while (i<arr.length){
            arr3[i] = arr[i];
            if(i == arr.length-1){
                while (j<arr3.length){
                    arr3[j]= arr2[k];
                    j++;
                    k++;
                }
            }
            i++;
        }
        for (Integer n: arr3
             ) {
            System.out.println(n);
        }
    }

    public static void ChangeMaxMin(int arr []){
        int min=arr[0];
        int max=arr[0];
        for (Integer number: arr
             ) {
            if(number>max){
                max = number;
            }else if(min>number){
                min = number;
            }
        }
        for (int i =0;i<arr.length;i++){
            if (arr[i] == min) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == max){
                        arr[j] = min;
                        arr[i] = max;
                        break;
                    }
                }
                break;
            }
        }
        for (Integer n: arr
             ) {
            System.out.println(n);
        }
    }

    public static void DelMaxMin(int arr []){
        int min=arr[0];
        int max=arr[0];
        for (Integer number: arr
        ) {
            if(number>max){
                max = number;
            }else if(min>number){
                min = number;
            }
        }
        int [] arr2 = new int[arr.length -2];
        int i =0;
        int k =0;
        while (i< arr.length){
            if(arr[i]!=max && arr[i]!= min){
                arr2[k] =arr[i];
                k++;
            }
            i++;
        }
        for (Integer n: arr2
             ) {
            System.out.println(n);
        }
    }

    public static void PosNegArr(int arr []){
        int pos = 0;
        int neg = 0;
        for (Integer number: arr
             ) {
            if(number>=0){
                pos++;
            }else{
                neg++;
            }
        }
        int [] arrneg = new int[neg];
        int [] arrpos = new int[pos];
        int i = 0;
        int k = 0;
        int l = 0;
        while (i< arr.length){
            if(arr[i]>=0){
                arrpos[k] = arr[i];
                k++;
            }else {
                arrneg[l] = arr[i];
                l++;
            }
            i++;
        }
        for (i=0 ;i<arrpos.length;i++){
            System.out.println(arrpos[i]);
        }
        for (i=0 ;i<arrneg.length;i++){
            System.out.println(arrneg[i]);
        }
    }

    public static void ConcatArr_Index(int arr[] , int arr2[]){
        int cou = 0;
        for (int i =0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                cou++;
            }
        }for (int i =0; i<arr2.length; i++){
            if(arr2[i]%2 ==0){
                cou++;
            }
        }
        int [] arr3 = new int[cou];
        cou = 0;
        for (int i =0; i<arr.length; i++){
            if(arr[i]%2 ==0){
                arr3[cou] = arr[i];
                cou++;
            }
        }for (int i =0; i<arr2.length; i++){
            if(arr2[i]%2 ==0){
                arr3[cou] = arr[i];
                cou++;
            }
        }
        for (Integer n: arr3
             ) {
            System.out.println(n);
        }
    }

    public  static void DeletDuplicates(int arr[]){
        int [] arr2 = new int[arr.length];
        boolean b = false;
        int y =0;
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr2.length;j++){
                if(arr2[j] ==arr[i]){
                    b = false;
                    break;
                }else {
                    b = true;
                }
            }
            if(b){
                arr2[i] =arr[i];
            }
            b = false;
        }
        int targetIndex = 0;
        for( int sourceIndex = 0;  sourceIndex < arr2.length;  sourceIndex++ )
        {
            if( arr2[sourceIndex] != 0 )
                arr2[targetIndex++] = arr2[sourceIndex];
        }
        int[] newArray = new int[targetIndex];
        System.arraycopy( arr2, 0, newArray, 0, targetIndex );
        for (Integer n: newArray
             ) {
            System.out.println(n);
        }
    }
}
