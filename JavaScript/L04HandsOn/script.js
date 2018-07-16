class Employee {
    constructor(name, salary, hireDate) {
      this.name = name;
      this.salary = salary;
      this.hireDate = hireDate;
    }
    getName() {
      console.log(this.name.toUpperCase());
    }
    getSalary() {
      console.log(this.salary);
    }
    getHireDate() {
      console.log(this.hireDate);
    }
  }

  class Manager extends Employee {
       constructor (jobDescription, yearsExperience, degreeCompleted){
        this.jobDescription= jobDescription;
        this.yearsExperience= yearsExperience;
        this.degreeCompleted= true || false; 
  }
  getjobDescription() {
    console.log(this.jobDescription.toUpperCase());
  }
  getyearsExperience() {
    console.log(this.yearsExperience);
  }
  getdegreeCompleted() {
    console.log(this.degreeCompleted);
   }
}

class Designer extends Employee {
    constructor (jobDescription, yearsExperience, degreeCompleted){
     this.jobDescription= jobDescription;
     this.yearsExperience= yearsExperience;
     this.degreeCompleted= true || false; 
}
getjobDescription() {
 console.log(this.jobDescription.toUpperCase());
}
getyearsExperience() {
 console.log(this.yearsExperience);
}
getdegreeCompleted() {
 console.log(this.degreeCompleted);
   }
}

class SalesAssociate extends Employee {
    constructor (jobDescription, yearsExperience, degreeCompleted){
     this.jobDescription= jobDescription;
     this.yearsExperience= yearsExperience;
     this.degreeCompleted= true || false; 
}
getjobDescription() {
 console.log(this.jobDescription.toUpperCase());
}
getyearsExperience() {
 console.log(this.yearsExperience);
}
getdegreeCompleted() {
 console.log(this.degreeCompleted);
   }
}
let Jim= new.Employee (this.name="Jim", 15 , 12);

document.write(Jim);

