package Chapter_16_a_01;

/*Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
        otherwise. An empty list is considered to be sorted.
*/
public class Exercise_03_a
{
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(1);
        list.add(8);
        list.add(4);
        list.add(2);

        System.out.println(isSorted(list));
    }

    public static boolean isSorted(LinkedIntList list)
    {
        boolean sorted = false;

        int value = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) >= value)
            {
                value = list.get(i);
                sorted = true;
            }
            else
                {
                sorted = false;
                }

        }
        return sorted;
    }
}
