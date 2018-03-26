
public class Driver {
    public static void main(String... args){
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

        AffineCipher ac = new AffineCipher();
        String cipher = ac.encrypt(text);
        String deciphered = ac.decrypt(cipher);

        System.out.println("Source : " + text + "\n\n");
        System.out.println("Encrypted : " + cipher + "\n\n");
        System.out.println("Decrypted : " + deciphered + "\n\n");


    }
}
