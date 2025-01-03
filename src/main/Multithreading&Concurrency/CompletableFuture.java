public class Main {

	public static void main(String[] args) {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() ->{
			return "Task Completed";
		}).thenApply((String val) ->{
			return val+" Coding";
		});
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
