package com.epam.task.epam_task_6;

public class RemoveA {
	public String remove(String s)
	{
		int flag=0,x=2;
		String r="";
		for(int i=0;i<2;i++)
		{
			if(s.charAt(i)=='A')
			{
				flag=1;
				x=i;
			}
		}
		if(flag==1)
		{
			for(int i=x+1;i<s.length();i++)
			{
				r=r+s.charAt(i);
			}
			return r;
		}
		else
		{
			return s;
		}
	}
}
