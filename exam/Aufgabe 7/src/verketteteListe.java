class Elem {
    public int value;
    public ELem next;
}


class List{
    ELem anchor;
    public double average(){
        int laenge = 1 ; //1
        int summe = anchor.value; //2
        ELem temp = anchor; //3
        while (temp.next != null ){ //4 != 5
            summe += temp.next.value; //6
            laenge += 1; //7
            temp = temp.next;  //8.9
        }
        return (double) summe/laenge;
    }

}