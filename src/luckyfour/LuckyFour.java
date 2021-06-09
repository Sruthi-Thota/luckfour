/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luckyfour;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int count=0;
		    String str=Integer.toString(n);
		    for(int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i)=='4')
		            count++;
		    }
                    t--;
		    System.out.println(count);
		}
	}
}