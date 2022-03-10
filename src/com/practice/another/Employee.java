package com.practice.another;

public class Employee implements Comparable<Employee>{
	public String name;
	public int eid;
	
	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Employee o) {
		int eid1 = this.eid;
		int eid2 = o.eid;
		
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return +1;
		else
			return 0;
	}
}
