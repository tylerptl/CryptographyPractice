
public class Driver {
    public static void main(String... args){
        CaesarCipher cc = new CaesarCipher();

        String text = "It was the best of times, it was the worst of times, it was\n" +
                "the age of wisdom, it was the age of foolishness, it was the\n" +
                "epoch of belief, it was the epoch of incredulity, it was the\n" +
                "season of Light, it was the season of Darkness, it was the\n" +
                "spring of hope, it was the winter of despair, we had\n" +
                "everything before us, we had nothing before us, we were\n" +
                "all going direct to Heaven, we were all going direct the\n" +
                "other way—in short, the period was so far like the present\n" +
                "period, that some of its noisiest authorities insisted on its\n" +
                "being received, for good or for evil, in the superlative\n" +
                "degree of comparison only. ";
        int shift = 4;
        String encrypted = cc.encrypt(text, shift).toString();


        System.out.println("Decrypting now....");
        cc.freqAnalysis(encrypted);

        String decrypted = cc.encrypt(encrypted,26-shift).toString();
        System.out.print("\n\n\n");

        System.out.println("Decrypted text: " + decrypted);
    }
}
