/*
EX NO: 10	
    PROGRAM TO FIND THE MAXIMUM VALUE FROM THE GIVEN TYPE OF ELEMENTS USING GENERICS

AIM
    To write a java program to find the maximum value from the given type of elements using a generic function. 

PROCEDURE
1.Create a class Myclass to implement generic class and generic methods.
2.Get the set of the values belonging to specific data type.
3.Create the objects of the class to hold integer,character and double values.
4.Create the method to compare the values and  find the maximum value stored in the array.
5.Invoke the method with integer, character or double values . The output will be displayed 
   based on the data type passed to the method.
PROGRAM
*/
class MyClass<T extends Comparable<T>>
{
    T[] vals;
    MyClass(T[] o) 
    { 
        vals = o;
    } 
    public T min()
    {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
        if(vals[i].compareTo(v) < 0) 
        v = vals[i];
        return v;
    }
    public T max() 
    {
        T v = vals[0];
        for(int i=1; i < vals.length;i++)
        if(vals[i].compareTo(v) > 0) 
        v = vals[i];
        return v;
    }
}
class gendemo 
{
    public static void main(String args[])
    {
        int i;
        Integer inums[] = { 10,4,5,6,2,1 };
        Character chs[] = { 'v','r','s','e','n','s' }; 
        Double      d[] = { 26.6,65.6,63.6,83.3,44.4,14.8 };
        MyClass<Integer> iob    = new MyClass<Integer>(inums);
        MyClass<Character> cob  = new MyClass<Character>(chs);
        MyClass<Double>dob      = new MyClass<Double>(d);
        System.out.println("inums - Max : " + iob.max() + "\t Min : " + iob.min());
        System.out.println("chs   - Max : " + cob.max() + "\t Min : " + cob.min());
        System.out.println("chs   - Max : " + dob.max() + "\t Min : " + dob.min());
    }
}