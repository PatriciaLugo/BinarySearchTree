public class Listing {
    private String name;
    private String address;
    private String number;

    public Listing(String n,String a,String num)
    {
        name = n;
        address = a;
        number = num;
    }

    public String toString()
    {
        return("Name: "+name+"\n"+"Address: "+address+"\n"+"GPA: "+number+"\n" );
    }

    public Listing deepCopy()
    {
        Listing clone = new Listing(name,address, number);
        return clone;
    }

    public int compareTo(String targetKey)
    {
        return(name.compareToIgnoreCase(targetKey));
    }
    public void setAddress(String a)
    {
        address = a;
    }

    public String getName()
    {
        return name;
    }
}
