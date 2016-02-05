package schlomer;

/**
 * Created by daniel on 2/4/16.
 */
public class CustomerDB
{
    public Customer customerFinder (int customerNumber)
    {
        if (customerNumber == 1001)
        {
            Customer Barbara = new Customer();
            Barbara.setName("Barbara White");
            Barbara.setAddress("3400 Richmond Parkway #3423");
            Barbara.setCity("Bristol");
            Barbara.setState("CT");
            Barbara.setPostalCode(06010);
            return Barbara;
        }
        return null;
    }
}