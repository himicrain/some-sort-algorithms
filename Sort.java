import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;




public class Sort {
	
	public static  int[] A = {6,1,22,12,11,5,6};

	
	class SampleInsertSortThread implements Runnable{
		int[] B = null;
		public SampleInsertSortThread() {
			// TODO Auto-generated constructor stub
			B = new int[A.length];
			for(int i=0;i<A.length;i++){
				B[i] = A[i];
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("sample insert sort"+(B[0]++));
		}
	}
	
	class BubbleSortThread implements Runnable{
		int[] B = null;
		public BubbleSortThread() {
			// TODO Auto-generated constructor stub
			B = new int[A.length];
			for(int i=0;i<A.length;i++){
				B[i] = A[i];
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//for(int i=0;i<100;i++)
				System.out.println("bubble sort"+(B[0]++) );
		}
	}
	class SampleSelectSortThread implements Runnable{
		int[] B = null;
		public SampleSelectSortThread() {
			// TODO Auto-generated constructor stub
			B = new int[A.length];
			for(int i=0;i<A.length;i++){
				B[i] = A[i];
			}
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("sample select thread"+(B[0]++));
			
		}
		
	}
	class QuickSortThread implements Runnable{
		int[] B = null;
		public QuickSortThread() {
			// TODO Auto-generated constructor stub
			B = new int[A.length];
			for(int i=0;i<A.length;i++){
				B[i] = A[i];
			}
		}
		@Override
		public  void run() {
			// TODO Auto-generated method stub
			System.out.println("quick sort"+(B[0]++) );
		}
	}
	
	SampleInsertSortThread sist = new SampleInsertSortThread();
	SampleSelectSortThread ssst = new SampleSelectSortThread();
	BubbleSortThread bst = new BubbleSortThread();
	QuickSortThread qst = new QuickSortThread();
	
	public void run(){
		new Thread(sist).start();
		new Thread(bst).start();
		new Thread(ssst).start();
		new Thread(qst).start();
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sort sort = new Sort();
		sort.run();
	}
}
