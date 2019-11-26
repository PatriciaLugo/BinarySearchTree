public class Node
{
    Node left,right;
    Listing data;

    public Node (Listing listing)
    {
        left = null;
        right = null;
        data = listing;
    }

    public void setLeft(Node n)
    {
        left = n;
    }

    public void setRight(Node n)
    {
        right = n;
    }
    public Node getLeft()
    {
        return left;
    }
    public Node getRight()
    {
        return right;
    }
    public void setData(Listing listing)
    {
        data = listing;
    }
    public Listing getData()
    {
        return data;
    }


}
