//Nicholas Baxter
//2/4/2015
//Program that calculates equations that are written in reverse polish notation
import java.util.*;
public class ReversePolishCalculator {
	//instance variables
	private Stack<Integer> valueStack;
	//constructor
	public ReversePolishCalculator()
	{
		valueStack = new Stack<Integer>();
	}
	//other methods
	public int calculate(String anEquation)
	{
		//clears stack every time the method is run
		valueStack.clear();
		//splits the string up by the spaces and loads it into an array
		String problem[] = anEquation.split(" ");
		//This is used later to make sure the program does the math in the proper order
		int firstNum;
		for(int i = 0; i < problem.length; i++)
		{
			//checks to see that the first two entries are not operators
			if(((i < 2)&&(problem[i].equals("+")||problem[i].equals("-")||problem[i].equals("*")||problem[i].equals("/"))))
			{
				System.out.println("Error in syntax");
			}
			//checks to see if the operator is a plus sign
			else if(problem[i].equals("+"))
			{
				firstNum = valueStack.pop();
				valueStack.push(valueStack.pop() + firstNum);
			}
			//checks to see if the operator is a minus
			else if(problem[i].equals("-"))
			{
				firstNum = valueStack.pop();
				valueStack.push(valueStack.pop() - firstNum);
			}
			//checks to see if the operator is a multiplier
			else if(problem[i].equals("*"))
			{
				firstNum = valueStack.pop();
				valueStack.push(valueStack.pop() * firstNum);
			}
			//checks to see if the operator is a divider
			else if(problem[i].equals("/"))
			{
				firstNum = valueStack.pop();
				valueStack.push(valueStack.pop() / firstNum);
			}
			//if the current entry is not an operator then it is a number and should be added to the stack
			else
			{
				int num = Integer.parseInt(problem[i]);
				valueStack.push(num);
				
			}
	
		}
		//if the stack has any values left over then something went horribly wrong and if not it prints it out
		if(valueStack.size() == 1)
		{
			return valueStack.pop();
		}
		else
		{
			System.out.println("This was not properly formatted");
			return 0;
		}
	}
	//a method to print out the stack for debugging purposes
	public void printStack()
	{
		for(Integer num : valueStack)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
