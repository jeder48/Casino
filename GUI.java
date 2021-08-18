package Poker;

import java.util.Scanner;

public class GUI {

    private Game game;
    private Player[] players;

    private Scanner scan = new Scanner(System.in);

    public GUI(){

    }

    public void menu(){
        System.out.println("Menu: ");
        System.out.println("Spielmodi: ");
        System.out.println(" [1] Einzelspieler");
        System.out.println(" [2] online Mehrspieler");
        System.out.println(" [3] lokales Mehrspieler");

        int in = scan.nextInt();
        if(in==1){
            Main.startEinzelspieler();
        }
    }

    public void gameStarted(Game game, Player[] players){
        this.game = game;
        this.players = players;

        System.out.println("######################| Game starts |######################");
        System.out.println("Es spielen mit:");
        for(int i=0; i<players.length; i++){
            System.out.println("  "+players[i].getName());
        }
    }

    public void newRound(){
        System.out.println("nächste Runde \nKarten in der Mitte:")
        Card[] c = game.getCards();
        for(int i=0; i<c.length; i++){
            if(c[i]!=null){
                System.out.println(c[i].toString());
            } else {
                System.out.println("noch verdeckt");
            }
        } 
    }

    public void playersTurn(Player activePlayer){
        System.out.println(activePlayer.getName() +" ist am Zug.");
        Player p;
        boolean b = true;
		while(b) {
			System.out.println("+----------------------+");
			System.out.println("|Do you want to:       |");

			//there is no player before this player this round
			if(p == null) {
				//check
				System.out.println("|+ check	       |");

				//bet
				System.out.println("|+ bet		       |");

				//fold
				System.out.println("|+ fold		       |");

				//all in
				System.out.println("|+ allIn	       |");
			}else {
				if(p.getBet() <= getAssets() && !p.isAllIn()) {
					//call
					System.out.println("|+ call	           |");

					//raise
					System.out.println("|+ raise	       |");
			    }

				//fold
				System.out.println("|+ fold	       	   |");

				//all in
				System.out.println("|+ allIn	       |");
			}
			System.out.print("[" + name + "] chooses: ");
			String s = sc.next();
			System.out.println("+----------------------+");

			switch(s) {
				case "call":
					game.call();		
				break;
				case "raise":
					game.raise();
				break;
				case "fold":
						
                break;
				case "allIn":
							
                break;
				case "check":
							
				break;
				case "bet":
							
				break;
			}
		}
    }

    public void botMovement(){

    }

    public void gameEnd(){

    }
}
