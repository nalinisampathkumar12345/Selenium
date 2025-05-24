package week4.day1;

public class APIClient {
	
	public void sendMessage(String endpoint)
	{
		System.out.println("Sending Request to Endpoint: "+ endpoint);
	}
	
	public void sendMessage(String endpoint, String requestBody,boolean requestStatus)
	{
		System.out.println("Sending Request to Endpoint: "+ endpoint);
		System.out.println("Request Body: "+ requestBody);
		System.out.println("Request Status: "+ requestStatus);
	}
	
	public static void main(String[] arg)
	{
		APIClient client = new APIClient();
		client.sendMessage("\"https://api.example.com/orders\"");
		System.out.println("----");
		client.sendMessage("\"https://api.example.com/orders\"", "{orderId: 1234}", true);
		System.out.println("----");
		
	}

}
