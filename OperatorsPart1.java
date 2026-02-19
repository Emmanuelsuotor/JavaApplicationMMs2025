public class OperatorsPart1{
	public static void main(String[] args){
		//assignment operator(=)
		int num = 50;
		System.out.printf("The value of num is %d%n",num);
		
		//Arithmetic Operators(+,-,*,/,%)
		int num1 = 100;
		int num2 = 500;
		
		int addition = num1 + num2;
		System.out.printf("the sum of %d and %d is %d",num1,num2,addition);
		
		int substraction = num1 - num2;
		System.out.printf("The difference between %d and %d%n",num1,num2,substraction);
		
		int multiplication = num1 * num2;
		System.out.printf("The product of %d is %d%n",num1,num2,multiplication);
		
		double quotient =(double)num1/num2;
		System.out.printf("The quotient of %d / %d is %f%n",num1,num2,quotient);
		
		int remainder = num1%num2;
		System.out.printf("The quotient of %d and %d is %d%n",num1,num2,remainder);
		
		
		//compound assignment operator
		num1 += num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 *= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 -= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 /= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		num1 %= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		//Relational Operators(>,<,>=,<=,!=,==)
		int number1 = 20, number2 = 50, number3 = 200;
		
		boolean isGreater = number1 > number2;
		System.out.printf("Is %d > %d? %b%n",number1,number2,isGreater);
		
		boolean isLessThan = number1 > number2;
		System.out.printf("Is %d < %d? %b%n",number1,number2,isLessThan);
		
		boolean isGreaterThanOrEqualTO = number1 > number2;
		System.out.printf("Is %d >= %d? %b%n",number1,number2,isGreaterThanOrEqualTO);
		
		boolean isLessThanOrEqualTo = number1 > number2;
		System.out.printf("Is %d <= %d? %b%n",number1,number2,isLessThanOrEqualTo);
		
		boolean NotEqualTo = number1 != number2;
		System.out.printf("Is %d != %d? %b%n",number1,number2,NotEqualTo);
		
		boolean isEqualTo = number1 == number2;
		System.out.printf("Is %d == %d? %b%n",number1,number2,isEqualTo);
		
		
		
		
		
		
		
	}
}