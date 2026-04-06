package com.codegnan.hashmap;


public class Student implements Comparable<Student> {
	
		int id;
		String name;
		public Student(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		@Override
		public String toString() {
			return "ID:" + id +  " Name: " + name ;
		}
		@Override
		public int compareTo(Student s) {
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



