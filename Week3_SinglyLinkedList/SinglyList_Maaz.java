package com.company;

public class SinglyList
{
    private node first;

    public SinglyList()
    {
        this.first = null;
    }

    public void insertFirst(int data) //BigO(1)
    {
        node newNode = new node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public node deleteFirst()
    {
        node temp = first;
        first = first.next;
        return temp;
    }

    public int listLength()
    {
        node current = first;
        int length = 0;
        while (current!=null)
        {
            length++;
            current = current.next;
        }
        return length;
    }

    public void insertAtLast(int data)
    {
        node current = first;
        node newNode = new node();
        newNode.data = data;
        newNode.next = first;
            do
            {
                current = current.next;
            }
            while(current==null);
            current.next = newNode;
    }

    public node deleteLast()
    {
        node current = first;
        do
        {
            node temp = first;
            first = first.next;
            return temp;
        }
        while (current==null);
    }

    public int maxValue()
    {
        node current = first;
        int temp = current.data;
        while(current!=null)
        {
           if(current.data>temp)
           {
               temp = current.data;
           }
            current = current.next;
        }
        return temp;
    }

    public int minValue()
    {
        node current = first;
        int temp=current.data;
        while(current!=null)
        {
            if(current.data<temp)
            {
                temp = current.data;
            }
            current = current.next;
        }
        return temp;
    }

    public float avg()
    {
        node current = first;
        int temp = current.data;

        float avg=0,sum=0;
        do
        {
            sum = sum + current.data;
            current = current.next;

        }while(current!=null);

        avg = sum/listLength();
        return avg;

    }

    public int product()
    {
        node current = first;
        int temp = current.data;

        int prod=1;
        do
        {
            prod = prod * current.data;
            current = current.next;

        }while(current!=null);

        return prod;

    }

    public void Odd()
    {
        node current = first;
        int temp=current.data;
        while(current!=null)
        {
            if(current.data%2!=0)
            {
                temp = current.data;
                System.out.print("\nOdd Values: "+temp);
            }
            current = current.next;
        }



    }
    public void Even()
    {
        node current = first;
        int temp=current.data;
        while(current!=null)
        {
            if(current.data%2==0)
            {
                temp = current.data;
                System.out.print("\nEven Values: "+temp);
            }
            current = current.next;
        }



    }

    public void Find(int data)
    {
        node current = first;
        boolean flag;


        while(current!=null || )
        {

            if(data== current.data)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }

            current = current.next;
        }


    }





    public void displayList() //BigO(n)
    {
        node current = first;
        while(current!=null)
        {
            current.displayNode();
            current = current.next; //Used to increase Iteration
        }
    }
}
