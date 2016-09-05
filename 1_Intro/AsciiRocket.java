public class AsciiRocket {
    public static void main(String[] args) {
        drawRocket();
    }

    public static void drawRocket() {
        drawCone();
        drawBox();
        drawTail();
        System.out.println();
    }

    public static void drawCone() {
        System.out.println("     ^     ");
        System.out.println("    / \\   ");
        System.out.println("   /   \\  ");
        System.out.println("  /     \\ ");
        System.out.println(" /       \\");
        System.out.println("/_________\\");
    }

    public static void drawBox() {
        System.out.println(" |=======|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@    |");
        System.out.println(" |@@@ USA|");
        System.out.println(" |@@@    |");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |@@@@@@@|");
        System.out.println(" |=======|");
    }

    public static void drawTail() {
        System.out.println("  ))))((( ");
        System.out.println("  / / \\ \\ ");
        System.out.println(" / /   \\ \\ ");
        System.out.println(" ^^^^^^^^^ ");
        System.out.println("  |     | ");
        System.out.println("  * *** * ");
        System.out.println("  * * *** ");
        System.out.println("  ** **** ");
        System.out.println(" *** ** **");
        System.out.println("  * *** * *");
        System.out.println(" * * ** ***");
        System.out.println("  * * *** *");
        System.out.println(" *** ** ** *");
        System.out.println("  * *** * **");
        System.out.println("** * ** * **");
    }

}
