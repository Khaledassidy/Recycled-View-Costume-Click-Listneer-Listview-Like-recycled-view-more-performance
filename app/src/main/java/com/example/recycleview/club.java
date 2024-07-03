package com.example.recycleview;

public class club {
    private String title_team;
    private String num_cubs;

    public club(String title_team, String num_cubs) {
        this.title_team = title_team;
        this.num_cubs = num_cubs;
    }


    public String getTitle_team() {
        return title_team;
    }

    public void setTitle_team(String title_team) {
        this.title_team = title_team;
    }

    public String getNum_cubs() {
        return num_cubs;
    }

    public void setNum_cubs(String num_cubs) {
        this.num_cubs = num_cubs;
    }
}
