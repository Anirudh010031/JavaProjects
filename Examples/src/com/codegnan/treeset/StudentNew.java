package com.codegnan.treeset;

public class StudentNew implements Comparable<StudentNew> {

		int id;
		String name;
		public StudentNew(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		@Override
		public String toString() {
			return "ID:" + id +  " Name: " + name ;
		}
		@Override
		public int compareTo(StudentNew s) {
			//sorting based on id
			if(this.id>s.id) {
				return 1;
			}
			else if(this.id<s.id) {
				return -1;
			}
			else {
				return 0;
			}
		}

	}

