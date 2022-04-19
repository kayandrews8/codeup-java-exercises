public class ServerNameGenerator {
    String[] adjectives = {"loud","quiet","wet","dry","quick","slow","heavy","light","bright","dull"};
    String[] nouns = {"dog","cat","cow","bird","squirrel","book","lamp","table","phone","candle"};

    public String[] getAdjectives() {
        return adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    public static String randomElement(String[] array){
        return array[(int) Math.ceil(Math.random() * array.length -1)];
    }

    public static void main(String[] args) {
        ServerNameGenerator generator = new ServerNameGenerator();
        String adjective = randomElement(generator.getAdjectives());
        String noun = randomElement(generator.getNouns());
        System.out.printf("%s-%s",adjective,noun);

    }
}
