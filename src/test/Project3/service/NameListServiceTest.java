package test.Project3.service;

import Project3.domain.Employee;
import Project3.service.NameListService;
import Project3.service.TeamException;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * NameListService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>11月 18, 2020</pre>
 */
public class NameListServiceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: createquipment(int i)
     */
    @Test
    public void testCreatequipment() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAllEmployees()
     */
    @Test
    public void testGetAllEmployees() throws Exception {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
//        System.out.println(employees[0]);
//TODO: Test goes here... 
    }

    /**
     * Method: getEmployees(int id)
     */
    @Test
    public void testGetEmployees() throws Exception {

        NameListService service =new NameListService();
        int id =100;
        try{
            Employee employee = service.getEmployees(id);
            System.out.println(employee);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }
//TODO: Test goes here... 
    }


} 
