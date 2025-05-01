package corejava.string;

public class ReversWord {
    public static void main(String[] args) {
        String word = "welcome to java";

        String[] split = word.split(" ");
        StringBuilder build = new StringBuilder();
        for(String str:split){
            StringBuilder buildWord = new StringBuilder();
            for(int index=str.length()-1;index>=0;index--){
                buildWord.append(str.charAt(index));
            }
            build.append(buildWord).append(" ");
        }
        System.out.println("build=="+build.toString());

        //Change each word's first letter to upper case:
        StringBuilder buildUpperCase = new StringBuilder();
        for(String str:split){
            buildUpperCase.append(Character.toUpperCase(str.charAt(0))).append(q.substring(1)).append(" ");
        }
        System.out.println("buildUpperCase=="+buildUpperCase.toString());


    }
}
