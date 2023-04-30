# job_search_Portal

java project using annotation validation Enum crudRpository 

## Framework and language used
* Springboot
* java

## dependency used
 * dev
 * web
 * lombok
 * h2-database
 * jpa
 * spring boot starter data jpa 

## Data Flow

### Model
* Users
   *   private Long id;
   *   private String title;
   *   private String description;
   *   private String location;
   *   private Double salary;
   *   private String companyName;
   *   private String employerName;
   *   private <Some-Enum> jobType;
*Enum JobType  
   * hr
   * it
   * sales
   * marketing
### UserController
* @GetMapping  
    * AllUsers
    * getUsers/{employName}
    * SortedSalary
* @PostMapping
    * AddUsers
* @DeleteMapping
   * deleteUsers/{id}

### UsersService
 *  getAllUsers
 *  addUsers
 *  fetchUserByName
 *  removeUserById
 *  getAllUsersSortedSalary

### UserRepository
* findAll
* saveAll
* findByEmployName
* deleteById
* findUsersOrderedBySalaryASC

### Database used
* h2 datbase as dependency

##  About Project
* this Project is the about information about user like id,title,descxription, location,salary,companyname, employname,job type 

