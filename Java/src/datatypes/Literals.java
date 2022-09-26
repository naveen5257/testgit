package datatypes;

public class Literals {
public static void main(String[] args) {
	int x=10;//(decimal from )
	int y=010;//(octal from so 8 power)
	int z=0x10;// hexadecimal from 16 power)
	System.out.println(x+"..."+y+"... ."+z);
	int i=0xface;
	System.out.println(i);
	// floating point literal
	
// f =	float f=12e3; // error bcs every floating is defalut double but explicitly we can by adding suffix with the f
	float f=12e3f;
	System.out.println(f);
	double d=12e3;
	System.out.println(d);
	float l=0123; //valid
	//float e=07889; // error because it is octla accept only the 0 to 7
	//int g=10.5; // loss of precesion we can't assign the double to int type
	double v= 0xface;
	System.out.println(v);
	
	char ch='a';
	System.out.println(ch);
	System.out.println("*****************");
//	char ch1=a;  ivalid
	//char ch2='ab'  invalid
	//char ch3="a"; // invalid
	//System.out.println(ch3);
	char ch4=97;
	System.out.println(ch);
	char ch5=0777;
	System.out.println(ch5);
	System.out.println("*******************");
	char ch6= 0xface;
	System.out.println(ch6);
	char ch7=65535;
	System.out.println(ch7);
	//char ch8=65536;//error due to exceeds its size.
	char ch9=197;
	System.out.println(ch9);
	char ch10=65;
	System.out.println(ch10);
	
	char m;
	for(m='a';m<='z';m++) {
		System.out.println(m+" ");
	}
	System.out.println("*****************");
		char ch11 ='\u0061';//--------------> uni code representation the value converted into hexa decimla cal in word.
		System.out.println(ch11);
		System.out.println("***********************");
		// in 1.7 version the integral literal we can also represents binary values but
		// prefixed with 0b or 0B
		int i1 = 0b1111;
		System.out.println(i1);
		int i2=0b101010101110111011;
		System.out.println(i2);
	
	}
	}
	
	
	


