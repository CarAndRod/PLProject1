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
        if (customerNumber == 1002)
        {
            Customer Karl = new Customer();
            Karl.setName("Karl Vang");
            Karl.setAddress("327 Franklin Street");
            Karl.setCity("Edina");
            Karl.setState("MN");
            Karl.setPostalCode(55435);
            return Karl;
        }
        if (customerNumber == 1003)
        {
            Customer Ronda = new Customer();
            Ronda.setName("Ronda Chavan");
            Ronda.setAddress("518 Commanche Dr.");
            Ronda.setCity("Greensboro");
            Ronda.setState("NC");
            Ronda.setPostalCode(27410);
            return Ronda;
        }
        return null;
    }
}