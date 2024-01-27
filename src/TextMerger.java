import java.util.HashMap;

public class TextMerger {
    public static void main(String[] args) {
        String[] metinler = {"book","music","car","store","market","bottle"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < metinler.length; i++) {

            for (int j = 0; j < metinler[i].length(); j++) {
                for (int k=j+1; k < metinler[i].length()-1; k++) {
                    if (metinler[i].charAt(j) == metinler[i].charAt(k)) {
                        result.append(metinler[i] + " ");
                        break;
                    }
                }
            }

        }

        System.out.println("Repeated characters text : " + result);
        String text = result.toString();
        String temp = "";
        StringBuilder newText = new StringBuilder();
        for (int i=0; i < text.length(); i++){
            temp = newText.toString();
            if (temp.isEmpty()) {
                newText.append(text, i, 1);
            }
            else {
                if (!temp.contains(text.substring(i, i + 1)))
                    newText.append(text.charAt(i));
            }
        }
        System.out.println("New text : " + newText);
    }
}
