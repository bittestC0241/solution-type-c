package problem03;

public class MyStack {
	
	private String[] buffer;
	private int count; //내부의 string 개수
	private int size; // buffer의 크기

	public MyStack( int size ) {
		buffer = new String[size];
		this.size = size;
		this.count = 0;
	}
	
	public void push(String item) {
		if(count>=size) {
			this.size*=2;//2배를 해주는 resizing
			String[] temp = new String[size];
			System.arraycopy(buffer, 0, temp, 0, buffer.length);
			buffer = new String[size];
			System.arraycopy(temp, 0, buffer, 0, temp.length);
		}//더 이상 담을 수 없을 때
		buffer[count]=item;
		count++;
	}

	public String pop() {
		if(count != 0) {
			count--;
			String str2return = buffer[count]; // 반환할 string
			buffer[count]=null;
			
			return str2return;
		}
		
		return null;
	}

	public boolean isEmpty() {
		if(count==0) {
			
			return true;
		}
		
		return false;
	}
	
	public int size() {
		if(size != 0) {
			
			return size;
		}
		
		return 0;
	}
}