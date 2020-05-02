public class Language {
    String name;
    int numSpeakers;
    String regionsSpoken;
    String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;


    }

    public Language() {

    }

    public void getInfo() {
        System.out.println(name +
                " is spoken by " + numSpeakers +
                " people mainly in " + regionsSpoken +
                ". \n The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
        Language Akatek = new Mayan("Akatek", 45300);


        SinoTibetan MandarinChinese = new SinoTibetan("Mandarin Chinese", 1300000000);


        SinoTibetan Burmese = new SinoTibetan("Burmese", 23000000);

    }
}