package _18Sept2019;

import java.util.Scanner;

class playerdetails {
    private String name;
    private String uname;
    private String level;
    private int highscore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;

    }

    @Override
    public String toString() {
        return String.format("%10s\t%10s\t%10s\t%10d\n", getName(), getUname(), getLevel(), getHighscore());
    }

    public playerdetails(String name, String uname, String level, int highscore) {
        setName(name);
        setUname(uname);
        setLevel(level);
        setHighscore(highscore);
    }

}
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noPlayer = input.nextInt();
        input.nextLine();
        if (noPlayer > 0 && noPlayer < 100) {
            playerdetails[] pd = new playerdetails[noPlayer];
            for (int i = 0; i < noPlayer; i++) {
                String name = input.nextLine();
                String uname = input.nextLine();
                String level = input.nextLine();
                int highscore = input.nextInt();
                input.nextLine();
            }
        }
    }
}
