class HelloWordTest{
	public static void main(String agrs[]){
		
		System.out.println("Hello World!");
		System.out.println("Second World!");
		System.out.println("Third");
		
		int number = 1234;
		double score = 99.99;
		float average = (float)58.00;
		String myname = "Sokna Ly";
		
		System.out.println(number);
		System.out.println(score);
		System.out.println(average);
		System.out.println(myname);
		
		int arrayOfNumber[] = {123,456,789,111,222,33};
		
		System.out.println(arrayOfNumber[0]);
		System.out.println(arrayOfNumber[3]);
		
		String arrayOfString[] = {"Sokna","Chheang","Dy","Rasy"};
		
		System.out.println(arrayOfString[0]);
		System.out.println(arrayOfString[1]);
		System.out.println(arrayOfString[2]);
		
		if(number == 123){
			System.out.println("123");
		}else{
			System.out.println("1234");
		}
		
		switch(number){
		case 1234:
			System.out.println("1234");
			break;
		case 12:
			System.out.println("12");
			break;
		default:
			System.out.println("Default");
		}
		
		for(int i=0;i<arrayOfString.length;i++){
			String output = "Index: " + i + " " +  arrayOfString[i];
			System.out.println(output);
		}
		
		for (String string : arrayOfString) {
			System.out.println("Name : " + string);
		}
		
		for(int num : arrayOfNumber){
			System.out.println("Number: " + num);
		}
		while(number==123){
			System.out.println("While is executed");
		}
		do{
			System.out.println("Do While is executed");
		}while(number==123);
	}
}