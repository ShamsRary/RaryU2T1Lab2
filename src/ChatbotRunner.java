public class ChatbotRunner {
    public static void main(String[] args)
    {
        ChatBot chara = new ChatBot("chara", 6);
        chara.greeting("hello");
        chara.weather();
        chara.convertFeetToMeters(20);
        chara.favoriteNumber(9);
        System.out.println("hello");
        int numm = chara.addNumbers(2,9999, 4 );
        System.out.print(numm);
        numm = chara.minusNumbers(2,9999, 4 );
        System.out.print(numm);
        chara.saying("Shams");
        chara.goodbye();


    }
}
