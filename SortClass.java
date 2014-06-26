import java.util.Random;

/**
 * @author 밴드마스터 카가미네★렌
 * <p>각종 정렬에 대한 메소드를 제공한다.</p>
 * <a href="http://blog.naver.com/bluefox1543">블로그</a>
 * @version 0.9 beta
 */
class SortClass{
	/**
	 * @param n : 생성할 난수의 갯수
	 * @param MinValue : 생성되는 난수의 최소값
	 * @param MaxValue : 생성되는 난수의 최대값
	 * @return int[] : 생성된 난수들을 배열로 반환
	 */
	public int[] MakeArray(int n,int MinValue,int MaxValue){
		int[] array = new int[n];
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());

		for(int i = 0; i < array.length; i++)
			array[i] = MinValue + Math.abs(rand.nextInt()) % Math.abs((MaxValue - MinValue));

		return array;
	}
	
	/**
	 * @param n : 생성할 난수의 갯수
	 * @param MinValue : 생성되는 난수의 최소값
	 * @param MaxValue : 생성되는 난수의 최대값
	 * @return int[] : 생성된 난수들을 배열로 반환
	 */
	public double[] MakeArray(int n,double MinValue,double MaxValue){
		double[] array = new double[n];
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());

		for(int i = 0; i < array.length; i++)
			array[i] = MinValue + (Math.abs(rand.nextInt()) % Math.abs((MaxValue - MinValue))) + Math.abs(rand.nextDouble());

		return array;
	}

	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void SelectionSort(int[] list) {
		int indexMin, temp;

		for (int i = 0; i < list.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[indexMin]) {
					indexMin = j;
				}
			}
			temp = list[indexMin];
			list[indexMin] = list[i];
			list[i] = temp;
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void SelectionSort(double[] list) {
		int indexMin;
		double temp;

		for (int i = 0; i < list.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[indexMin]) {
					indexMin = j;
				}
			}
			temp = list[indexMin];
			list[indexMin] = list[i];
			list[i] = temp;
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void SelectionSort(String[] list) {
		int indexMin;
		String temp;

		for (int i = 0; i < list.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j].compareTo(list[indexMin]) < 0) {
					indexMin = j;
				}
			}
			temp = list[indexMin];
			list[indexMin] = list[i];
			list[i] = temp;
		}
	}

	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void BubbleSort(int[] list){
		int temp;

		for (int loop=1; loop<list.length; loop++) {
			for (int i=0; i<list.length-1; i++) {
				if (list[i] > list[i+1]) {
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void BubbleSort(double[] list){
		double temp;

		for (int loop=1; loop<list.length; loop++) {
			for (int i=0; i<list.length-1; i++) {
				if (list[i] > list[i+1]) {
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void BubbleSort(String[] list){
		String temp;

		for (int loop=1; loop<list.length; loop++) {
			for (int i=0; i<list.length-1; i++) {
				if (list[i].compareTo(list[i+1])>0) {
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}
		}
	}

	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void InsertionSort(int[] list)
	{

		for(int index = 1 ; index < list.length ; index++){

			int temp = list[index];
			int aux = index - 1;

			while( (aux >= 0) && ( list[aux] > temp) ) {

				list[aux+1] = list[aux];
				aux--;
			}
			list[aux + 1] = temp;
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void InsertionSort(double[] list)
	{
		for(int index = 1 ; index < list.length ; index++){

			double temp = list[index];
			int aux = index - 1;

			while( (aux >= 0) && ( list[aux] > temp) ) {

				list[aux+1] = list[aux];
				aux--;
			}
			list[aux + 1] = temp;
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void InsertionSort(String[] list)
	{

		for(int index = 1 ; index < list.length ; index++){

			String temp = list[index];
			int aux = index - 1;

			while( (aux >= 0) && ( list[aux].compareTo(temp))>0 ) {

				list[aux+1] = list[aux];
				aux--;
			}
			list[aux + 1] = temp;
		}
	}

	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 * @param left : 피벗을 제외한 리스트의 왼쪽 끝의 인덱스. 처음 시작 시 0
	 * @param right : 피벗을 제외한 리스트 오른쪽 끝의 인덱스. 처음 시작시 list.length - 1
	 */
	public void QuickSort(int[] list,int left, int right)
	{
		int i,j,temp;
		int p;

		if(left<right)
		{
			i=left;
			j=right;
			p=list[left];
			//분할 과정
			while(i<j)
			{
				while(list[j]>p)         j--;
				while(i<j && list[i]<=p) i++;

				temp = list[i];
				list[i]=list[j];
				list[j]=temp;
			}
			list[left] = list[i];
			list[i]=p;
			//정렬 과정
			QuickSort(list,left,i-1);
			QuickSort(list,i+1,right);   
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 * @param left : 피벗을 제외한 리스트의 왼쪽 끝의 인덱스. 처음 시작 시 0
	 * @param right : 피벗을 제외한 리스트 오른쪽 끝의 인덱스. 처음 시작시 list.length - 1
	 */
	public void QuickSort(double[] list,int left, int right)
	{
		int i,j;
		double p,temp;

		if(left<right)
		{
			i=left;
			j=right;
			p=list[left];
			//분할 과정
			while(i<j)
			{
				while(list[j]>p)         j--;
				while(i<j && list[i]<=p) i++;

				temp = list[i];
				list[i]=list[j];
				list[j]=temp;
			}
			list[left] = list[i];
			list[i]=p;
			//정렬 과정
			QuickSort(list,left,i-1);
			QuickSort(list,i+1,right);   
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 * @param left : 피벗을 제외한 리스트의 왼쪽 끝의 인덱스. 처음 시작 시 0
	 * @param right : 피벗을 제외한 리스트 오른쪽 끝의 인덱스. 처음 시작시 list.length - 1
	 */
	public void QuickSort(String[] list,int left, int right)
	{
		int i,j;
		String p,temp;

		if(left<right)
		{
			i=left;
			j=right;
			p=list[left];
			//분할 과정
			while(i<j)
			{
				while(list[j].compareTo(p)>0)         j--;
				while(i<j && list[i].compareTo(p)<=0) i++;

				temp = list[i];
				list[i]=list[j];
				list[j]=temp;
			}
			list[left] = list[i];
			list[i]=p;
			//정렬 과정
			QuickSort(list,left,i-1);
			QuickSort(list,i+1,right);   
		}
	}

	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void ShellSort (int[] list) {
		int increment = list.length / 2;
		while (increment > 0) {
			for (int i = increment; i < list.length; i++) {
				int j = i;
				int temp = list[i];
				while (j >= increment && list[j - increment] > temp) {
					list[j] = list[j - increment];
					j = j - increment;
				}
				list[j] = temp;
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void ShellSort (double[] list) {
		int increment = list.length / 2;
		while (increment > 0) {
			for (int i = increment; i < list.length; i++) {
				int j = i;
				double temp = list[i];
				while (j >= increment && list[j - increment] > temp) {
					list[j] = list[j - increment];
					j = j - increment;
				}
				list[j] = temp;
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
	}
	
	/**
	 * @param list : 정렬할 배열. 배열의 크기는 상관없다.
	 */
	public void ShellSort (String[] list) {
		int increment = list.length / 2;
		while (increment > 0) {
			for (int i = increment; i < list.length; i++) {
				int j = i;
				String temp = list[i];
				while (j >= increment && list[j - increment].compareTo(temp)>0) {
					list[j] = list[j - increment];
					j = j - increment;
				}
				list[j] = temp;
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
	}
}