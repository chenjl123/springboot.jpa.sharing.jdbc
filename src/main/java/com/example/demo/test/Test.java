package com.example.demo.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cmd = 0x01000000 + 0x00000000 + 0xC7;
		int ins_class = cmd & 0xFF000F00;
//		/long dec_num = Integer.parseInt("0xFF000F00", 16); 
		int ins_class2 = cmd & 0xFF000000;
		String input = "0xFF000000"; 
		long out = Integer.parseInt(input.substring(2, input.length()), 16);
		System.out.println(out);
		
		System.out.println("");
		//0xFF000000
	}

}
