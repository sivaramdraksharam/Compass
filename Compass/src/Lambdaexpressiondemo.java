public class Lambdaexpressiondemo 

{

	public static void main(String[] args) {
		Thread t=new Thread(new Runnable(){
			public void run()
			{
			System.out.println("Runnable thread");
		}

	});
	//Thread t=new Thread(()->System.out.println("Runnable thread"));
		t.start();

}
}

