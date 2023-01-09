public class Part3 {
    Boolean twoOccurances(String stringa, String stringb){
        int firstOccurance = stringa.indexOf(stringb);
        stringa = stringa.substring(firstOccurance+stringb.length());
        int secountOccurance = stringa.indexOf(stringb);
        System.out.println(firstOccurance);
        System.out.println(secountOccurance+firstOccurance);
        return true;
    }
    public static void main(String[] args){
        Part3 p3 = new Part3();
        System.out.println(p3.twoOccurances("babybyebabybyebaby", "bye"));
    }
}