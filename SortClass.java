import java.util.Random;

/**
 * @author ��帶���� ī���̳סڷ�
 * <p>���� ���Ŀ� ���� �޼ҵ带 �����Ѵ�.</p>
 * <a href="http://blog.naver.com/bluefox1543">��α�</a>
 * @version 0.9 beta
 */
class SortClass{
	/**
	 * @param n : ������ ������ ����
	 * @param MinValue : �����Ǵ� ������ �ּҰ�
	 * @param MaxValue : �����Ǵ� ������ �ִ밪
	 * @return int[] : ������ �������� �迭�� ��ȯ
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
	 * @param n : ������ ������ ����
	 * @param MinValue : �����Ǵ� ������ �ּҰ�
	 * @param MaxValue : �����Ǵ� ������ �ִ밪
	 * @return int[] : ������ �������� �迭�� ��ȯ
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
	 * @param left : �ǹ��� ������ ����Ʈ�� ���� ���� �ε���. ó�� ���� �� 0
	 * @param right : �ǹ��� ������ ����Ʈ ������ ���� �ε���. ó�� ���۽� list.length - 1
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
			//���� ����
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
			//���� ����
			QuickSort(list,left,i-1);
			QuickSort(list,i+1,right);   
		}
	}
	
	/**
	 * @param list : ������ �迭. �迭�� ũ��� �������.
	 * @param left : �ǹ��� ������ ����Ʈ�� ���� ���� �ε���. ó�� ���� �� 0
	 * @param right : �ǹ��� ������ ����Ʈ ������ ���� �ε���. ó�� ���۽� list.length - 1
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
			//���� ����
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
			//���� ����
			QuickSort(list,left,i-1);
			QuickSort(list,i+1,right);   
		}
	}
	
	/**
	 * @param list : ������ �迭. �迭�� ũ��� �������.
	 * @param left : �ǹ��� ������ ����Ʈ�� ���� ���� �ε���. ó�� ���� �� 0
	 * @param right : �ǹ��� ������ ����Ʈ ������ ���� �ε���. ó�� ���۽� list.length - 1
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
			//���� ����
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
			//���� ����
			QuickSort(list,left,i-1);
			QuickSort(list,i+1,right);   
		}
	}

	/**
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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
	 * @param list : ������ �迭. �迭�� ũ��� �������.
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