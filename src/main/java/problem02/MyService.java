package problem02;

public class MyService extends BaseService {

	
	@Override
	public void service(String state) {
		// TODO Auto-generated method stub
		String result = state.equals("오후")? afternoon(): (state.equals("낮") ? day() : night()) ;
		System.out.println(result+"서비스시작");
	}

	public String afternoon() {
		return "오후";
	}
}
