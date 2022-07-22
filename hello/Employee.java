class Employee{
		String afirstname;
		String alastname;
		double amonthlysalary;
		public Employee(String afirstname,String alastname,double amonthlysalary) {
			this.afirstname = afirstname;
			this.alastname = alastname;
			this.amonthlysalary = amonthlysalary;
		}	
		void setName(String afirstname) {
			this.afirstname = afirstname;
		}
		String getName() {
			return afirstname;
		}
		void setLastName(String alastname) {
				
			this.alastname = alastname;
		}	
		String getLastName() {
				
			return alastname;
		}
		void setSalary(double amonthlysalary) {
				
			this.amonthlysalary = amonthlysalary;
		}
		double getSalary() {
				
			return amonthlysalary;
		}
	}