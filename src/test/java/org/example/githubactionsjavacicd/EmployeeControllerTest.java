// package org.example.githubactionsjavacicd;


// import org.example.githubactionsjavacicd.model.Employee;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.web.client.TestRestTemplate;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.test.context.TestPropertySource;
// import org.springframework.test.context.jdbc.Sql;
// import org.springframework.test.context.junit4.SpringRunner;

// import java.util.List;

// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotNull;

// @RunWith(SpringRunner.class)
// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @TestPropertySource(locations = "classpath:test.properties")
// @Sql({ "classpath:init-data.sql" })
// public class EmployeeControllerTest {

//     @Autowired
//     private TestRestTemplate restTemplate;

//     private static final String URL = "/employee/";

//     @Test
//     public void testAddEmployee() throws Exception {

//         // prepare
//         Employee employee = new Employee("bytes", "tree", "developer", 12000);

//         // execute
//         ResponseEntity<Employee> responseEntity = restTemplate.postForEntity(URL, employee, Employee.class);

//         // collect Response
//         int status = responseEntity.getStatusCodeValue();
//         Employee resultEmployee = responseEntity.getBody();

//         // verify
//         assertEquals("Incorrect Response Status", HttpStatus.CREATED.value(), status);

//         assertNotNull(resultEmployee);
//         assertNotNull(resultEmployee.getId().longValue());

//     }

//     @Test
//     public void testGetAllEmployee() throws Exception {

//         // prepare
//         // Not required as data.sql will insert one record which will be
//         // fetched by this Restful web service call

//         // execute
//         ResponseEntity<List> responseEntity = restTemplate.getForEntity(URL, List.class);

//         // collect response
//         int status = responseEntity.getStatusCodeValue();
//         List<Employee> empListResult = null;
//         if (responseEntity.getBody() != null) {
//             empListResult = responseEntity.getBody();
//         }

//         // verify
//         assertEquals("Incorrect Response Status", HttpStatus.OK.value(), status);

//         assertNotNull("Employees not found", empListResult);
//         assertEquals("Incorrect Employee List", 1, empListResult.size());

//     }
// }
