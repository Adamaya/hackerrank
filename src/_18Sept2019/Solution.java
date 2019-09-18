package _18Sept2019;

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
}
public class Solution {


}
