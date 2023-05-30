package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void AddContract(HourContract contract) {
		
		contracts.add(contract);
	}
	
	
	public void RemoveContract(HourContract contract) {
		
		contracts.remove(contract);
	}
	
	public Double income(int year, int mounth) {
		
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			
			cal.setTime(c.getDate());
			
			int c_year =  cal.get(Calendar.YEAR);
			int c_mounth = cal.get(Calendar.MONTH);
			
			if(year == c_year && mounth == c_mounth){
				sum += c.TotalValue();
			}
			
		}
		
		return sum ;
	}
	
	
	
	
	
	
}
