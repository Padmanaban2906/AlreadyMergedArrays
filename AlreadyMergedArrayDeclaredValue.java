/**
 * 
 */
package cloud;

import java.util.Arrays;

/**
 * @author 91852
 *
 */
//Declared value by us
public class AlreadyMergedArray {
	public static void main(String[] args) {
	//Already merged array
	int[] alreadyMergedArr= {1,3,5,7,9,11};
	//Second array
	int[] arr= {2,4,6,8};
	//len1 denotes length of the already merged array
	int len1=alreadyMergedArr.length;
	//len2 denotes length of the second array
	int len2=arr.length;
	//merged array have a size of already merged array plus second array
	int[] mergedArray=new int[len1+len2];
	int i=0,j=0,k=0;
	while(i<len1 && j<len2) {//0<6 && 0<4,
		if(alreadyMergedArr[i]<arr[j]) {//1<2,3<2
			mergedArray[k++]=alreadyMergedArr[i++];//mergedArray[1]=alreadyMergedArr[i++] increment the i value so the index position changes to 1
		}
		else {
			mergedArray[k++]=arr[j++];//mergedArray[2]=arr[j++] increment the j value so the index position changes to 1
		}
	}
	//Store remaining element in the AlreadyMergedArray
	while(i<len1) {
		mergedArray[k++]=alreadyMergedArr[i++];
	}
	//Store remaining element in second array
	while(j<len2) {
		mergedArray[k++]=arr[j++];
	}
//	Arrays.sort(mergedArray);
	System.out.println("After Merged Two Arrays");
	for(i=0;i<len1+len2;i++) {
		System.out.print(mergedArray[i]+ " ");
	}
}
}
