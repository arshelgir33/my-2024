public class Main {

    public static void main(String[] args){
        generate psd_gen = new generate(8,3,5);
        psd_gen.loadLetters();
        psd_gen.loadNumbers();
        System.out.println("Random psd generated: "+psd_gen.mainAlg());
    }
}