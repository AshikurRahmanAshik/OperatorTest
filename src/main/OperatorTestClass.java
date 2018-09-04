package main;

public class OperatorTestClass {

	public int addition(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public int subtraction(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public int multiplication(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	public int division(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

	public int modulas(int i, int j) {
		// TODO Auto-generated method stub
		return i%j;
	}

	public int bitNot(int i) {
		// TODO Auto-generated method stub
		return ~i;
	}

	public int bitAnd(int i, int j) {
		// TODO Auto-generated method stub
		return i & j;
	}
	
	public int bitOr(int i, int j) {
		// TODO Auto-generated method stub
		return i | j;
	}

	public int bitExOr(int i, int j) {
		// TODO Auto-generated method stub
		return i ^ j;
	}

	public int bitShiftRight(int i, int j) {
		// TODO Auto-generated method stub
		return i>>j;
	}

	public int bitShiftLeft(int i, int j) {
		// TODO Auto-generated method stub
		return i<<j;
	}
	
	public int bitShiftRightZero(int i, int j) {
		// TODO Auto-generated method stub
		return i>>>j;
	}

	public boolean equalTo(int i, int j) {
		// TODO Auto-generated method stub
		if(i==j)
			return true;
		else
			return false;
	}

	public boolean notEqualTo(int i, int j) {
		// TODO Auto-generated method stub
		if(i!=j)
			return true;
		else
			return false;
	}

	public boolean greaterThan(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
			return true;
		else
			return false;
	}

	public boolean greaterThanOrEqual(int i, int j) {
		// TODO Auto-generated method stub
		if(i>=j)
			return true;
		else
			return false;
	}
	
	public boolean lessThan(int i, int j) {
		// TODO Auto-generated method stub
		if(i<j)
			return true;
		else
			return false;
	}

	public boolean lessThanOrEqual(int i, int j) {
		// TODO Auto-generated method stub
		if(i<=j)
			return true;
		else
			return false;
	}

	public boolean logicalNot(boolean b) {
		// TODO Auto-generated method stub
		return !b;
	}

	public boolean logicalAnd(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b&&c;
	}

	public boolean logicalOr(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b||c;
	}

	public boolean logicalExOr(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b ^ c;
	}

	public boolean shortCircuitAnd(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b && c;
	}

	public boolean shortCircuitOr(boolean b, boolean c) {
		// TODO Auto-generated method stub
		return b || c;
	}

	

	
	


	

}
