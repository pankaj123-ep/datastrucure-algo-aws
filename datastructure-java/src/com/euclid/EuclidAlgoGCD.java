package com.euclid;




public class EuclidAlgoGCD {
	
	/*
	 * divide m by n and remainder be r
	 * if r equal 0 ,n will be gcd
	 * m=n,n=remainder
	 * return m,n
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(GcdUclidAlgo(25, 10));

	}
	
	static int GcdUclidAlgo(int m,int n)
	{
		
		int remender=m/n;
		if(remender==0)
			return n;
		m=n;
		n=remender;
		return GcdUclidAlgo(m, n);
		
	}
	
	

}
