package fightinggame.domain;

import java.util.Random;

public class User {
    private String username;
    private String password;
    private String id;
    private boolean status ;

    public User() {
        this.id = createId();
        this.status = true;
    }

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }
    public String createId() {
        StringBuilder sb = new StringBuilder("fight");
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int num=random.nextInt(10);
            sb.append(num );
        }
        return sb.toString();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
