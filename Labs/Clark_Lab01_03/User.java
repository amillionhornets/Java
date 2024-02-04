package Labs.Clark_Lab01_03;

class User {
    // String userId?
    private String userId;
    private String password;
    private String name;
    private String email;
    
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    // Where does user name come from?
    public boolean auth(String username,String password){
        return true;
    }
    public void register(String userId, String name, String email){
        // Add code to update DB and set userId
    }
}