package Optional;

import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {
		
		// way 1
		String str = "sanat";
		
		Optional<String> op = Optional.ofNullable(str);
		System.out.println(op.get());
		
		// way 2
		String str1 = "kumar";
		
		Optional<String> op1 = Optional.ofNullable(str1);
		
		if(op1.isPresent())
		{
			System.out.println("Value is : "+op1.get());
		}
		else
		{
			System.out.println("value is not present");
		}
		
		//way 3
		String str2 = null;
		Optional<String> op2 = Optional.ofNullable(str2);
		
		if(op2.isPresent())
		{
			System.out.println("Value is : "+op2.get());
		}
		else
		{
			String value = op2.orElse("Default value");
			System.out.println("value is not present --> "+value);
		}
		
		
		

	}

}
