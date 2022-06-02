public class StringCheck {
    public static boolean areAllCharsLowerCase(char[] a, int i){
        return areAllCharsLowerCase(a, 0);
    }

    public static boolean areAllChABoolean(char[] a, int position){
        if(position < a.length ){ // 1
            if(!Character.isLowerCase(a[position])){ //2
                return false; //3
            }
            return areAllCharsLowerCase(a, ++position); //4(..,5)
        }
        return true; //6
    }
}
