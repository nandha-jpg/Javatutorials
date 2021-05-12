public class forloopdemo {

    //int row=0;
    //int column=0;
    public static void main(String[] args) {

        for (int row = 1; row <= 3; row++) {
            {
                for (int column=0; column<=3; column ++)
                {
                    System.out.println("the column value is "+column);
                }
            }
            System.out.println("the value of row is " + row);
        }

    }
}
