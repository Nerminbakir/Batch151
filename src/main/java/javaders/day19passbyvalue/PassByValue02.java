package javaders.day19passbyvalue;

public class PassByValue02 {
    public static void main(String[] args) {

            String name = "Tom Hanks";
            System.out.println(name);

            String updatedName = updateName(name,"ali");
            System.out.println(updatedName);//Tom Hanks ali
            System.out.println(name);//Tom Hanks
            name =  updateName(name,"senior");
            System.out.println(name);

        }
        public static String updateName (String name, String add){
            name = name+ " " + add;
            return name;
        }// method olusturduk





    }


