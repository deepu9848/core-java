package assignment.immutableclass;

// 10-What is immutable class and what are the steps that need to be followed to create the immutable class ? Give a example
//Immutable class in java means that once an object is created, we cannot change its content.
//Immutable class are also called final class.
//we use final variable.
//The class must be declared as final so that child classes can’t be created.
//Data members in the class must be declared private so that direct access is not allowed.
//Data members in the class must be declared as final so that we can’t change the value of it after object creation.
//A parameterized constructor should initialize all the fields
//It's important to keep in mind that declaring a class as final does not means that it is "immutable", this basically means that this class cannot be extended (or specialized).
//
//Immutable classes must have private and final fields (without setters),
// so after its construction, it cannot have its field values changed.

  //Creat immutable class
   final class Employee {
   //use parametarized constructor for immutable class
    private final String employeeId;
    private final String name;
    private final String address;
    private final String email;
// set getters but not setters
      public String getEmployeeId() {
          return employeeId;
      }

      public String getName() {
          return name;
      }

      public String getAddress() {
          return address;
      }

      public String getEmail() {
          return email;
      }

      public Employee(String employeeId, String name, String address, String email){
        this.employeeId = employeeId;
        this.name = name;
        this.address =address;
        this.email =email;


    }


    }



