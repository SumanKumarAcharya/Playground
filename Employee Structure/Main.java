#include <stdio.h>
#include <stdlib.h>
 
typedef struct{
 
    char name[30];
    int id;
    int salary;
    int age;
   char designation[30];
 
} Employee;
 
int main()
{
    int i, n=2;
 
    Employee employees[n];
 
    //Taking each employee detail as input
        //Name
        printf("Enter name: \n");
        scanf("%s",employees[i].name);
        //ID
        printf("Enter ID: \n");
        scanf("%d",&employees[i].id);
      //age
       printf("Enter age: \n");
        scanf("%d",&employees[i].age);
      //designation
      printf("Enter designation: \n");
        scanf("%s",employees[i].designation);
        //Salary
        printf("Enter Salary: \n");
        scanf("%d",&employees[i].salary);
 
    //Displaying Employee details
 
    printf("Employee Details\n");
 
    
 
        printf("Name of the Employee : ");
        printf("%s \n",employees[i].name);
 
        printf("ID of the Employee : ");
        printf("%d \n",employees[i].id);
 
      printf("Age of the Employee : ");
        printf("%d\n",employees[i].age);
      
       printf("Designation of the Employee : ");
        printf("%s\n",employees[i].designation);
      
        printf("Salary of the Employee : ");
        printf("%d\n",employees[i].salary);
 
    return 0;
 
}