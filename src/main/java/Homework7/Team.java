package Homework7;

import java.util.LinkedList;

public class Team {
    private String name;
    public LinkedList<Player> players = new LinkedList<>();

    public Team(String name) {
        setName(name);
    }

    private void setName(String name) {
        if (name == null || (!name.trim().isEmpty())) {
            this.name = name;
        } else {
            System.out.println("A name should not be empty.");
        }
    }
    public String getName() {

        return name;
    }
    public void addPlayer(Player player){
        this.players.add(player);

    }
    public void removePlayer(Player player) {
            this.players.remove(player);
        }

    public void contain(Player player) {
        if (!players.contains(player)) {
        System.out.println("Player " + player.getName() + " is not in " + this.name + " team ");
        }
    }

        public void printRatingOfTeam(){
        if(players.size() == 0) {
            return;
        }

        String itemRating = "";
        for (Player player : players) {
            itemRating += player.getRating();
        }
            System.out.println(this.getName() + " - " + itemRating);
    }
}





