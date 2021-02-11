import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory=new EnemyShipFactory();
        EnemyShip theEnemy=null;

        Scanner userInput =new Scanner(System.in);//to eelect option at runtime

        System.out.println("what type of ship?(U/R/B)");
        if(userInput.hasNextLine()){
            String typeOfShip=userInput.nextLine();

            theEnemy=shipFactory.makeEnemyShip(typeOfShip);//we are using factory here instead of previous example below
        }
        if(theEnemy!=null){
            doStuffEnemy(theEnemy);
        }else{
            System.out.println("Eneter a U,R,or B next time");
        }



    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}




//import java.util.Scanner;
//
//public class EnemyShipTesting {
//    public static void main(String[] args) {
//        EnemyShip theEnemy=null;
//
//        Scanner userInput =new Scanner(System.in);//to eelect option at runtime
//
//        String enemyShipOption="";
//
//        System.out.println("what type of ship?(U/R)");
//        if(userInput.hasNextLine()){
//            enemyShipOption=userInput.nextLine();
//        }
//        if(enemyShipOption.equalsIgnoreCase("U")){
//            theEnemy= new UFOEnemyShip();
//        }else if(enemyShipOption.equalsIgnoreCase("R")){
//            theEnemy=new RocketEnemyShip();
//        }
//
//              doStuffEnemy(theEnemy);
//    }
//
//    public static void doStuffEnemy(EnemyShip anEnemyShip){
//        anEnemyShip.displayEnemyShip();
//        anEnemyShip.followHeroShip();
//        anEnemyShip.enemyShipShoots();
//    }
//}
