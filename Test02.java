class Test02 {
	public static void main(String[] args) {
		int x;
		x = 50;
		System.out.println(x);

		String s1;
		s1 = "Rishabh";
        System.out.println(s1);

		int p;
		p = 50;
		System.out.println(p);

		p = 60;
		System.out.println(p);
		//======================================================
		String s2;

		s2 = "abc";
		System.out.println(s2);
        
		s2 = "bbc";
		System.out.println(s2);

		int i1 = 3;
		int i2 = 4;
		int i3 = 5;
		int i4 = 6;
		int i5 = 7;

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		//======================================================
		String str1 = "a";
		String str2 = "b";
		String str3 = "c";
		String str4 = "d";
		String str5 = "e";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

		//=====================================================

		//add();  //CE
		add(3);
		//add(3, 4);  //CE

	} //main close

	static void add(int a) {
		System.out.println("add is executed");
	}
}