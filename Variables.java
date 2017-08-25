public class Variables {
        public static void main(String[] args) {
                String this_is_a_variable = "this is a string";
                String thisIsAVariable = "more data";
                
                // <-- This is a comment. Anything on this line
                // or this line will be ignored by the compiler.
                // You never have to copy comments down when typing
                // the code snippets out for yourself, but feel free
                // to if you'd like ¯\_(ツ)_/¯
                
                // You can technically capitalize any character
                // in the variable name, but this is not advised,
                // as in professional code, all capital letters mean
                // the variable is a constant.
                String OUR3RDVARIABLE = "yep, more data";
                
                /*
                    This style of capitalization is also
                    recommended against, as its reserved for
                    class names, like the name of this class,
                    "Strings."
                    
                    And this is a multiline comment. Anything
                    between the first asterisk and the last
                    will be ignored by the compiler.
                */
                String VariableNumberFour = this_is_a_variable;
                String partOne = "I'm part one, and ";
                String partTwo = "this is part two.";
                
                System.out.println(this_is_a_variable);
                System.out.println(thisIsAVariable);
                System.out.println(OUR3RDVARIABLE);
                
                System.out.println(partOne + partTwo);
                System.out.print(this_is_a_variable + " and " + thisIsAVariable + ", and ");
                System.out.println(VariableNumberFour);
        }
}
