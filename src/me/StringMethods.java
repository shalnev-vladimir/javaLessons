package me;

public class StringMethods {

    public void firstConstructor() {
        char[] chars = {'i', 'n', 'u'};
        String s = new String(chars);
        System.out.println(s);
    }

    public void secondConstructor() {
        char[] toshiba = {'t', 'o', 's', 'h', 'i', 'b', 'a'};
        // переменная; индекс, с которого начать; кол-во символов
        String toshibaString = new String(toshiba, 2, 5);
        System.out.println(toshibaString);
    }

    public void thirdConstructor() {
        char[] shibaInu = {'s', 'h', 'i', 'b', 'a', '-', 'i', 'n', 'u'};
        String myDod = new String(shibaInu);
        String pet = new String(myDod); // проще String pet = myDog
        System.out.println(pet);
    }

    public void asciiConstructor() {
        // здесь ascii - это массив байтов
        byte[] ascii = {65, 66, 67, 68, 69, 70};
        String asciiString = new String(ascii);
        System.out.println(asciiString);
    }

}