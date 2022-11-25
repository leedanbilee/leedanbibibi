package Day09.Ex06_EventListener;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지 버튼 클릭!!");
	}
	

}
