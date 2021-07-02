public class Ex04 {
    // public static void main(String[] args) {
    //     Ex04.printMovieFromNumber(3);
    //     Ex04.printMovieFromNumber(6);
    //     Ex04.printMovieFromNumber(23);
    //     Ex04.printMovieFromNumber(28);
    //     Ex04.printMovieFromNumber(7);
    // }

    public static void printMovieFromNbr(int nbr) {
        switch (nbr) {
            case 3:
                System.out.println("The Three Brothers");
                break;
            case 6:
                System.out.println("The Sixth Sense");
                break;
            case 23:
                System.out.println("The Number 23");
                break;
            case 28:
                System.out.println("28 Days Later");
                break;
            default:
                System.out.println("I don't know.");
        }
    }
}
