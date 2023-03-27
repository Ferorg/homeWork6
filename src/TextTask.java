

public class TextTask {
    //Task 2.1
    static String insertASubstringAfterTheIndexK(String text,int k,String substring){
        String[] wordsMass=text.split(" ");
        int s=k+1;

        for(int i=0;i<wordsMass.length;i++){
            if(wordsMass[i].length()>k){
                StringBuilder obj=new StringBuilder(wordsMass[i]);
                wordsMass[i]= String.valueOf(obj.insert(s,substring));
            }
        }
        String newText=String.join(" ",wordsMass);
        System.out.println(newText);

        return newText;
    }
    //Task 2.2
     static String insertTheSpecifiedWord(String text,String substring,String words){
        String[] wordsMass=text.split(" ");
        for(int i=0; i<wordsMass.length;i++) {
            String[] letter = wordsMass[i].split("");
            String tempWrods;
            int s= 0;
            boolean flagPunctuationMark = false;
            if (letter.length >= substring.length()) {
                if ((letter[letter.length - 1].equals(",")) || (letter[letter.length - 1].equals(".")) || (letter[letter.length - 1].equals("!")) || (letter[letter.length - 1].equals("?"))|| (letter[letter.length - 1].equals(")"))) {
                    tempWrods = wordsMass[i].substring(0, wordsMass[i].length() - 1);
                    tempWrods = tempWrods.substring(tempWrods.length() - substring.length());
                    flagPunctuationMark = true;
                    s=wordsMass[i].length()-1;
                } else {
                    tempWrods = wordsMass[i].substring(wordsMass[i].length() - substring.length());
                    flagPunctuationMark = false;
                }
                    if (tempWrods.equals(substring)) {
                        if (flagPunctuationMark) {
                            StringBuilder obj = new StringBuilder(wordsMass[i]);
                            wordsMass[i]= String.valueOf(obj.insert(s,words));
                        } else {
                            StringBuilder obj = new StringBuilder(wordsMass[i]);
                            wordsMass[i] = wordsMass[i]+words;
                        }
                }
            }
        }
        String newText=String.join(" ",wordsMass);
        System.out.println(newText);
        return newText;
    }
   //Task3.1
    static String removeAllNonLetterCharacters(String text){
        String[] massWords=text.split("");
       String pat="[[\\W\\d]&&[\\S]&&[^А-Яа-яA-Za-z]]";
        for(int i=0;i< massWords.length;i++) {
            massWords[i]=massWords[i].replaceAll(pat,"");
        }
        String newText=String.join(" ",massWords);
        System.out.println(newText);
        return newText;
    }
}
