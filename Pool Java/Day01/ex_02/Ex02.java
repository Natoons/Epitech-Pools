class Ex02 {
    // public static void main(String[] args) {
    //     String str = Ex02.getAngryDog(3);

    //     System.out.println(str);
    // }

    public static String getAngryDog( int nbr ){
        String str = "";
        for(int i=0; i<nbr; i++){
            str += "woof";
        }
        return str;
    }
}