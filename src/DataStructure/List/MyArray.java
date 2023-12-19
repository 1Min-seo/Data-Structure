package DataStructure.List;


public class MyArray {
	
	int[] intArr;
	int cnt;	//개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM= -999999999;
	
	public MyArray() {
		cnt=0;
		ARRAY_SIZE=10;
		intArr=new int[ARRAY_SIZE];
	}

	public MyArray(int size) {
		cnt=0;
		ARRAY_SIZE=size;
		intArr=new int[size];
	}
	
	public void addElement(int num) {
		if(cnt>=ARRAY_SIZE) {
			System.out.println("not enough memory!!");
			return;
		}
		
		intArr[cnt++]=num;
	}
	
	public void insertElement(int index, int num) {
		if(cnt>=ARRAY_SIZE) { //꽉 찬 경우
			System.out.println("not enough memory!!");
			return;
		}
		
		if(index<0 || index>cnt) { //인덱스 에러
			System.out.println("index Error!!");
			return;
		}
		
		for(int i=cnt-1; i>=index; i--) {
			intArr[i+1]=intArr[i];
		}
		intArr[index]=num;
		cnt++;
	}
	
	public int removeElement(int index) {
		int ret=ERROR_NUM;
		if(intArr.length==0) {
			System.out.println("There is no element!!");
			return ret;
		}
		
		if(index<0 || index>=cnt) {
			System.out.println("remove Error!!");
			return ret;
		}
		
		ret=intArr[index];
		for(int i=index; i<=cnt-1; i++) {
			intArr[i]=intArr[i+1];
		}
		cnt--;
		return ret;
	}
	
	public int getSize() {
		return cnt;
	}
	
	public boolean isEmpty() {
		if(cnt==0) return true;
		else return false;
	}
	
	public int getElement(int index) {
		if(index<0 || index>=cnt) {
			System.out.println("검색 위치 오류입니다. 현재 리스트 값의 개수는 "+cnt+" 입니다.");
			return ERROR_NUM;
		}
		return intArr[index];
	}
	
	public void printAll() {
		if(cnt==0) {
			System.out.println("출력할 내용이 없습니다!!");
			return;
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void removeAll() {
		for(int i=0; i<cnt; i++) {
			intArr[i]=0;
		}
		
		cnt=0;
	}
}
