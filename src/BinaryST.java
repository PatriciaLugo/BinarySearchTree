import java.util.Scanner;

public class BinaryST
{
    private Node root;

    public BinaryST()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void insert(Listing data)
    {
        root = insert(root,data);
    }
    private Node insert(Node node,Listing data)
    {
        if(node == null)
            node = new Node(data);
        else
        {
            if(data.compareTo(node.getData().getName())<=0)
                node.left = insert(node.left,data);
            else node.right = insert(node.right,data);
        }
        return node;
    }
    public void delete(String k)
    {
        if(isEmpty())
            System.out.println("Empty tree");
        else if(search(k)==false)
            System.out.println(k+" not found");
        else
        {
            root=delete(root,k);
            System.out.println(k+" deleted");
        }
    }

    private Node delete(Node root,String k)
    {
        Node p,p2,n;
        if(root.getData().getName().equalsIgnoreCase(k))
        {
            Node lt,rt;
            lt = root.getLeft();
            rt = root.getRight();
            if(lt==null&&rt==null)
                return null;
            else if (lt == null)
            {
                p=rt;
                return p;
            }
            else if(rt==null)
            {
                p=lt;
                return p;
            }
            else
            {
                p2=rt;
                p=rt;
                while(p.getLeft()!=null)
                    p=p.getLeft();
                p.setLeft(lt);
                return p2;
            }
        }
        if(k.compareTo(root.getData().getName())<0)
        {
            n = delete(root.getLeft(),k);
            root.setLeft(n);
        }
        else
        {
            n = delete(root.getRight(),k);
            root.setRight(n);
        }
        return root;
    }

    public int countNodes()
    {
        return countNodes(root);
    }
    private int countNodes(Node r)
    {
        if (r==null)
            return 0;
        else
        {
            int l =1;
            l+=countNodes(r.getLeft());
            l+=countNodes(r.getRight());
            return l;
        }
    }
    public boolean search(String val)
    {
        return search(root, val);
    }
    private boolean search(Node r, String val)
    {
        boolean found = false;
        while((r!=null)&&!found)
        {
            String rval = r.getData().getName();
            if(val.compareTo(rval)<0)
                r=r.getLeft();
            else if(val.compareTo(rval)>0)
                r=r.getRight();
            else
            {
                System.out.println("Results: \n");
                System.out.println(r.data);
                found=true;
                break;
            }
            found=search(r,val);
        }
        return found;
    }
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if(r!= null)
        {
            System.out.print(r.getData());
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
}
