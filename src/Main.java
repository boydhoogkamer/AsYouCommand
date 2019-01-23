public class Main {

    public static void main(String[] args) {
        Igor igorHetMonster = new Igor();
        if (igorHetMonster.openDeur()==true){
            System.out.println("De deur is open");
        }
        else {
            System.out.println("De deur is dicht");
        }
    }
}
