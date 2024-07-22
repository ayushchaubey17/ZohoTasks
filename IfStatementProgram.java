public class IfStatementProgram {
    public static void main(String[] args) {

        int variableOutside = 30;
        if (true) {
            int variableInside = 20;

            System.out.println(variableInside);

//            can find Symbol variableOutside
            System.out.println(variableOutside);
        }



        System.out.println(variableOutside);


//            cannot find Symbol variableInside
//        System.out.println(variableInside);

    }
}
