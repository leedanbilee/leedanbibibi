package Day09.Ex06_EventListener;

import javax.swing.ButtonModel;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화버튼 클릭!!");
	}
}
