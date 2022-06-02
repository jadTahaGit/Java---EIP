public class start {

    public static void main(String[] args) {
//        String[] s = {"4", "1", "1.0", "EiP"};
//        Integer i  = 2;

//        boolean b = Double.parseDouble(s[1]) + 1 == i++;
////        System.out.println(b);

//        int i1 = (int) (i / 4.) + 1;
//        System.out.println(i1);

//        String s1 = "17" + 4 * i;
//        System.out.println("jad");

//        int[] a = new int[10];
//        a[10]=10;

//        double[][] a;
//        a[0][3] = 1.0;
////        a[3][0] = 0.0;

//        int a = null;

//        int[] a1 = {0,1,2};
//        int[] a2 = {0,1,3};
//        System.out.println(a1);
//        System.out.println(a2);
//        a2=a1;
//        System.out.println(a2);

//int a[] = {2,7};
//doSomething(a);

//        final String[] a = {"a", "b", "c"};
////        a[0] = "z";
//        System.out.println(a[a.length-2]);


//in einem übergebenen String das erste Leerzeichen finden
// und dessen Position (gezählt ab 0) zurückgeben,
//         kein Leerzeichen? -> soll -1

//String s = "asfd sadfsadf";
//findFirstSpace(s);

//        reversedTriangle(5);

//        int i=0;
//        do{
//            i++;
//            if(i==5) continue; // 5 2 times
//            System.out.println(i);
//        }
//        while(i<10);

//        doItlove(1==2, 3==4);


////        5) b)
//             Mensch max =   new Mensch("Max", 1992);
//             max.setName("jad")    ;
//        System.out.println(max.getName());
//        System.out.println(max.alter(2022));



////Aufgabe 6
//
//                  A a = new A();
//                  B b = new B();
////                  A c = new C();
//        System.out.println(b.h("x"));
//

//        System.out.println(sumUneven(4));

            try sumUneven(){}
            catch




    }

//    public static void doItlove(boolean... args){
//        System.out.println("ja");
//    }



//    public static int findFirstSpace(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == " "){
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static void reversedTriangle(int size){
//        for (int i = size; i > 0 ; i--) {
//            for (int j = -i; j <0 ; ++j) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }






//    public static void doSomething(int a[]){
//
//    }


//    public static class Mensch{
//        static private String name;
//        static private int geburtsjahr;
//
//        public Mensch(String name, int geburtsjahr){
//this.name= name;
//this.geburtsjahr = geburtsjahr;
//        }
//
//        public int alter(int aktuellesJahr) {
//            return aktuellesJahr - this.geburtsjahr;
//        }
//
//        public String
//        getName() {
//            return this.name
//                    ;
//        }
//
//        public static void setName(String name) {
//            Mensch.name = name;
//        }



       
//    }


//   public static class A{
//       public int f(){
//                      return 1;
//       }
//
//        public int g(){
//                       return 2;
//        }
//
//        public int h(){
//                       return 22;
//        }
//
//
//
//         public int h(Object o){
//                        return 12;
//         }
//
//          public int h(String s){
//                         return 15;
//          }
//
//   }
//
//      public static class B extends A {
//              public int g(){
//                             return super.h();
//              }
//
//               public int h(Object o){
//                              return 25;
//               }
//
//
//                public int f(Object o){
//                               return 40;
//      }         }
//
//
//

                

public static int sumUneven(int n){
        if(n>=0){
            if(n%2 == 0)
                return sumUneven(n-1);
            else
                return n + sumUneven(n-1);
        }
        return 0;
}
//
//Funktion<Integer, Double > multiplyByTwoPointFive = n-> n*2.5;
//
//    a.forEach()










}
