public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Recursive: "+ reverse("akond"));

        System.out.println("ForLoop: "+reverseLoop("akonds"));
    }

    public static String reverse( String word){

        if(word.length()<2){
            return word;
        }
        return reverse(word.substring(1))+word.charAt(0);
    }

    public static StringBuilder reverseLoop(String word){

        StringBuilder sb = new StringBuilder();

        for (int i=word.length()-1; i>=0; i--)
            sb.append(word.charAt(i));
        return sb;
    }
}
