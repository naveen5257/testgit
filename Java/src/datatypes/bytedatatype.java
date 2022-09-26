package datatypes;

public class bytedatatype {
//size of byte is 2 power 8 means 8 bits its ranges between -128 to 127
	// why we represents in negative means we can represent in 2's compliment..
	// valid
	public static  void main(String[] args) {
		byte b=10;  
		byte c=127;
	//	byte d=128; // compliation error because its exceed the range possible loss of precesion
	//	byte e=10.5; same eorror 
//		byte f=true;  data type missmatch error Accures
		System.out.println(b);
		System.out.println(c);
	//	System.out.println(d);
	//	byte e=true; // can't convert incompatable types
		
		boolean bool=true;
		System.out.println(bool);
		boolean bool1=True;// missing variable
		System.out.println(bool1);
	}
}
