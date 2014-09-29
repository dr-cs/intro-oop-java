importjava.io.File;

publicclassBadCompany{

privateHourlyEmployee[]hourlyEmployees;
privateintnumHourlyEmployees;
privateSalariedEmployee[]salariedEmployees;
privateintnumSalariedEmployees;

publicBadCompany(StringemployeeDataFile){
hourlyEmployees=newHourlyEmployee[10];
salariedEmployees=newSalariedEmployee[10];
loadEmployeesFromFile(newFile(employeeDataFile));
}

publicdoublemonthlyPayroll(){
doublepayroll=0.0;
for(inti=0;i<numHourlyEmployees;++i){
payroll+=hourlyEmployees[i].monthlyPay();
}
for(inti=0;i<numSalariedEmployees;++i){
payroll+=salariedEmployees[i].monthlyPay();
}
returnpayroll;
}

privatevoidloadEmployeesFromFile(FileempData){

}
}
