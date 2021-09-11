/**
 * 
 */
package cloud;

import java.util.Scanner;

/**
 * @author 91852
 *
 */
//Declared by user
public class Alreadyergedarray {
public static void main(String[] args) {
	int m,n;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the already merged array size:");
	m=sc.nextInt();
	int[] alreadyMergedArr=new int[m];
	System.out.println("Enter the second array size:");
	n=sc.nextInt();
	int[] arr=new int[n];
	int[] mergedArray = new int[m+n];
	System.out.println("Enter the already merged array:");
	for(int i=0;i<m;i++) {
		alreadyMergedArr[i]=sc.nextInt();
	}
	System.out.println("Enter the second array:");
	for(int j=0;j<n;j++) {
		arr[j]=sc.nextInt();
	}
	int i=0,j=0,k=0;
	while(i<m && j<n) {//0<8 && 0<4,1<8 && 0<4
		if(alreadyMergedArr[i]<arr[j]) {//1<2,3<2
			mergedArray[k++]=alreadyMergedArr[i++];//mergedArray[1]=alreadyMergedArr[i++] increment the i value so the index position changes to 1
		}
		else {
			mergedArray[k++]=arr[j++];//mergedArray[2]=arr[j++] increment the j value so the index position changes to 1
		}
	}
	//Store remaining element in the AlreadyMergedArray
	while(i<m) {
		mergedArray[k++]=alreadyMergedArr[i++];
	}
	//Store remaining element in the Second Array
	while(j<n) {
		mergedArray[k++]=arr[j++];
	}
	System.out.println("Merged Two Arrays:");
	for(i=0;i<m+n;i++) {
		System.out.print(mergedArray[i]+ " ");
	}
}
}
