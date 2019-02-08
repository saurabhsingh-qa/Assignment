/**
 * MVCPattern
 */
 public class MVCPattern  
 { 
     public static void main(String[] args)  
     { 
         Employee model  = retriveEmployeeFromDatabase(); 
   
         EmployeeView view = new EmployeeView(); 
   
         EmployeeController controller = new EmployeeController(model, view); 
   
         controller.updateView(); 
   
         controller.setEmployeeName("Harshit Tomar");
         controller.setEmployeeId("4713");  
   
         controller.updateView(); 
     } 
   
     private static Employee retriveEmployeeFromDatabase() 
     { 
         Employee emp = new Employee(); 
         emp.setName("Saurabh Singh"); 
         emp.setEmpId("4174"); 
         return emp; 
     } 
       
 }
  class Employee {

    private String empId;
    private String name;
    public String getEmpId()
    {
        return empId;
    }

    public void setEmpId(String empId)
    {
        this.empId = empId;

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

class EmployeeView{
    public void printEmployeeDetails(String employeeName, String employeeId)
    {
        System.out.println("Employee:");
        System.out.println("Name: " + employeeName);
        System.out.println("Employee Id: " + employeeId);
    }
}


class EmployeeController  
{ 
    private Employee model; 
    private EmployeeView view; 
  
    public EmployeeController(Employee model, EmployeeView view) 
    { 
        this.model = model; 
        this.view = view; 
    } 
  
    public void setEmployeeName(String name) 
    { 
        model.setName(name);         
    } 
  
    public String getEmployeeName() 
    { 
        return model.getName();         
    } 
  
    public void setEmployeeId(String empId) 
    { 
        model.setEmpId(empId);         
    } 
  
    public String getEmployeeId() 
    { 
        return model.getEmpId();         
    } 
  
    public void updateView() 
    {                 
        view.printEmployeeDetails(model.getName(), model.getEmpId()); 
    }     
} 
  
